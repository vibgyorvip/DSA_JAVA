package ArrayProject;

public class FindNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindNumberInArray obj= new FindNumberInArray();
		int[] arr = {1,3,5,7,8};
		obj.linearSearch(arr, 52);
		
		
	}
	
		//search method
        public void linearSearch(int[] intArray, int valueToSearch) {
            // TODO
            for(int index =0 ; index<intArray.length ; index++)
            {
                if(intArray[index] == valueToSearch)
                {
                	System.out.println("Number found at postion"+index);
                	return;
                }
            }
            
            System.out.println(valueToSearch +"not found");
        }




}
