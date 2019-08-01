

import java.util.Scanner;

public class moveStart 
{

	public static void main(String[] args) 
	{
		Scanner a =new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n;
		n= a.nextInt();
		int[] array =new int[n];
		if(n==0 || n==1)
			
		{//ys
			System.out.println("Not Valid ");
		}
		else
		System.out.println("Enter numbers");
		
			
		for(int i =0 ;i<n;i++)	
		{
			array[i]=a.nextInt();
		}
		
		
		
		int k=0;
    	for(int i=0;i<array.length;i++)
    	{
	    		if(array[i]<0)
	    		{
	    			int temp=array[i];
	    			array[i]=array[k];
	    			array[k]=temp;    	
	    			k++; 
	    		}  	
	    		
    	}
    		
		
		
			for(int i=0 ;i<n;i++)
			{
				System.out.println(array[i]);
			}

	}
}
	
//Test Case : Single Element
//Enter the number of elements
//1
//Not Valid 

//Test Case : Empty array
//Enter the number of elements
//0
//Not Valid 
//

//Test Case 
//Enter the number of elements
//5
//Enter numbers
//1
//
//-13
//6
//-7
//5
//New Array 
//-13
//-7
//6
//1
//5


//Test case 
//Enter the number of elements
//9
//Enter numbers
//12
//11
//-13
//-5
//6
//-7
//5
//-3
//-6
//New Array 
//-13
//-5
//-7
//-3
//-6
//12
//5
//11
//6
