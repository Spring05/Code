package New;	

import java.util.Scanner;

public class Longest {
	
	 public static int Longests(String str1)
		{
		 	
			 if( str1.length()==0)
			 {
				 System.out.println("Invalid"); 
			 }
			 
			 int curlen = 1 ;
			 int result = 1;
			 int previous_index;
			 int visited[]=new int[256];
			 int i;
			 
			 for (i = 0; i < 256; i++) 
			 { 
		            visited[i] = -1; 
			 }
			 
			 visited[str1.charAt(0)] = 0; 
			 
			 for (i = 1; i < str1.length(); i++) 
			 { 
		            previous_index = visited[str1.charAt(i)]; 
			
					if (previous_index == -1 || i - curlen > previous_index) 
			         {	
						 curlen++;
			         }
					
					 else 
					 {
						 if (curlen > result) 
						 {
						 result = curlen; 
						 }
						 curlen = i - previous_index; 
					 }

					visited[str1.charAt(i)] = i; 
			}
			 
			 if (curlen > result) 
			 {
		            result = curlen; 
			 }
		        return result; 
			 
	}
			 

	public static void main(String[] args) 
	{
			
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the String1:");
		String str1 = a.nextLine();
		int len = Longests(str1);
		System.out.println("Length:"+ len);

	}

}

//Test case
//Enter the String1:
//bbbbbbbbbbb
//Length:1

//Test CAse
//Enter the String1:
//abcabcbb
//Length:3

//Test CAse
//Enter the String1:

//Invalid


//Enter the String1:
//b
//Length:1