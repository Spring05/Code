	package spring;

import java.util.HashSet;

public class MissingNumbers {
	
	 public int missingNumber(int[] nums) 
	    {
	        if(nums.length==0 || nums.length==1 || nums ==null)
	        {
	            return -1;
	        }
	        
	        //HashSet to store all the numbers in the nums
	        HashSet<Integer> hs = new HashSet<>();
	        for(int n : nums)
	        {
	        	hs.add(n);
	        }
	      
	        int missing = nums.length+1;
	        for(int number = 0 ; number < missing ;number++)
	        if(!hs.contains(number))
	        {
	        	return number;
	        }
	        
	        return -1;
	        
	    }

	public static void main(String[] args)
	{
		
		MissingNumbers mn = new MissingNumbers();
		int[] nums= {9,6,4,2,3,5,7,0,1};
		System.out.println("Missing numbers : " + mn.missingNumber(nums));
		
		int[] nums1= {};
		System.out.println("Missing numbers : " + mn.missingNumber(nums1));
		
		int[] nums2= {1};
		System.out.println("Missing numbers : " + mn.missingNumber(nums2));
		

	}

}

//Missing numbers : 8
//Missing numbers : -1
//Missing numbers : -1
//Time ComplexityO(n)

