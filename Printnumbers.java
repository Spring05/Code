import java.util.Scanner;

public class Printnumbers 
{

	public static void main(String[] args) 
	{
	
		Scanner a = new Scanner(System.in);
		int result;
		
		for(int i =0 ;i<10;i++)
		{
		System.out.println("Enter  num:");
		result =a.nextInt()+2; 
		System.out.println("Result:" + result);	
		}	
			
	
		System.out.println("Method 2" );
		int[] array = new int[9];
		int sum =0;
		for(int j =0 ;j<=10;j++)
		{	
			System.out.println("Enter  num:");
			sum =a.nextInt()+2;
			System.out.println("Sum:" + sum);
			
		}
		
	}
	
}	

//Input-Output
//Test Case 1- Positive Numbers
//Enter  num:
//1
//Result:3
//Enter  num:
//2
//Result:4
//Enter  num:
//3
//Result:5
//Enter  num:
//4
//Result:6
//Enter  num:
//5
//Result:7
//Enter  num:
//6
//Result:8
//Enter  num:
//7
//Result:9
//Enter  num:
//8
//Result:10
//Enter  num:
//9
//Result:11
//Enter  num:
//10
//Result:12


//Test Case 2 - Negative Numbers 
//Enter  num:
//-1
//Result:1
//Enter  num:
//-2
//Result:0
//Enter  num:
//-3
//Result:-1
//Enter  num:
//-4
//Result:-2
//Enter  num:
//-5
//Result:-3
//Enter  num:
//-6
//Result:-4
//Enter  num:
//-7
//Result:-5
//Enter  num:
//-8
//Result:-6
//Enter  num:
//-9
//Result:-7
//Enter  num:
//-10
//Result:-8


//Test case 3 -Characters 
//Enter  num:
//@
//Exception in thread "main" java.util.InputMismatchException
//	at java.util.Scanner.throwFor(Unknown Source)
//	at java.util.Scanner.next(Unknown Source)
//	at java.util.Scanner.nextInt(Unknown Source)
//	at java.util.Scanner.nextInt(Unknown Source)
//	at Printnumbers.main(Printnumbers.java:16)


//Test Case 4 - space
//Enter  num:






//Method 2 //Test Case 1- Positive Numbers
//Enter  num:
//1
//Sum:3
//Enter  num:
//2
//Sum:4
//Enter  num:
//3
//Sum:5
//Enter  num:
//4
//Sum:6
//Enter  num:
//5
//Sum:7
//Enter  num:
//6
//Sum:8
//Enter  num:
//7
//Sum:9
//Enter  num:
//8
//Sum:10
//Enter  num:
//9
//Sum:11
//Enter  num:
//10
//Sum:12
//Enter  num:
//11
//Sum:13


//Test Case 2- Negative Numbers
//Method 2
//Enter  num:
//-1
//Sum:1
//Enter  num:
//-2
//Sum:0
//Enter  num:
//-3
//Sum:-1
//Enter  num:
//-4
//Sum:-2
//Enter  num:
//-5
//Sum:-3
//Enter  num:
//-6
//Sum:-4
//Enter  num:
//-7
//Sum:-5
//Enter  num:
//-8
//Sum:-6
//Enter  num:
//-9
//Sum:-7
//Enter  num:
//-10
//Sum:-8
//Enter  num:
//-11
//Sum:-9


//Test Case 3- Space
//Method 2
//Enter  num:



//Test Case 4- Special Characters
//Method 2
//Enter  num:
//@
//Exception in thread "main" java.util.InputMismatchException
//	at java.util.Scanner.throwFor(Unknown Source)
//	at java.util.Scanner.next(Unknown Source)
//	at java.util.Scanner.nextInt(Unknown Source)
//	at java.util.Scanner.nextInt(Unknown Source)
//	at Printnumbers.main(Printnumbers.java:26)
