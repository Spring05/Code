import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) 
	{
		//int[] array = {1, 2, 3, 4, 5, 7, 8, 9, 10 };
		Scanner a =new Scanner(System.in);
		int[] array =new int[9];
		System.out.println("Enter numbers");
		for(int i = 0 ; i <array.length ; i++)	
		{
			array[i]=a.nextInt();
		}
		int X=array[0];
		int Y=1;
		int result;
		
		for(int i =1 ; i<array.length; i++)
		{
			X = X^ array[i];
		}
		
		for(int i =2 ; i<=array.length+1; i++)
		{
			Y= Y^ i;
		}
		
		result =  X^Y;

		System.out.println("Missing number: " + result);
	}

}

//Input Output 
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
//Missing number: 10
