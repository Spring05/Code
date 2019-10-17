package spring;

import java.util.HashMap;

public class FirstUniqueCharacter {
	
	public int firstUniqChar(String s) 
    {
        if(s.length()==0 || s==null)
        {
        	System.out.println("Not Valid");
        }
        
        
        HashMap<Character,Integer>hm = new HashMap<Character,Integer>();
        for(int i = 0 ; i <s.length();i++)
        {   
        	char c = s.charAt(i);
        	if(hm.containsKey(c))
        	{
        		hm.put(c,-1);
        	}
        	
        	else
        	{
        		hm.put(c, i);
        	}       	
        	
        }
        
        int min = Integer.MAX_VALUE;
        for(char c : hm.keySet())
        {
        	if(hm.get(c) > -1 && hm.get(c) < min)
        	{
        		min = hm.get(c);
        	}
        }
        	
        if(min==Integer.MAX_VALUE)
        {
        	return -1 ;
        }
        
        return min;
        
        
       
        		
    }

	public static void main(String[] args)
	{
		FirstUniqueCharacter fs = new FirstUniqueCharacter();
		String s = "leetcode";
		System.out.println("First Non repeated character index : " + fs.firstUniqChar(s));
		
		
		String s1 = "";
		System.out.println("First Non repeated character index :  " + fs.firstUniqChar(s1));
		
		
		String s2 = "l";
		System.out.println("First Non repeated character index :  " + fs.firstUniqChar(s2));
	}

}

//First Non repeated character index 0
//Not Valid
//First Non repeated character index -1
//First Non repeated character index 0
//O(n)

