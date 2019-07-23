import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
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
		
		//int target=0;
		System.out.println("Enter the target");
		int target=a.nextInt();
		for(int i =0;i<n;i++)
		{
			for(int j =i+1;j<n;j++)
			{
				if(array[i]+ array[j]==target)
				{
					System.out.println(array[i] + ", " + array[j]); 	
				}
			}
		}
		
		
		// TODO Auto-generated method stub

	}

}

//Test Case Positive nos
//Enter the number of elements
//5
//Enter numbers
//1
//2
//3
//4
//5
//Enter the target
//6
//1, 5
//2, 4


//Test Case Negative nos
//Enter the number of elements
//4
//Enter numbers
//-1
//-3
//-6
//-7
//Enter the target
//-4
//-1, -3

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
