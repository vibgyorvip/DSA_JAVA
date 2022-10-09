package programming;

public class RecurssionEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RecurssionEx5 rec = new RecurssionEx5();
		System.out.println(rec.gcd(48, 18));
		
	}

	public int gcd(int m , int n)
	{
		if(m < 0 || n<0)
			return -1;
		if(n ==0)
			return m;
		
		return gcd(n,m%n);
	}
}
