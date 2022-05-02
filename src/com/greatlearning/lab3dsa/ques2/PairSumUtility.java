package com.greatlearning.lab3dsa.ques2;

import java.util.ArrayList;

public class PairSumUtility {
	
	
	Node treeRoot;

    PairSumUtility(){
        treeRoot = null;
    }
    
    
    public class Node {

        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }
   


    void insertTreeBranch(int data)
    {
        treeRoot = insertBranchNode(treeRoot, data);
    }

    Node insertBranchNode(Node root, int data)
    {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data)
            root.left = insertBranchNode(root.left, data);
        else if (data > root.data)
            root.right = insertBranchNode(root.right, data);

        return root;
    }

    ArrayList<Integer> convertToList(Node treeNode , ArrayList<Integer> arrayList){
        if(treeNode == null){
            return arrayList;
        }
        convertToList(treeNode.left,arrayList);
        arrayList.add(treeNode.data);
        convertToList(treeNode.right,arrayList);
        return arrayList;
    }

    boolean isPairOccurs(int sum){
        ArrayList<Integer> listOne = new ArrayList<>();
        ArrayList<Integer> listTwo = convertToList(treeRoot, listOne);
        int leftPointer = 0;
        int rightPointer = listTwo.size() - 1;
        boolean found = false;
        while(leftPointer < rightPointer && rightPointer >= 0){
            int elementOne = listTwo.get(leftPointer);
            int elementTwo = listTwo.get(rightPointer);

            if( elementOne + elementTwo  == sum){
            	System.out.println("Sum = " + sum);
                System.out.println("Pair is ("+elementOne+","+elementTwo+")");
                leftPointer++;
                rightPointer--;
                found = true;
            } else if (elementOne + elementTwo < sum) {
                leftPointer++;
            } else {
                rightPointer --;
            }

        }

        return found;
    }



}
