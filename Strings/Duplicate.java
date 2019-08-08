package New;

import java.util.Scanner;

public class Duplicate 
{
	
	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the String1:");
		String str1 = a.nextLine();
		char[] c = str1.toCharArray();
		int length=c.length;
		if( str1.length()==0)
		{
			 System.out.println("Invalid"); 
			 
		}
		for (int i = 0; i < length; i++) 
		{
            for (int j = i + 1; j < length; j++) 
            {
                if (c[i] == c[j]) 
                {
                    int temp = j;
                    for (int k = temp; k < length - 1; k++) 
                    {
                    	c[k] = c[k + 1];
                    }
                    j--;
                    length--;
 
                }
            }
        }
		String str2 = new String(c);
		str2 = str2.substring(0, length);
		System.out.println(str2);		
	}
}

//Enter the String1:
//bananas
//bans

//Enter the String1:
//11111111111111
//1

//Enter the String1:
//Invalid


//Enter the String1:
//234234
//234
