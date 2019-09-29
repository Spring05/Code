package New;

import java.util.HashMap;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) 
	{
		if(nums.length==0)
		{
			return nums;
		}
		int[] res = new int[2];
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i = 0 ; i < nums.length ; i++)
		{
			int difference =target-nums[i];
			if(hm.containsKey(difference))
			{
				res[0]=i;
				res[1]=hm.get(difference);
				return res;
			}
			hm.put(nums[i], i);
			
		}
		
		return res;
		
	}
	public static void main(String[] args) 
	{
		TwoSum t = new TwoSum();
		int[] nums = {2, 7, 11, 15};
		int target  = 9;
		System.out.println(t.twoSum(nums, target));

	}

}
