package New;

public class MatrixWays {
	
	//count all paths from top left to bottom right 
	
	static int numbercount(int m , int n)
	{
		if(m==0 || n==0)
		{
			System.out.println("Invalid");
		}
		//create a 2D table to store the subproblem
		int T[][]=new int [m+1][n+1];
		
		//Iterate through column to get the number of paths
		for(int i = 0 ; i < m ; i ++)
		{
			T[i][0]=1;
		}
		
		//Iterate through row to get the number of paths
		for(int j = 0 ; j < n ; j ++)
		{
					T[0][j]=1;
		}
		
		//GET THE PATHS FOR OTHER CELLS 
		for(int i = 1 ; i < m ; i++)
		{
			for(int j = 1 ; j < n ; j++)
			{
				T[i][j] =T[i-1][j] +  T[i][j-1];
			}
		}
		
		return T[m-1][n-1];
				
	}

	public static void main(String[] args)
	{
		System.out.println("Total No of  paths : " +numbercount(3,3));
		System.out.println("Total No of  paths : " +numbercount(1,1));
		System.out.println("Total No of  paths : " +numbercount(0,1));
		
	}

}


//Total No of  paths : 6
//Total No of  paths : 1
//Invalid