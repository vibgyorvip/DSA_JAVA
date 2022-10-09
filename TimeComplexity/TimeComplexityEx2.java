package programming;

public class TimeComplexityEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeComplexityEx2 tc = new TimeComplexityEx2();
		int[] arr = {1,2,3,4};
		//tc.printPairs(arr);
		tc.printUnorderedPairs(arr);
		
		
		
	}

	//Prints to the console the pairs from given array T.C.=O(n^2)
	public void printPairs(int[] arr)
	{
		for(int i=0; i< arr.length ; i++)
		{
			for(int j=0; j< arr.length ;j++)
			{
				System.out.println(arr[i]+""+arr[j]);
			}
		}
		
	}
		
	//print unordered pairs
	public void printUnorderedPairs(int[] arr)
	{
		for(int i=0; i< arr.length ; i++)
		{
			for(int j=i+1; j< arr.length ;j++)
			{
				System.out.println(arr[i]+""+arr[j]);
			}
		}
		
	}
		
}
