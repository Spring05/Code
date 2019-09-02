package New;

import java.util.Scanner;

public class Subset {
	
	public boolean subSet(int num[],int sum)
	{
		boolean R[][]=new boolean[num.length+1][sum+1];
		for(int i=0 ;i<=num.length ; i++)
		{
			R[i][0]=true;
		}
		
		for (int i =1;i<=num.length;i++)
		{
			for(int j =1 ; j<=sum;j++)
			{
				if(j-num[i-1]>=0)
				{
					R[i][j]=R[i-1][j] || R[i-1][j-num[i-1]];
					
				}
				
				else
				{
					R[i][j]=R[i-1][j];
				}
			}
		}
		return R[num.length][sum];
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Length of Array");
		int n=in.nextInt();
		int[] num = new int[n];
		System.out.println("Enter the numbers");
		for(int i =0 ; i<n ;i++)
		{
			num[i]=in.nextInt();
		}
		Subset s = new Subset();
		boolean result=s.subSet(num,11);
		System.out.println(result);

	}

}

//Enter the Length of Array
//4
//Enter the numbers
//2
//3
//7
//8
//true

//Time taken 30 min

