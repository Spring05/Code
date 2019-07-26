import java.util.Arrays;
import java.util.Scanner;

public class Duplicates 
{

	static int dup(int array[],int n)
	{
		int unique=0;
	    for (int i = 0; i < n-1	; i++)
	    {
	        if (array[i] !=array[i+1])
	        {
	            array[unique++] = array[i];
	        }   
        
	    }
    
	    array[unique++] = array[n-1]; 
	    return unique;    
    }
	
	static int Sortings(int array[],int n)
	{
		for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (array[j] > array[j+1]) 
                { 
                    
                    int temp = array[j]; 
                    array[j] = array[j+1]; 
                    array[j+1] = temp; 
                }
		return n; 
	}
	public static void main(String[] args) 
	{
		Scanner a =new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n;
		n= a.nextInt();
		int[] array =new int[n];
		System.out.println("Enter numbers");
		for(int i = 0 ; i < n ; i++)	
		{
			array[i]=a.nextInt();
		}
        
		
		n=Sortings(array,n);
		n=dup(array,n);
        for (int i=0; i<n; i++) 
        {
        System.out.print(array[i]+" "); 
        }
        
      }

}


//Test case 1
//Enter the number of elements
//3
//Enter numbers
//10
//10
//20
//10 20 

//Test Case 2
//Enter the number of elements
//4
//Enter numbers
//-1
//-1
//-2
//-2
//-1 -2 



//Unsorted 
//Test Case 1 Positive Numbers
//Enter the number of elements
//5
//Enter numbers
//5
//4
//3
//2
//2
//2 3 4 5 



//Test Case 2
//Enter the number of elements
//4
//Enter numbers
//-2
//-6
//-3
//-2
//-6 -3 -2 
