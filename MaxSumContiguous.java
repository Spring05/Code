package New;

import java.util.Scanner;

public class MaxSumContiguous {
	
	public static int sum(int[] array)
	{
		if(array.length==0)
		{
			System.out.println("Empty Array");
		}
		if(array.length==1)
		{
			System.out.println("Single Element");
		}
		
		int R[] = new int[array.length];
		for(int i = 0 ; i < R.length ; i ++)
		{
			R[i]=array[i];
			
		}
		
		for(int i =1 ; i < R.length ; i ++)
		{
			for(int j = 0 ; j < i ; j++)
			{
				if(array[j] < array[i])
				{
					R[i]=Math.max(array[i]+R[j],R[i]);
				}
			}
		}
		
		int max =R[0];
		for(int i = 0 ; i <R.length ; i ++)
		{
			if(R[i]>max)
			{
				max=R[i];
			}
			
		}
		
		return max;
		
	}

	public static void main(String[] args) 
	{
		MaxSumContiguous m = new MaxSumContiguous();
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the length");
		int n=a.nextInt();
		int[] array=new int[n];
		System.out.println("Enter the number");
		for(int i =0 ;i < n;i++)
		{
			array[i]=a.nextInt();
		}
		int ans = MaxSumContiguous.sum(array);
		System.out.println("Sum :" +ans);

	}

}


//Enter the length
//1
//Enter the number
//1
//Single Element
//1

//Enter the length
//0
//Empty Array


//Enter the length
//5
//Enter the number
//-3
//-1
//2
//-4
//9
//Sum:11
