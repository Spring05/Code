package spring;

import java.util.HashSet;

public class LongSubWRepeat {
	
	public int lengthOfLongestSubstring(String s)
	{
		if (s==null || s.length()==0)
		{
			System.out.print("Not valid  ");
			
		}
		
		if(s.length()==1)
		{
			System.out.print("Single character ");
		}
		
		
		int maxlength = 0 ;
		//Add the character located at j index of input string to set , check if it exists already 
		HashSet<Character> hs = new HashSet<>();
		int i = 0 ; 
		int j = 0 ;
		
		while(j < s.length())
		{
			if(hs.add(s.charAt(j)))
			{
				//doesnt exists ins et increment the j pointer and update the max length
				j++;
				maxlength =Math.max(maxlength, j-i);
			}
			
			else
			{
				//remove the character at i pointer from set increment 
				//repeat until i j hav reached to input
				hs.remove(s.charAt(i++));
				
			}
			
			
		}
		
		return maxlength;
		
	}

	public static void main(String[] args) 
	{
		LongSubWRepeat lsr = new LongSubWRepeat();
		String s = "abcabcbb";
		String s1 = "a";
		String s2 = "";
		System.out.println("MaxLength :" + lsr.lengthOfLongestSubstring(s));
		System.out.println("MaxLength :" + lsr.lengthOfLongestSubstring(s1));
		System.out.println("MaxLength :" + lsr.lengthOfLongestSubstring(s2));

	}

}

//MaxLength :3
//Single character MaxLength :1
//Not valid  MaxLength :0


//Time complexity 
//O(n) // In the worst case each character will be visited twice by i and j.

