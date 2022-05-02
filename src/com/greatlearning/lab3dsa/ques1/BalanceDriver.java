package com.greatlearning.lab3dsa.ques1;

public class BalanceDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean status;
		
		BalanceUtility ob = new BalanceUtility();

		String inputText = "([[{{}}{}]])";
		
		status = ob.balanceCheck(inputText);
		
		if(status) {
			System.out.println("The entered String has Balanced Brackets" );
		} else
		{

			System.out.println("The entered Strings do not contain Balanced Brackets" );
		}
	}

}
