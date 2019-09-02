package New;

import java.util.Scanner;

public class MatrixMultiplication 
{
	public static int Min(int arr[])
	{
		int temp[][] = new int[arr.length][arr.length];
        int q = 0;
        for(int l=2; l < arr.length; l++)
        {
            for(int i=0; i < arr.length - l; i++)
            {
                int j = i + l;
                temp[i][j] = 1000000;
                for(int k=i+1; k < j; k++)
                {
                    q = temp[i][k] + temp[k][j] + arr[i]*arr[k]*arr[j];
                    if(q < temp[i][j])
                    {
                        temp[i][j] = q;
                    }
                }
            }
        }
        return temp[0][arr.length-1];
	}
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Length of Array");
		int n=in.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the numbers");
		for(int i =0 ; i<n ;i++)
		{
			arr[i]=in.nextInt();
		}
		MatrixMultiplication mm = new MatrixMultiplication();
		int result=mm.Min(arr);
		System.out.println(result);
	}
}

//Enter the Length of Array
//4
//Enter the numbers
//1
//2
//3
//4
//18

// Enter the Length of Array
// 1
// Enter the numbers
// 1
// 0

// //Enter the Length of Array
// 2
// Enter the numbers
// -1
// -2
// 0


//Time Taken 45min

