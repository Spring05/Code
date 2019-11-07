package msOne;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean isPalindrome(String s)
	{
//		if(s.length()==0 || s==null)
//		{
//			return false;
//		}
//		String rs =  " ";
//		
//		for(int i = s.length()-1 ; i >=0 ; i--)
//		{
//			rs=s.charAt(i)+rs;
//		}
//		
//		if(s.equals(rs))
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
		
		int l = 0 ; 
		int r= s.length()-1;
		s=s.toLowerCase();
		while(l<=r)
		{
			char getl=s.charAt(l);
			char getr=s.charAt(r);
			if(!(getl>='a' && getl <='z')|| !(getl>='0' && getl <='9'))
			{
				l++;
			}
			else if (!(getr>='a' && getr <='z') || !(getr>='0' && getr <='9') )
			{
				r--;
			}
			else if(getl==getr)
			{
				l++;
				r--;
			}
			else
			{
				return false;
			}
		}
		
		return true;
		
	}

	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the String1:");
		String s = a.nextLine();
		if(isPalindrome(s)) 
	    {
	          System.out.println("Palindrome");
	    }
	    else 
	    {
	         System.out.println("Not Palindrome");
	    }

	}

}


//Enter the String1:
//race a car
//Not Palindrome




