package New;

import java.util.Scanner;

public class LongestIncreasing {

	public int ls(int arr[],int n)
	{
		int result[]=new int[n];
		int max=0;
		for(int i =0 ; i < n;i++)
		{
			result[i]=1;
			
		}
		
		for(int i = 0 ;i<n;i++)
		{
			for(int j = 0 ; j<i ;j++)
				
				if(arr[i]>arr[j] && result[i]<result[j] +1)
				{
					result[i]=result[j]+1;
				}
		}
		
		for(int i =0 ;i < n ; i++)
		{  
			if( max < result[i])
			{
				max=result[i];
			}
		}
		return max;
	}
	public static void main(String[] args)
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
		LongestIncreasing li = new LongestIncreasing();
		int r = li.ls(arr, n);
		System.out.println("length:" + r);
				
	}

}


//Enter the Length of Array
//6
//Enter the numbers
//10
//2
//9
//3
//8
//4
//length:3


//Enter the Length of Array
//8
//Enter the numbers
//10
//22
//9
//33
//21
//50
//41
//60
//length:5

//30 min

//Enter the Length of Array
//1
//Enter the numbers
//1
//length:1
