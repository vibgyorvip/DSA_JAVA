package ArrayProject;

public class IsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IsUnique obj = new IsUnique();
		int[] arr = {10,30,50,58};
		boolean result=obj.isUnique(arr);
		System.out.println(result);
		
	}

	public boolean isUnique(int[] arr)
	{
		for(int index1=0; index1<arr.length ; index1++)
		{
			for(int index2=index1+1; index2<arr.length;index2++)
			{
				if(arr[index1] == arr[index2])
					return false;
			}
		}
		return true;
	}
}
