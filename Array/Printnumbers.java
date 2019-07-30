package Array;
import java.util.Scanner;

public class Printnumbers 
{

	public static void main(String[] args) 
	{
		Scanner a =new Scanner(System.in);
		int[] array =new int[10];
		System.out.println("Enter numbers");
		for(int i =0 ;i<array.length;i++)
		{
			array[i]=a.nextInt()+2;
		}
		
		System.out.println("Result");
		for(int i:array)
		{
			System.out.println(i);
		}
	}
}


//Input output
//Test Case 1 - Positive nos 
//Enter numbers
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
//Result
//3
//4
//5
//6
//7
//8
//9
//10
//11
//12

//Test Case 2 - negative nos
//Enter numbers
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
//Result
//1
//0
//-1
//-2
//-3
//-4
//-5
//-6
//-7
//-8


//Test Case 3 - float nos
//Enter numbers
//1.22
//Exception in thread "main" java.util.InputMismatchException
//	at java.util.Scanner.throwFor(Unknown Source)
//	at java.util.Scanner.next(Unknown Source)
//	at java.util.Scanner.nextInt(Unknown Source)
//	at java.util.Scanner.nextInt(Unknown Source)
//	at Printnumbers.main(Printnumbers.java:13)

//Test Case 4 - Special characters
//Enter numbers
//@
//Exception in thread "main" java.util.InputMismatchException
//	at java.util.Scanner.throwFor(Unknown Source)
//	at java.util.Scanner.next(Unknown Source)
//	at java.util.Scanner.nextInt(Unknown Source)
//	at java.util.Scanner.nextInt(Unknown Source)
//	at Printnumbers.main(Printnumbers.java:13)

//Test Case 5 - space
//Enter numbers
//

