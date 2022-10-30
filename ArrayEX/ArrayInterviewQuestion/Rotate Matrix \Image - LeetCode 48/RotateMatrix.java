package ArrayProject;

import java.util.Arrays;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RotateMatrix obj= new RotateMatrix();
		int[][] arr = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.deepToString(arr));
		obj.rotateMatrix(arr);
		System.out.println(Arrays.deepToString(arr));
		
	}
	
	public void rotateMatrix(int [][]arr)
	{
		if(arr.length ==0 || arr.length != arr[0].length)
		{
			return ;
		}
		
		//Transpose
		int row = arr.length;
		int col = arr[0].length;
		
		for(int i=0; i< row ; i++)
		{
			for(int j=0; j<i ; j++)
			{
				int temp = arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
		//reverse
		for(int [] intArray : arr)
		{
			int i =0;
			int j=col-1;
			while(i<j)
			{
				int temp = intArray[i];
				intArray[i]=intArray[j];
				intArray[j]=temp;
				i++;
				j--;
			}
		}
	}

}
