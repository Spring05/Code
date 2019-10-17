package spring;

import java.util.HashMap;

public class RomanToInteger {
	
	public int romanToInt(String s)
	{ 
		if(s.length()==0 || s==null)
		{
			return 0 ;
		}
		
		HashMap<Character,Integer> romanValues = new HashMap<Character,Integer>();
		romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        
        int result =romanValues.get(s.charAt(s.length()-1));
        for(int i = s.length()-2 ; i >=0 ; i--)
        {
        	if(romanValues.get(s.charAt(i))>=romanValues.get(s.charAt(i+1)))
        	{
        		result+=romanValues.get(s.charAt(i));
        	}
        	
        	else
        	{
        		result-=romanValues.get(s.charAt(i));
        	}
        }
        
        return result;
		
		
	}

	public static void main(String[] args) 
	{
		RomanToInteger rm = new RomanToInteger();
		String s= "MCMXCIV";
		System.out.println("RomantoInteger : " +rm.romanToInt(s));
		
		String s1 ="IV";
		System.out.println("RomantoInteger : " +rm.romanToInt(s1));
		
		String s2 ="";
		System.out.println("RomantoInteger : " +rm.romanToInt(s2));

	}

}


//RomantoInteger : 1994
//RomantoInteger : 4
//RomantoInteger : 0
