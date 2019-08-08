package New;

import java.util.Scanner;

public class MinimumWindow 
{
	static String findSubString(String S, String T) 
    { 
        int len1 = S.length(); 
        int len2 = T.length(); 
      
        if (len1 < len2 ) 
        { 
            System.out.println("Invalid"); 
            return ""; 
        } 
        
        if (S == null || S.length() == 0 || T == null || T.length() == 0) 
        {
        	System.out.println("Invalid");
        	 return "";
        }
           
        int hash_S[] = new int[256]; 
        int hash_T[] = new int[256]; 
      
        
        for (int i = 0; i < len2; i++)
        {
            hash_T[T.charAt(i)]++; 
        }
        
        int start = 0, start_index = -1, min_len = Integer.MAX_VALUE; 
      
        
        int count = 0; 
        for (int j = 0; j < len1 ; j++) 
        { 
        	hash_S[S.charAt(j)]++; 
        	if (hash_T[S.charAt(j)] != 0 && hash_S[S.charAt(j)] <= hash_T[S.charAt(j)] ) 
                {
        			count++; 
                }
      
            if (count == len2) 
            { 
              while ( hash_S[S.charAt(start)] > hash_T[S.charAt(start)] || hash_T[S.charAt(start)] == 0) 
                { 
            	  if (hash_S[S.charAt(start)] > hash_T[S.charAt(start)])   hash_S[S.charAt(start)]--; 
                    {
                    	start++; 
                    }
                } 
      
               
                int len_window = j - start + 1; 
                if (min_len > len_window) 
                { 
                    min_len = len_window; 
                    start_index = start; 
                } 
            } 
        } 
      
        
        if (start_index == -1) 
        { 
        System.out.println("No such window exists"); 
        return ""; 
        } 
        return S.substring(start_index, start_index + min_len); 
    }

	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the String1:");
		String S = a.nextLine();
		System.out.println("Enter the String2:");
	    String T = a.nextLine();
        String l = findSubString(S, T);
	}
}


//Test Case 
//Enter the String1:
//tutorial cup
//Enter the String2:
//oti
//Smallest window is :
// tori

//Enter the String1:
//ab
//Enter the String2:
//bab
//Invalid

//Enter the String1:
//
//Enter the String2:
//
//Invalid

///Enter the String1:
//
//Enter the String2:
//fg
//Invalid

//
//Enter the String1:
//dfgh
//Enter the String2:
//
//Invalid


//Time Complexity o(n)
