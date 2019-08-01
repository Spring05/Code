package Array;


import java.util.Scanner;

public class largestNumber 
{
	
	static void  largest(int[] array, int n)
	{
		int[] hash = new int[10];
		
		for(int i = 0; i < n; i++) 
		{ 
		    hash[array[i]]++; 
		}
		
		for(int i=9 ;i >=0 ;i--)
		{
			for(int j = 0; j < hash[i]; j++) 
			{
		        System.out.print(i); 
			}
		}
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
		largest(array,n);
		
	}

}


//Test CAse
//Enter the number of elements
//6
//Enter numbers
//1
//2
//3
//4
//5
//0
//543210


//Test Case 
//Enter the number of elements
//5
//Enter numbers
//4
//7
//9
//2
//3
//97432

//Test Case
//Enter the number of elements
//8
//Enter numbers
//8
//6
//0
//4
//6
//4
//2
//7
//87664420
