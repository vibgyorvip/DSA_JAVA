package programming;

import java.util.Scanner;

public class RecurssionEx1 {

	public static void main(String[] args) {
		/*
		 * System.out.println("Enter the number :");
		 * 
		 * Scanner sc = new Scanner(args[0]); int number = Integer.parseInt(args[0]);
		 */
		RecurssionEx1 rec = new RecurssionEx1();
		int result = rec.findFactorial(0);
		System.out.println("The Factorial of "+ 3 + "is "+ result );
	}

	public int findFactorial(int number)
	{   
		//unintentional cases
		if(number < 0)
			return -1;
		
		//Base Condition
		if(number == 0 || number == 1 )
			return 1;
		//Recursive Condition
		else
			return (number * findFactorial(number -1));
	}
}
