package New;

import java.util.Scanner;

public class OrderofWords
{
	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the String1:");
		String s = a.nextLine();
		if(s.length()==0 || s==null)
		{
			System.out.println("Not valid");
		}
		String str[] = s.split(" "); 
        String result = ""; 
        for (int i = str.length - 1; i >= 0; i--) 
        { 
            result += str[i] + " "; 
        }  
        System.out.println(result.substring(0, result.length() - 1)); 
	}

}
//Time Complexity O(N);
//Enter the String1:
//I am in an interview
//interview an in am I


//Enter the String1:
//
//Not valid

//Enter the String1:
//one two three
//three two one
