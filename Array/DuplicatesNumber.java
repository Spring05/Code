package Array;
import java.util.Scanner;

public class DuplicatesNumber 
{
	    public static int removeDuplicate(int array[], int n)
	    { 
	        int j = 0;
	        for (int i=0; i < n-1; i++)
	        {
	            if (array[i] != array[i+1])
	            {
	                array[j++] = array[i];
	            }
	        }
	        array[j++] = array[n-1];
	        return j;
	    }
	     
	    public static void main (String[] args)
	    {
	    	Scanner a = new Scanner(System.in);
	    	System.out.println("Enter the number of elements");
	    	int n;
	    	n=a.nextInt();
	    	int[] array= new int[n];
	    	System.out.println("Enter the elements");
	    	for(int i = 0 ;i<n; i++)
	    	{
	    		array[i]=a.nextInt();
	    	}
	        n = removeDuplicate(array, n);  
	        for (int i=0; i<n; i++)
	        {
	           System.out.print(array[i]+" ");
	        }
	    }
	}


//TEst case 
//Enter the number of elements
//5
//Enter the elements
//30
//20
//20
//20
//50
//30 20 50 

//Enter the number of elements
//4
//Enter the elements
//-2
//-2
//-1
//-1
//-2 -1 



