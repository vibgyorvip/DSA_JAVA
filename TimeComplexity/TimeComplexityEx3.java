package programming;

public class TimeComplexityEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeComplexityEx3 tc = new TimeComplexityEx3();
		int[] arrayA = {1,2,3,4};
		int[] arrayB = {5,6,7,2};
		tc.printUnorderedPairs(arrayA, arrayB);
	}

	//Prints unordered pairs from given arrays arrayA and ArrayB T.C.=O(m*n)
	public void printUnorderedPairs(int arrayA[] , int arrayB[])
	{
		for(int i=0; i< arrayA.length ; i++)
		{
			for(int j=0; j< arrayB.length ; j++)
			{
				if(arrayA[i] < arrayB[j])
				{
					System.out.println(arrayA[i]+""+arrayB[j]);
				}
			}
		}
	}
		
}
