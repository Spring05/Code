package New;

public class MinCostPath 
{
	
	public int minCost(int[][]cost , int m,int n)
	{
		int temp[][]=new int[m+1][n+1];
		temp[0][0]=cost[0][0];
		
		//First Row 
		for(int j =1; j<=n;j++)
		{
			temp[0][j]=temp[0][j-1] + cost[0][j];
			
		}
		
		
		//First Column 
		for(int i =1 ; i <=m ; i++)
		{
			temp[i][0]=temp[i-1][0]+cost[i][0];
			
		}
		for(int i = 1;i <=m;i++)
		{
			for(int j=1;j<=n ; j++)
			{
				temp[i][j]=cost[i][j]+ min(temp[i-1][j-1],temp[i-1][j],temp[i][j-1]);
			}
		}
		return temp[m][n];	
	}
	
	private int min(int x , int y , int z)
	{
		if(x<y)
		{
			return (x<z) ? x:z;
		}
		
		else
		{
			return (y<z) ? y : z;
		}
	}
	

	public static void main(String[] args) 
	{
		MinCostPath m=  new MinCostPath();
		int cost[][]= {{1,2,3},{4,8,2},{1,5,3},{6,2,9}};
		int r = m.minCost(cost,3,2);
		System.out.print(r);
		

	}

}

//17