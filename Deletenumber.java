import java.util.Scanner;

public class Deletenumber 
{

	public static void main(String[] args) 
	{
		
		Scanner a =new Scanner(System.in);
		int n;
		System.out.println("Enter the number of elements");
		n= a.nextInt();
		int[] array =new int[n];
		System.out.println("Enter numbers");
		for(int i =0 ;i<n;i++)
		{
			array[i]=a.nextInt();
		}
		
		System.out.println("Enter number to be deleted ");
		int number=a.nextInt();
		for(int i =0 ;i<n;i++)
		{
			if(array[i]==number)
			{
				for(int j =i;j<array.length-1;j++)
				{
					array[j]=array[j+1];
				}		
			}
				
		}
		
		
		System.out.println("New Array after deletion ");
		if (array.length==0) 
		{
			  System.out.println("array is empty");
		}
		for(int i =0 ;i<n-1;i++)
		{
			
			System.out.println(array[i]);
			
		}
		
		
	}
}


//Enter the number of elements
//1
//Enter numbers
//1
//Enter number to be deleted 
//1
//New Array after deletion 

	
	//Test Case positive number
	
	//Enter numbers
//	1
//	2
//	3
//	4
//	5
//	6
//	7
//	8
//	Enter number to be deleted 
//	1
//	New Arrayafter deletion 
//	2
//	3
//	4
//	5
//	6
//	7
//  8
	
	//test case negative nos 
//	Enter numbers
//	-1
//	-2
//	-3
//	-4
//	-5
//	-6
//	-7
//	-8
//	Enter number to be deleted 
//	-8
//	New Arrayafter deletion 
//	-1
//	-2
//	-3
//	-4
//	-5
//	-6
//	-7
	
	
	//test Case - Special Character
//	Enter numbers
//	-56
//	-90
//	@
//	Exception in thread "main" java.util.InputMismatchException
//		at java.util.Scanner.throwFor(Unknown Source)
//		at java.util.Scanner.next(Unknown Source)
//		at java.util.Scanner.nextInt(Unknown Source)
//		at java.util.Scanner.nextInt(Unknown Source)
//		at Deletenumber.main(Deletenumber.java:14)






