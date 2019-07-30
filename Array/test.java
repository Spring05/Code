package Array;
import java.util.Scanner;

public class test {
	
		static void findDuplicatesUsingBruteForce(int[] inputArray)
		{
		    for (int i = 0; i < inputArray.length; i++) 
		    {
		        for (int j = i+1; j < inputArray.length; j++) 
		        {
		            if(inputArray[i] == inputArray[j])
		            {
		                System.out.println("Duplicate Element : "+inputArray[i]);
		            }
		        }
		    }
		}

		  public static void main(String[] args)
		   {
			  	Scanner a =new Scanner(System.in);
				System.out.println("Enter the number of elements");
				int n;
				n= a.nextInt();
				int[] inputArray =new int[n];
				System.out.println("Enter numbers");
				for(int i = 0 ; i < n ; i++)	
				{
					inputArray[i]=a.nextInt();
				}
				 
				findDuplicatesUsingBruteForce(inputArray);
				
		        
		     }
		     
		       
		}


