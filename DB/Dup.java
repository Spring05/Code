package New;

import java.util.HashMap;

public class Dup {
	
	// ---------------------------------------------------------------------------------------//
	public void duplicates(String s)
	{
		if (s==null || s.length()==0)
		{
			System.out.println("Not valid");
		}
		
		
		char[] ch = s.toCharArray();
		HashMap<Character , Integer> hm = new HashMap<Character , Integer>();
		for(char c: ch)
		{
			if(hm.containsKey(c))
			{
				int count =hm.get(c)+1;
				hm.put(c, count);
				
			}
			
			else
			{
				hm.put(c,1);
			}
		}
		
		
		 System.out.println("Duplicate characters:");
	        
	        
	        for(char c : hm.keySet()) 
	        {
	            if(hm.get(c) > 1) 
	            {
	            	 System.out.println("Duplicate Character : " + c +" : "+hm.get(c));
	            }
	            
	            else if(hm.get(c) == 1) 
	            {
	            	 System.out.println("Distinct Character : " + c +" : "+hm.get(c));
	            }
	        }  
	}
	        
	        
	        //---------------------------------------------------------------------------//
	        
	        
	   public void reverseS (String s1)
	   {
		   if (s1==null || s1.length()==0)
		   {
			   System.out.println("Not Valid");
		   }
		   
		   char[] ch = s1.toCharArray();
		   int start = 0 ;
		   int end = s1.length()-1;
		   char temp;
		   while(start<end)
		   {
			   temp = ch[start];
			   ch[start]=ch[end];
			   ch[end]=temp;
			   start++;
			   end--;
					   
		   }
		   
		   for(char c : ch)
		   {
			   System.out.print(c);
		   }
		   
	   }
	   //--------------------------------------//
	   public void reverseS1 (String s2)
	   {
		   if (s2==null || s2.length()==0)
		   {
			   System.out.println("Not Valid");
		   }
		   
		   char[] ch = s2.toCharArray();
		   for(int i = ch.length-1 ; i >=0;i--)
		   {
			   System.out.print(ch[i]);
		   }
	   }
	   
	   //--------------------------------------//
	   public void reverseS3 (String s3)
	   {
		   if (s3==null || s3.length()==0)
		   {
			   System.out.println("Not Valid");
		   }
		   
		   String reverse="";
		   for(int i = s3.length()-1 ; i >=0;i--)
		   {
			   reverse = reverse + s3.charAt(i);
		   }
		   
		   System.out.println(reverse);
		   
	   }
	   
	   //--------------------------------------//
	   public void reverseS4 (String s4)
	   {

		   StringBuilder sb = new StringBuilder();
		   if (s4==null || s4.length()==0)
		   {
			   System.out.println("Not Valid");
		   }
		   
	
		   for(int i = s4.length()-1 ; i >=0;i--)
		   {
			   sb.append(s4.charAt(i));
		   }
		   
		   System.out.println(sb.toString());
		   
	   }
	   
	   //--------------------------------------//
	   
	   public void reverseS5 (String s5)
	   {

		   if (s5==null || s5.length()==0)
		   {
			   System.out.println("Not Valid");
		   }
		   
		   int n = s5.length();
		   char[] re=s5.toCharArray();
		   char temp;
		   for(int i = 0 ; i <n/2 ; i ++)
		   {
			  temp = re[i];
			  re[i]=re[n-1-i];
			  re[n-1-i]=temp;
			  
		   }
		   
		   for(int j = 0 ; j <n ; j++)
		   {
			   System.out.print(re[j]);
		   }
		   
		   
	   }
	   
	   //--------------------------------------//
	   
	   public void palindrome(String s6)
	   {
		   if (s6==null || s6.length()==0)
	   {
		   System.out.println("Not Valid");
	   }
	   
		   
		   String reversed = "";
		   for(int i = s6.length()-1 ; i >=0 ; i --)
		   {
			   reversed = reversed + s6.charAt(i);
		   }
		   
		   if(s6.equals(reversed))
		   {
			   System.out.println("True");
		   }
		   
		   else
		   {
			   System.out.println("False");
		   }
	   }
	   
	  //--------------------------------------------//
	   static void move(int array[],int n)
		{
			{
				int start = 0;
				int end = array.length - 1;

				for(int i = 0; i <= end; i++) 
				{
					while (array[i] ==1  && i < end) swaps(array, i, end--);
		            while (array[i] ==0  && start < i) swaps(array, i, start++);
				}
			}
			
			System.out.println("New Array");
			for(int i =0 ;i<n ;i++)
			{
				System.out.print(array[i] + " ");

			}
			
			
		}
		
		private static void swaps(int[] array, int i, int j) {
			 int temp = array[i];
		        array[i] = array[j];
		        array[j] = temp;
			
		}
	   
	  //-----------------------------///
	   
     public static boolean checkAnagram(String s1 , String s2)
     {
    	 if(s1==null || s2==null)
    	 {
    		 System.out.println("Not Valid");
    	 }
    	 
    	 if(s1.length()!=s2.length())
    	 {
    		 System.out.println("\nDifferent length\n");
    	 }
    	 
    	 int[] count1= new int [256];
    	 int[] count2= new int [256];
    	 
    	 char[] c = s1.toCharArray();
    	 char[] d = s2.toCharArray();
    	 
    	 for(int i = 0 ;i < c.length&&i<d.length;i++)
    	 {
    		 count1[c[i]]++;
    		 count2[d[i]]++;
    		 
    	 }
    	 
    	 for(int i = 0 ; i < 256 ; i ++)
    	 {
    		 if(count1[i]!=count2[i])
    		 {
    			return false;
    		 }
    		 
    		
    	 }
		return true;
   }
     
     
     //Print anagarams
     
     public void permutations(String s10, int l , int r)
     {
    	 if(l==r)
    	 {
    		 System.out.println(s10);
    	 }
    	 
    	 else
    	 {
    		 for(int i = l ; i <=r ; i ++)
    		 {
    			 s10= swaps(s10,l,i);
    			 permutations(s10,l+1,r);
    			 s10=swaps(s10,l,i);
    		 }
    	 }

     }
     
     public static String swaps(String s10, int m, int n) 
 	{
 		char[] a = s10.toCharArray();
 		char temps = a[m];
 		a[m]=a[n];
 		a[n]=temps;
 		return String.valueOf(a);
 		
 	}

     
	


	public static void main(String[] args) 
	{

		StringBuilder sb = new StringBuilder();
		String s = "hhellowhowareyou";
		Dup d = new Dup();
		d.duplicates(s);
		System.out.println("Reverse1");
		d.reverseS(s);
		System.out.println("");
		System.out.println("Reverse2");
		d.reverseS1(s);
		System.out.println("");
		System.out.println("Reverse3");
		d.reverseS3(s);
		System.out.println("Reversed string4 is:");
        d.reverseS4(s);
        System.out.println("Reversed string5 is:");
        d.reverseS5(s);
        String s6 = "equal";
        String s7 = "tat";
        System.out.println("");
        System.out.print("Palindrome : ");
        d.palindrome(s6);
        d.palindrome(s7);
        System.out.print("MoveNumbers: ");
        int[] array = {2,-1,1,0,1,0,-3};
        int n = array.length;
        d.move(array, n);
        
        String s8="Hello";
        String s9="Hi";
        if(d.checkAnagram(s8,s9))
	    {
	          System.out.println("Anagram");
	    }
	    else 
	    {
	         System.out.println("Not an Anagram");
	    }
        	
        String s10 ="ABC";
	    int n2 =s10.length();
	    d.permutations(s10, 0, n2-1);
	    
	  
        
       
	}

}
