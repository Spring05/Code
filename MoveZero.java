import java.util.Scanner;

public class MoveZero {

	public static void main(String[] args) 
	{
		
		Scanner a =new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n, temp ,nonzero=0;
		n= a.nextInt();
		int[] array =new int[n];
		System.out.println("Enter numbers");
		
			
		for(int i =0 ;i<n;i++)	
		{
			array[i]=a.nextInt();
		}
		
		for(int i =0; i<n;i++)
		{
			if(array[i]!=0)
			{
				array[nonzero++]=array[i];
			}
		}
		
		while(nonzero<n)
		{
			array[nonzero++]=0;
		}
		
		System.out.println("New Array ");
		for(int i =0 ;i<n;i++)
		{
			System.out.println(array[i]);
		}
		
	}

}



//Test  Case 1 -Positive Nos
//Enter the number of elements
//4
//Enter numbers
//2
//4
//0
//1
//New Array 
//2
//4
//1
//0
//
//Test case 2 -negative nos 
//Enter the number of elements
//4
//Enter numbers
//-1
//0
//-5
//-6
//New Array 
//-1
//-5
//-6
//0
//
//Test Case 3 - Special characters
//Enter the number of elements
//3
//Enter numbers
//@
//Exception in thread "main" java.util.InputMismatchException
//	at java.util.Scanner.throwFor(Unknown Source)
//	at java.util.Scanner.next(Unknown Source)
//	at java.util.Scanner.nextInt(Unknown Source)
//	at java.util.Scanner.nextInt(Unknown Source)
//	at MoveZero.main(MoveZero.java:18)
//
//Test Case 4 - Float Nos 
//
//Enter the number of elements
//2
//Enter numbers
//1.0
//Exception in thread "main" java.util.InputMismatchException
//	at java.util.Scanner.throwFor(Unknown Source)
//	at java.util.Scanner.next(Unknown Source)
//	at java.util.Scanner.nextInt(Unknown Source)
//	at java.util.Scanner.nextInt(Unknown Source)
//	at MoveZero.main(MoveZero.java:18)


