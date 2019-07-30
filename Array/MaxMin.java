package Array;
import java.util.Scanner;

public class MaxMin {

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
		int min = array[0];
		int max = array[0];
		for(int i = 1 ; i < n ; i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
			
			else if(array[i]<min)
			{
				min=array[i];
			}
			
		}
		
		System.out.println("Maximum in array :" +  max);
		System.out.println("Minimum in array :" +  min);

	}

}



//Test  Case 1 -Positive Nos
//Enter the number of elements
//4
//Enter numbers
//20
//45
//10
//1
//Maximum in array :45
//Minimum in array :1
//
//
//Test case 2 -negative nos 
//Enter the number of elements
//4
//Enter numbers
//-1
//-10
//-4
//-150
//Maximum in array :-1
//Minimum in array :-150
//
//0
//
//Test Case 3 - Special characters
//Enter the number of elements
//2
//Enter numbers
//1
//@
//Exception in thread "main" java.util.InputMismatchException
//	at java.util.Scanner.throwFor(Unknown Source)
//	at java.util.Scanner.next(Unknown Source)
//	at java.util.Scanner.nextInt(Unknown Source)
//	at java.util.Scanner.nextInt(Unknown Source)
//	at MaxMin.main(MaxMin.java:15)
//
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
//	at MaxMin.main(MaxMin.java:15)