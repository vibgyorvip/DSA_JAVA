package programming;

public class RecurssionEx6 {

	public static void main(String[] args) {
		
		RecurssionEx6 rec = new RecurssionEx6();
		System.out.println(rec.decimalToBinary(10));
	}
	
	public int decimalToBinary(int n)
	{
		if(n ==0)
			return 0;
		
		return n%2 + 10*decimalToBinary(n/2);
	}

}
