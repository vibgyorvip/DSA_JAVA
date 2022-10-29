package ArrayProject;

public class MaxProductOFTwoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxProductOFTwoInteger obj = new MaxProductOFTwoInteger();
		int[] intArray = {20,10,30,50,40};
		String pairs=obj.findMaxProduct(intArray);
		System.out.println(pairs);
		
	}

	public String findMaxProduct(int [] arr)
	{
		int maxProduct=0;
		String pairs="";
		
		for(int index1=0; index1< arr.length ; index1++)
		{
			for(int index2=index1+1; index2<arr.length ;index2++)
			{
				if(arr[index1]*arr[index2] > maxProduct)
				{
					maxProduct=arr[index1]*arr[index2];
					pairs=Integer.toString(arr[index1])+","+Integer.toString(arr[index2]);
				}
			}
		}
		return pairs;
	}
}
