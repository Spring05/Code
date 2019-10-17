package spring;

import java.util.HashMap;
import java.util.Stack;

public class ValidParanthesis {
	
	 public boolean isValid(String s) 
	    {
		 	if(s.length()==0 || s==null)
	        {
	        	System.out.println("Not Valid");
	        	return false;
	        }
		    HashMap<Character, Character> map = new HashMap<Character, Character>();
			map.put('(', ')');
			map.put('[', ']');
			map.put('{', '}');
			
			Stack<Character> st = new Stack<>();
			for(int i = 0 ; i < s.length() ; i++)
			{
				Character ch = s.charAt(i);
				if(map.containsKey(ch))
				{
					st.push(ch);
				}
				
				else if(!st.empty() && map.get(st.peek())==ch)
				{
					st.pop();
				}
				
				else
				{
					return false;
				}
			}
			
			return st.empty();
	    }

	public static void main(String[] args) 
	{
		ValidParanthesis vp = new ValidParanthesis();
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


//String : true
//String1 : false
//String2 : true
//Not Valid
//String3 : false
//O(n)
