package com.greatlearning.lab3dsa.ques1;

import java.util.Stack;

public class BalanceUtility {
	
	Stack<Character> stak = new Stack<Character>();

	
	public boolean balanceCheck (String input) {
//		System.out.println(input);
        Stack<Character> stack = new Stack<Character>();
        for (char c : input.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
//                System.out.print(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
//                System.out.println();
                Character d = (Character) (stack.pop());
//                System.out.print(d);
                if ((c == '}' && d != '{') || (c == ')' && d != '(') || (c == ']' && d != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
	}
}
	

	
	
