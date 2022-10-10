package programming;


public class TimeComplexityEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeComplexityEx5 tc = new TimeComplexityEx5();
		tc.allFib(10);

	}
	
	
//printing febonacci series T.C=O(2^n)
	public void allFib(int number)
	{
		for(int i=0; i<=number ; i++)
		{
			System.out.print(fib(i) +" ");
		}
	}
	
	
	public int fib(int number)
	{
		if(number ==0 || number ==1)
		{
			return number;
		}
		
		return fib(number-1) + fib(number-2);
	}
	
}
