package ArrayProject;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Permutation obj = new Permutation();
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {4,3,5,2,1};
		boolean result= obj.isPermutation(array1, array2);
		if(result == true) {
			System.out.println("Found Permutation ");
		}
		else {
			System.out.println("Arrays are not Permutation");
		}
	}

	//permutation
	public boolean isPermutation(int[] array1 , int[] array2)
	{
		if(array1.length != array2.length)
		{
			return false;
		}
		
		int sum1=0;
		int sum2=0;
		int mul1=1;
		int mul2=1;
		
		for(int index=0; index<array1.length;index++)
		{
			sum1+=array1[index];
			sum2+=array2[index];
			mul1*=array1[index];
			mul2*=array2[index];
		}
		
		if((sum1==sum2)&&(mul1==mul2))
			return true;
		
		return false;
	}
}
