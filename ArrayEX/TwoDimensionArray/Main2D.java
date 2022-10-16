package programming;

import java.util.Arrays;

public class Main2D {

	public static void main(String[] args) {
		TwoDimensionArray tda = new TwoDimensionArray(3,3);
		
		// insert a value in the array T.C.=O(1)
		tda.insertValueInArray(0, 0, 10);
		//tda.insertValueInArray(0, 0, 20);
		System.out.println(Arrays.deepToString(tda.arr));
		
		
		//accessing the value from the array T.C.=O(1)
		tda.accessCell(0, 0);
		
		//traversing the array T.C. =O(m*n)
		tda.traverseArray();
		//System.out.println(Arrays.deepToString(tda.arr));
		
		
		// search an element T.C.=O(m*n)
		tda.searchByValue(10);
		
		// delete an element in array T.C.=O(1)
		tda.deleteByValueIndex(0, 0);
		System.out.println(Arrays.deepToString(tda.arr));
		

	}

}
