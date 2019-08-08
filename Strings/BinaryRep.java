package New;

import java.util.Scanner;

public class BinaryRep {
	
	 static void  binrep(int nums)
	 {
		 if (nums > 1) 
		 {
			 binrep(nums/2); 
		 }
		 
		 System.out.print(nums % 2);  
	}
	public static void main(String[] args) 
	{
		Scanner a =new Scanner(System.in);
		System.out.println("Enter the number :");
		int nums= a.nextInt();
		System.out.println("Binary rep:");
		binrep(nums);
	}

}

//Enter the number :
//7
//Binary rep:
//111

//Enter the number :
//39
//Binary rep:
//100111


//Time Complexity - Theta(logn)