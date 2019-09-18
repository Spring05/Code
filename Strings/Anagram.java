package New;

import java.util.Scanner;

public class Anagram 
{
	
	 public static boolean Anagrams(char[] str1, char[] str2)
	{
		 if( str1.length==0 || str2.length == 0)
		 {
			 System.out.println("Invalid"); 
			 return false;
		 }
		
		 if (str1.length!=str2.length )
		 {
			System.out.println("different length"); 
			 return false;
		 }
		
	
	
		//Create count arrays and initialize 
		int[] count1 = new int[256];
		int[] count2 = new int[256];
		for(int i = 0; i < str1.length&&i<str2.length; i++)
		{
			// For each character in input strings, 
	        // increment count in the corresponding 
	        // count array 
			count1[str1[i]]++; 
            count2[str2[i]]++; 
		}
		
		for(int i =0 ; i< 256 ;i++)
		{
			if(count1[i]!=count2[i])
			{
				return false;
			}
		}
		
		return true;
}

	
	public void permutations(String s, int start , int end)	
	{
		if(start==end)
		{
			System.out.println(s);
		}
		
		else
		{
			for(int i = start ; i <= end ; i++)
			{
				s=swap(s,start,i);
				permutations(s,start+1,end);
				s=swap(s,start,i);
			}
		}
		
	}
	
	public static String swap(String s, int i, int j) 
	{
		char[] a = s.toCharArray();
		char temp = a[i];
		a[i]=a[j];
		a[j]=temp;
		return String.valueOf(a);
		
	}


	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the String1:");
		char[] str1 = a.nextLine().toCharArray();
		System.out.println("Enter the String2:");
	    char[] str2 = a.nextLine().toCharArray();
	    
	    if(Anagrams(str1, str2)) 
	    {
	          System.out.println("Anagram");
	    }
	    else 
	    {
	         System.out.println("Not an Anagram");
	    }
	    System.out.println("Print Anagrams");
	    String s ="ABC";
	    int n =s.length();
	    Anagram an = new Anagram();
	    an.permutations(s, 0,n-1);
	    
	    
	  }
}


////Test Case
//Enter the String1:
//abcd
//Enter the String2:
//dcab
//Anagram
////

//Enter the String1:
//a
//Enter the String2:
//b
//Not an Anagram

//
//Enter the String1:
//a
//Enter the String2:
//bc
//Not an Anagram

//Enter the String1:
//-1
//Enter the String2:
//-2
//Not an Anagram

//Enter the String1:
//0
//Enter the String2:
//0
//Anagram

//Enter the String1:
//1234
//Enter the String2:
//23
//Not an Anagram



//Enter the String1:
//aaaaaabc
//Enter the String2:
//a
//Not an Anagram

//
//Enter the String1:
//aabb
//Enter the String2:
//baba
//Anagram

//Test case
//Enter the String1:
//
//Enter the String2:
//
//Not an Anagram


//Enter the String1:
//a
//Enter the String2:
//b
//Not an Anagram


//
//Enter the String1:
//
//Enter the String2:
//df
//Not an Anagram

