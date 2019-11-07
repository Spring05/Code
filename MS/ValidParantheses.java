package msOne;

import java.util.HashMap;
import java.util.Stack;



public class ValidParantheses {
	
	public boolean isValid(String s)
	{
		if(s.length()==0 || s==null)
        {
        	System.out.println("Not Valid");
        	return false;
        }
		
		
		HashMap<Character,Character> hm = new HashMap<Character,Character>();
		hm.put('(' , ')');
		hm.put('[', ']');
		hm.put('{' ,'}');
		
		
		Stack<Character> s1 = new Stack<Character>();
		for(int i =0 ; i < s.length();i++)
		{
			char curr = s.charAt(i);
			
			//push the curr char
			if(hm.keySet().contains(curr))
			{
				s1.push(curr);
			}
			
			//if the curr stack is closing and matches 
			else if (hm.values().contains(curr))
			{
				if(!s1.isEmpty() && hm.get(s1.peek())==curr)
				{
					s1.pop();
				}
				else
				{
					return false;
				}
			}
					
		}
		
		return s1.empty();

		
	}

	public static void main(String[] args) 
	{
		ValidParantheses vp = new ValidParantheses();
		String s= "()";
		System.out.println("String : " + vp.isValid(s));
		String s1= "()}";
		System.out.println("String1 : " + vp.isValid(s1));
		String s2= "()[]";
		System.out.println("String2 : " + vp.isValid(s2));
		String s3= "";
		System.out.println("String3 : " + vp.isValid(s3));

	}

}
