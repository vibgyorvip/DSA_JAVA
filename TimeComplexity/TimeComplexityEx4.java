package programming;

import java.util.Arrays;

public class TimeComplexityEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeComplexityEx4 tc = new TimeComplexityEx4();
		int[] arr = {1,2,3,4};
		
		/*
		 * System.out.println("Original Array"); for(int index =0; index<arr.length
		 * ;index++) { System.out.print(arr[index]+ " "); } System.out.println();
		 */
		tc.reverse(arr);
		
		
		
	}

	// Reverse of the array  T.c = O(n/2)=O(n)
	
	public void reverse(int[] arr)
	{
		for(int index=0; index < arr.length/2 ; index++ )
		{
			int temp = arr[index];
			arr[index]=arr[arr.length-index-1];
			arr[arr.length-index-1]=temp;
		}
		
		System.out.println("Reversed array");
		/*
		 * for(int index =0; index<arr.length ;index++) { System.out.print(arr[index]+
		 * " "); }
		 */
		
		System.out.println(Arrays.toString(arr));
	}
	
}
