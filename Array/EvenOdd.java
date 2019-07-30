package Array;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args)
	{
		Scanner a =new Scanner(System.in);
		int[] array =new int[10];
		System.out.println("Enter numbers");
		for(int i =0 ;i<array.length;i++)
		{
			array[i]=a.nextInt();
		}
		
		System.out.println("Even numbers");
		for(int i =0 ;i<array.length;i++)
		{
			if(array[i]%2==0)
			{
				System.out.println(array[i]);
			}						
		}

		System.out.println("Odd numbers");
		for(int i =0 ;i<array.length;i++)
		{
			if(array[i]%2!=0)
			{
				System.out.println(array[i]);
			}						
		}

	}

}

//Enter numbers
//Test case -1 positive nos 
//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
//Even numbers
//2
//4
//6
//8
//10
//Odd numbers
//1
//3
//5
//7
//9


//Test case 2 - Negative Nos
//-1
//-2
//-3
//-4
//-5
//-6
//-7
//-8
//-9
//-10
//Even numbers
//-2
//-4
//-6
//-8
//-10
//Odd numbers
//-1
//-3
//-5
//-7
//-9


//Test Case 3 :Special characters 
//Enter numbers
//
//@
//Exception in thread "main" java.util.InputMismatchException
//	at java.util.Scanner.throwFor(Unknown Source)
//	at java.util.Scanner.next(Unknown Source)
//	at java.util.Scanner.nextInt(Unknown Source)
//	at java.util.Scanner.nextInt(Unknown Source)
//	at EvenOdd.main(EvenOdd.java:12)


//Test 4 : FloatingNos
//Enter numbers
//
//1.0
//Exception in thread "main" java.util.InputMismatchException
//	at java.util.Scanner.throwFor(Unknown Source)
//	at java.util.Scanner.next(Unknown Source)
//	at java.util.Scanner.nextInt(Unknown Source)
//	at java.util.Scanner.nextInt(Unknown Source)
//	at EvenOdd.main(EvenOdd.java:12)

//Test 5 : Space
//Enter numbers


