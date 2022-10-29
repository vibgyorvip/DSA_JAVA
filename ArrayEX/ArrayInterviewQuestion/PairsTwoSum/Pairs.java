package ArrayProject;

import java.util.Arrays;

public class Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pairs obj = new Pairs();
		int[] nums = {3,71,11,2,7}; 
		int target = 9;
		int[] result =obj.twoSum(nums, target);
		System.out.println(Arrays.toString(result));
		
		
	}
	
	//pairs or TwoSum
	 public int[] twoSum(int[] nums, int target) {
		    // TODO
		  for(int index1=0; index1<nums.length ; index1++)
		  {
			  for(int index2 = index1+1 ; index2<nums.length ; index2++)
			  {
				  if(nums[index1]+nums[index2] == target)
				  {
					return new int[] {index1,index2};  //anonymus array
				  }
			  }
		  }
		 throw new IllegalArgumentException("No solution found");
		}

}
