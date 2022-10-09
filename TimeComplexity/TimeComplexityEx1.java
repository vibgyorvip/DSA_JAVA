package programming;

public class TimeComplexityEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeComplexityEx1 tc = new TimeComplexityEx1();
		int[] arr = {1,2,3,4};
		tc.spofArray(arr);
		
	}

	// sum and product of an array T.C.=O(n+n)=O(n)
	public void spofArray(int[] arr)
	{
		int sum =0;
		int product=1;
		
		for(int i=0 ; i< arr.length ; i++)
		{
			sum += arr[i];
		}
		
		for(int i=0 ; i< arr.length ; i++)
		{
			product *= arr[i];
		}
		
		System.out.println(sum + "    " + product);
	}
}
