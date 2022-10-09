package programming;

public class RecurssionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecurssionEx2 rec = new RecurssionEx2();
		int number = rec.findFebonacci(3);
		System.out.println("The Febonacci of 3 is " +number);
	}

	public int findFebonacci(int number)
	{
		//unintentional case
		if(number <0)
			return -1;
		//Base Condition
		if(number == 0 || number == 1)
			return number;
		//Recursive condition
		else
			return findFebonacci(number -1) + findFebonacci(number -2);
	}
}
