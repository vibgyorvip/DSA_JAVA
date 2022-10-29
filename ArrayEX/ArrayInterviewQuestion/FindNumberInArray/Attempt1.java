package ArrayProject;

public class FindNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindNumberInArray obj= new FindNumberInArray();
		int[] arr = {1,3,5,7,8};
		int result=obj.searchInArray(arr, 5);
		System.out.println("Number found at position : "+result);
		
	}
	
        public int searchInArray(int[] intArray, int valueToSearch) {
            // TODO
            for(int index =0 ; index<intArray.length ; index++)
            {
                if(intArray[index] == valueToSearch)
                return index;
            }
            
            return -1;
        }




}
