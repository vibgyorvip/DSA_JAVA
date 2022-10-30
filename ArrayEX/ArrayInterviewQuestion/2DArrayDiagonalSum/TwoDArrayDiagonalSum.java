package ArrayProject;

//import java.util.Arrays;

public class TwoDArrayDiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoDArrayDiagonalSum obj = new TwoDArrayDiagonalSum();
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		//System.out.println(Arrays.deepToString(arr));
		System.out.println("Diagonal Sum is "+obj.DiagonalSum(arr));
		
		
	}
	
	public int DiagonalSum(int[][] arr)
	{
		int sum=0;
		/*for(int row=0; row<arr.length;row++)
		{
			for(int col=0; col<arr[0].length;col++)
			{
				if(row == col)
				{
					sum+=arr[row][col];
				}
			}
		}*/
		
		for(int row=0; row<arr.length ; row++)
		{
			sum+=arr[row][row];
		}
		return sum;
	}

}
