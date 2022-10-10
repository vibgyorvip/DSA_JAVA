package programming;

public class SIngleDimensionArray {

	int[] intArray= null;
	
	public SIngleDimensionArray(int sizeOfArray) {
		intArray = new int[sizeOfArray];
		for(int index=0; index< intArray.length; index++)
		{
			intArray[index] = Integer.MIN_VALUE;
		}
		
	}

	public void insert(int location , int valueToBeInserted)
	{
		try
		{
			if(intArray[location] == Integer.MIN_VALUE)
			{
				intArray[location]= valueToBeInserted;
				System.out.println("Element"+valueToBeInserted+"Inserted successfully");
			}
			else
			{
				System.out.println("This location number"+location+"is already occupied");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid index array ");
		}
	}
	
	
	

}
