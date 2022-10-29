package ArrayProject;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,8,9,10};
		MissingNumber obj = new MissingNumber();
        System.out.println("Missing number is :"+obj.findMissingNumber(arr));		
	}
	
	public int findMissingNumber(int []arr)
	{
		int actualSum=0;
		int totalIntegerSum=0;
		/*
		 * for(int index =0; index< arr.length ; index++) { actualSum+=arr[index]; }
		 */
		// for-each loop for calculating actual sum of array values.
		for(int index:arr)
		{
			actualSum+=index;
		}
		
		//calculating total integer sum ==> n*(n+1)/2 sum of n integer number formula
		totalIntegerSum = 10*(10+1)/2;
		
		int difference = totalIntegerSum - actualSum;
		
		return difference;
	}

}
