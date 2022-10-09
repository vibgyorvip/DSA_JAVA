package programming;

public class RecurssionEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RecurssionEx3 rec = new RecurssionEx3();
		int result = rec.sumOfDigits(112);
		System.out.println("The Sum Of Digits is "+result);
	}
	
	// sum of digits
	public int sumOfDigits(int number)
	{
		if(number ==0 || number <0)
			return 0;
		else 
		return number%10 + sumOfDigits(number/10);
	}

}
