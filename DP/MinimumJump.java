package New;

public class MinimumJump {
	
	public static int jumps(int arr[] ,int n)
	{
		int T[] = new int[n];
		if(n==0 || arr[0]==0)
		{
			return Integer.MAX_VALUE;
		}
		T[0]=0;
		
		for(int i = 1 ; i<n;i++)
		{
			T[i]=Integer.MAX_VALUE;
			for(int j = 0 ; j <i;j++)
			{
				if( i <= j + arr[j] && T[j]!=Integer.MAX_VALUE)
				{
					T[i]=Math.min(T[i], T[j]+1);
					break;
				}
			}
		}
		
		return T[n-1];
	}

	public static void main(String[] args)
	{
		int arr[]= {1,3,6,1,0,9};
		System.out.println("Minimum Jump reach end to array :" + jumps(arr,arr.length));

	}

}

//Minimum Jump reach end to array :3