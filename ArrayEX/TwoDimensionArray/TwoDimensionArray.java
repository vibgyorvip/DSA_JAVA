package programming;

public class TwoDimensionArray {
	int arr[][]= null;
	
	//constructor
	public TwoDimensionArray(int numberOfRows , int numberOfColumns)
	{
		this.arr= new int[numberOfRows][numberOfColumns];
		
		for(int row =0; row< arr.length ; row++)
		{
			for(int col =0; col < arr[0].length ; col++ )
			{
				arr[row][col]=Integer.MIN_VALUE;
			}
		}
	}
	
	// inserting value in the array
	public void insertValueInArray(int row , int col , int valueToInsert)
	{
		try {
			if(arr[row][col]==Integer.MIN_VALUE)
			{
				arr[row][col]=valueToInsert;
				System.out.println("The value inserted successfully");
			}
			else {
				System.out.println("The cell is occupied");
			}
			
		}catch(ArrayIndexOutOfBoundsException e )
		{
			System.out.println("Invalid index for 2D Array");
		}
		
	}
	
	//Accessing the cell value
	public void accessCell(int row , int col)
	{
		System.out.println("\nAccessing row#"+ row + ", col#"+ col);
		try 
		{
			System.out.println("The cell value is :"+ arr[row][col]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid index for 2D Array");
		}
	}
	
	// Traverse the array
	public void traverseArray()
	{
		System.out.print("[");
		for(int row=0; row< arr.length; row++)
		{
			System.out.print("[");
			for(int col=0; col< arr[0].length ; col++)
			{
				System.out.print(arr[row][col]+" ");
			}
			System.out.print("], ");
		}
		System.out.println("]");
	}
	
	// Search the value in the array
	public void searchByValue(int valueToSearch)
	{
		for(int row =0 ; row < arr.length ; row++)
		{
			for(int col =0 ; col < arr[0].length ; col++)
			{
				if(arr[row][col] == valueToSearch)
				{
					System.out.println("element "+ valueToSearch+ " found at row#"+row+", col#"+col);
					return;
				}
			}
		}
		System.out.println("element not found");
	}
	
	// delete the value in the array
		public void deleteByValueIndex(int row , int col)
		{
		 try {
			arr[row][col]=Integer.MIN_VALUE;
			System.out.println("value delete successfully");
		   }catch(ArrayIndexOutOfBoundsException e)
		     {
			    System.out.println("The value that is provided not in the range of array");
		     }
		
		}

}
