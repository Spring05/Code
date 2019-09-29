package New;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
	
	public int singleNumber(int[] nums) 
    {
        Set<Integer> s = new HashSet<>();
        for(int i : nums)
        {
            if(s.contains(i))
            {
                s.remove(i);
            }
            
            else
            {
                s.add(i);
            }
        }
        
        for(int i : s)
        {
            return i;
        }
        
        return 0;
    }

	public static void main(String[] args) 
	{
		
		SingleNumber sn = new SingleNumber();
		int[] nums= {2,2,4};
		int[] nums1= {-2,0,-2};
		int[] nums2= {};
		if(nums.length==0)
		{
			System.out.println("Invalid");
		}
		System.out.println(sn.singleNumber(nums));
		System.out.println(sn.singleNumber(nums1));
		System.out.println(sn.singleNumber(nums2));

	}

}
