package ArrayProject;

import java.util.Arrays;

public class Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []nums = {2,7,11,15}; 
		int target = 9;
		
		Pairs obj = new Pairs();
		
		  for(int index: obj.twoSum(nums, target))
		  { 
			  System.out.print(index +" "); 
		  }
		 
		//int[] temp=obj.twoSum(nums, target);
		//Arrays.toString(temp);
	}
	
	 public int[] twoSum(int[] nums, int target) {
		    // TODO
		    int[] arr = new int[2];
			/*
			 * for(int index=0; index<arr.length ; index++) { arr[index]=Integer.MIN_VALUE;
			 * }
			 */
		    
		    for(int i=0 , j=1,k=0 ;j<nums.length; i++,j++,k++)
		    {
		        if((nums[i]+nums[j])==target)
		        {
		        arr[k]=i;
		        arr[++k]=j;
		        }
		    }
		    return arr;
		}

}
