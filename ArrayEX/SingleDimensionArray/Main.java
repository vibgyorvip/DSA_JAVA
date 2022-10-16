package programming;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SIngleDimensionArray arr = new SIngleDimensionArray(5);
		
		// insertion in array T.C = O(1) for specified location
		arr.insert(0, 1);
		arr.insert(1, 2);
		arr.insert(2, 3);
		arr.insert(1, 5);
		arr.insert(10, 17);
		
		// Accessing elements in array T.C.=O(1) 
		try {
		int  firstElement = arr.intArray[0];
		System.out.println(firstElement);
		int  secondElement = arr.intArray[1];
		System.out.println(secondElement);
		int  thirdElement = arr.intArray[20];
		System.out.println(thirdElement);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid index array can't access element");
		}
		
		//array traversal T.C = O(n)
		System.out.println("Array traversal");
		arr.traverseArray();
		
		//search element in an array T.C.=O(n)
		arr.searchInArray(10);
		arr.searchInArray(3);
		
		// delete value in array T.C. = O(1)
		arr.deleteValue(0);
		System.out.println(arr.intArray[0]);
		
	}

}
