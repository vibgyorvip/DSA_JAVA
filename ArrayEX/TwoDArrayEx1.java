package programming;

import java.util.Arrays; 

public class TwoDArrayEx1 {

	public static void main(String[] args) {
		//step-1 declare--------->O(1)
		int[][] int2DArray = null;
		
		//step-2 instantiate------>O(1)
		int2DArray = new int[2][2];
		
		//step-3 initialize-------->O(m*n)
		int2DArray[0][0]=1;
		int2DArray[0][1]=2;
		int2DArray[1][0]=3;
		int2DArray[1][1]=4;
		
		// print 2D-Array
		System.out.println(Arrays.deepToString(int2DArray));
		
		//all in one------------>T.C.==> O(1) always recommanded to use
		int int22DArray[][] = {{1,2},{3,4}};
		System.out.println(Arrays.deepToString(int22DArray));
		
		String s2DArray[][] = {{"a","b"},{"c","d"}};
		System.out.println(Arrays.deepToString(s2DArray));
						

		
	}

}
