package New;

import java.util.HashMap;

//Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
public class FirstUniqueCharacter 
{
	public static void main(String[] args)
	{
		
		String s= "howtodoinjava dot com";
        char[] chars = s.toCharArray();
         
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : chars)
        {
            if(map.containsKey(c))
            {
                int counter = map.get(c)+1;
                map.put(c, counter);
            } 
            else 
            {
                map.put(c, 1);
            }
        }
         
        System.out.println("Duplicate characters:");
         
        //Print duplicate characters
        for(char c : map.keySet()) 
        {
            if(map.get(c) > 1) 
            {
                System.out.println(c +" : "+map.get(c) + ":");
            }
        }
         
        
        
        System.out.println("Duplicate characters excluding white space :");
         
        //Print duplicate characters excluding white space
        for(char c : map.keySet()) 
        {
            if(map.get(c) > 1 && !Character.isWhitespace(c)) 
            {
                System.out.println(c);
            }
        }
         
        System.out.println("Distinct characters:");
         
        //Print distinct characters
        for(char c : map.keySet()) 
        {
            if(map.get(c) == 1) 
            {
            	 System.out.println(c +" : "+map.get(c));
            }
        }
        
        
    }
		
}

