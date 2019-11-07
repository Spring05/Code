package msOne;

import java.util.HashMap;



public class twoSum 
{
	public static int[] sumTwo(int[] nums , int target )
	{
		if(nums==null || nums.length<2)
		{
	        return new int[]{0,0};
		}
		
		
		int[] result = new int[2];
		//value and index
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer> ();
		for(int i = 0 ; i < nums.length;i++)
		{
			//check if curent elements complement exists in the table
			int diff = target - nums[i];
			if(hm.containsKey(diff))
			{
				result[0] = hm.get(diff);
				result[1]=i;
				return result;
			}
			
			hm.put(nums[i], i);		
		}
		
		return new int[]{0,0};
	}

	public static void main(String[] args) 
	{
		
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] result=sumTwo(nums,target);
		System.out.println(result[0] + " " + result[1]);
		
	
	}
}
	
//0(n)