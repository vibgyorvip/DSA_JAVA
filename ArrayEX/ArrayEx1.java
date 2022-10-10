package programming;

import java.util.Arrays;

public class ArrayEx1 {

	//// T.C for Array creation of n elements = O(n)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray;// Array Declaration------------>O(1)
		intArray = new int[3];// array creation--------->O(1)
		intArray[0]=1;// array initialization-----------> O(n)
		intArray[1]=2;
		intArray[2]=3;
		
		System.out.println(Arrays.toString(intArray));//------>O(1)
		//System.out.println(intArray.getClass().getName());
		
		//Array creation in 1 shot
		// int[] intArray = {1,2,3,4};
		
		
	}

}
