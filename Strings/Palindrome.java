package New;

import java.util.Scanner;

public class Palindrome 
{

		public static boolean Palindromes(String str1)
		{
		
			String reversedstring="";
			if( str1.length()==0)
			{
				System.out.println("empty");	
				return false;
			}
			
			for(int i = (str1.length())-1 ; i>=0 ;i--)
			{
				reversedstring = reversedstring +str1.charAt(i);
			}
			
			if (str1.equals(reversedstring))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
    
		
		public static void  main(String[] args) 
		{
			Scanner a = new Scanner(System.in);
			System.out.println("Enter the String1:");
			String str1 = a.nextLine();
			if(Palindromes(str1)) 
		    {
		          System.out.println("Palindrome");
		    }
		    else 
		    {
		         System.out.println("Not Palindrome");
		    }
		}
			
}


//Test Input
//Enter the String1:
//tent
//Not Palindrome


//Empty Case
//Enter the String1:
//
//empty
//Not Palindrome


//Enter the String1:
//1
//Palindrome

//Enter the String1:
//bab
//Palindrome


//Complexity O(n) - Reversing string 
