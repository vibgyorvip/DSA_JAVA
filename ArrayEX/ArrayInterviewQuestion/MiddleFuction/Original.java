package ArrayProject;

//import java.util.Arrays;

public class MiddleFuction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleFuction obj = new MiddleFuction();
		int[] arr = {12,2,33,4,5};
		int[] result = obj.findMiddleFunction(arr);
		for(int value: result)
		{
			System.out.print(value+" ");
		}
		
	/*int [] temp=Arrays.copyOfRange(arr, 1, arr.length-1);
		for(int value: temp)
		{
			System.out.print(value+" ");
		}
	*/
	}

	public int[] findMiddleFunction(int[] arr)
	{
		int[] result=new int[arr.length-2];
		for(int index=1,i=0; index< arr.length-1 ; index++,i++)
		{
			result[i]=arr[index];
		}
		return result;
	}
}
