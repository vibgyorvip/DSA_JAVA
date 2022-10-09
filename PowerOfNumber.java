package programming;

public class RecurssionEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecurssionEx4 rec = new RecurssionEx4();
		System.out.println(rec.power(2, 5));
		

	}

	// power of a number
	public int power(int base , int exp)
	{
		if(exp <0)
			return -1;
		
		if(exp ==0)
			return 1;
		
		return base * power(base,exp-1);
	}
}
