package New;

import java.util.Scanner;

public class ReplaceSpace {
	
	public static void space(char[] str,int length)
	{
		int i =0 ;
		int newword;
		int spacecount=0;
		for(i = 0 ; i<length;i++)
		{
			if (str[i] == ' ') 
			{
				spacecount++;
			}
		}
		
		newword=length +spacecount *2 ;
		char[] newchars=new char[newword];
		for(i = length-1;i>=0;i--)
		{
			if(str[i] == ' ')
			{
				newchars[newword - 1] = '0';
				newchars[newword  - 2] = '2';
				newchars[newword  - 3] = '%';       
	            newword  = newword  - 3;
			}
			else
			{
				newchars[newword-1]=str[i];
				newword=newword-1;
			}
		}
		System.out.println(newchars);
	}

	public static void main(String[] args)
	{
		ReplaceSpace s = new ReplaceSpace();
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the String1:");
		char[] str = a.nextLine().toCharArray();
		if(str.length==0 || str==null)
		{
			System.out.println("Not valid");
		}
		s.space(str,str.length);		
	}

}

//Time complexity =o(N)

//Enter the String1:
//hi google
//hi%20google


//Enter the String1:
//www.google.com/The Godfather
//www.google.com/The%20Godfather


//Enter the String1:
//
//Not valid