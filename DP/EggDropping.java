package New;

public class EggDropping {
	
	static int eggDropp(int n , int k)
	{
		int t[][]=new int [n+1][k+1];
		int res;
		int i ,j ,x;
		//one trail for a floor and zero trail for zero floor
		for(i =1 ; i<=n;i++)
		{
			t[i][1]=1;
			t[i][0]=0;
		}
		
		//Jtrails for a egg and j floors
		for(j = 1 ; j <= k ; j++)
		{
			t[1][j]=j;
		}

		for(i = 2 ; i<=n ;i ++)
		{
			for(j=2 ; j <=k ; j++)
			{
				t[i][j]=Integer.MAX_VALUE;
				for(x=1;x<=j;x++)
				{
					res=1+max(t[i-1][x-1],t[i][j-x]);
					if(res<t[i][j])
					{
						t[i][j]=res;
					}
				}
				
			}
			
			
		}
		return t[n][k];
	}
	

	static int max(int a , int b)
	{
		return (a>b) ? a:b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2 , k =10;
		System.out.print("Minimum trails and floors:" + eggDropp(n,k));
	}

}

//Minimum trails and floors:4
