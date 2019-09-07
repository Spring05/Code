package New;

public class MaxSumSubeq 
{
	static int maxSum(int arr[] , int n)
	{
		int i , j , max=0;
		int T[]=new int[n];
		
		//intialize the value 
		for(i = 0 ; i < n;i++)
		{
			T[i]=arr[i];
		}
		
		for( i = 0 ; i < n ; i++)
		{
			for(j=0 ; j< i ; j++)
			{
				if(arr[i] > arr[j] && T[i]< T[j] + arr[i])
				{
					T[i] = T[j] + arr[i];
				}
			}
		}
		
		//Find max value
		for( i =0 ; i<n ; i++)
		{
			if(max < T[i])
			{
				max=T[i];
			}
		}
		
		return max;
			
	}
	

	public static void main(String[] args)
	{
		int arr[] = { 1 , 101 , 2 , 3 ,100 , 4,5};
		int n = arr.length;
		System.out.println("Maximum Sum Increasing Subsequence " + maxSum(arr,n));
		
		

	}

}
//
//Maximum Sum Increasing Subsequence 106
