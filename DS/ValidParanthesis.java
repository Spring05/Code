package New;

import java.util.HashMap;
import java.util.Stack;

public class ValidParanthesis 
{

	public static boolean isValid(String s)
	{
		HashMap<Character,Character> m = new HashMap<Character,Character>();
		char[] ch=s.toCharArray();
		m.put('(',')');
		m.put('[', ']');
		m.put('{', '}');
		Stack<Character> st = new Stack<Character>();
		for(char c : ch)
		{
			if(m.containsKey(c))
			{
				st.push(c);
			}
			
			else if(!st.empty() && m.get(st.peek())==c)
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
		String s2="";
		String s ="{}";
		String s1 ="{}(";
		if (s2 =="")
		{ 
			System.out.println("Invalid");
		}
		
		System.out.println("Valid Paraenthesis:" +isValid(s));
		System.out.println("Valid Paraenthesis:" +isValid(s1));
		System.out.println("Valid Paraenthesis:" +isValid(s2));
	}

}


//Valid Paraenthesis:true
//Valid Paraenthesis:false

