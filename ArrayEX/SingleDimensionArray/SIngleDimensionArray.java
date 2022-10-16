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

	// inserting the element to the particular location
	public void insert(int location , int valueToBeInserted)
	{
		try
		{
			if(intArray[location] == Integer.MIN_VALUE)
			{
				intArray[location]= valueToBeInserted;
				System.out.println("Element "+valueToBeInserted+" Inserted successfully");
			}
			else
			{
				System.out.println("This location number "+location+" is already occupied");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid index array ");
		}
	}
	
	
	// Array Traversal
	public void traverseArray() 
	{
		try {
			for(int index =0 ; index < intArray.length ; index++)
			{
				System.out.println(intArray[index]+" ");
			}
		}catch(Exception e)
		{
			System.out.println("Array no longer exists");
		}
		
	}
	
	// Search an element in an Array
	public void searchInArray(int valueToSearch)
	{
		for(int index =0 ; index < intArray.length ; index++)
		{
			if(intArray[index] == valueToSearch)
			{
				System.out.println("Element found at postion " + index);
				return;
			}
		}
		System.out.println(valueToSearch + " element not found");
	}
	
	// delete value from array
	public void deleteValue(int valueToDeleteIndex) 
	{
		try
		{	
			intArray[valueToDeleteIndex] = Integer.MIN_VALUE; 
			System.out.println("The value deleted at postion " +valueToDeleteIndex+" successfully");
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The value that is provided not in the range of array");
		}
		
	}

}
