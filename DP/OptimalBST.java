package New;

public class OptimalBST {
	
	static int BST(int keys[],int freq[],int n)
	{
		int cost[][]=new int[n+1][n+1];
		int i;
		//for single key cost is equal to the freq of key
		for(i = 0 ; i < n ; i++)
		{
			cost[i][i]=freq[i];
		}
		
		for(int l =2 ; l<=n ; l++)
		{ //get column number j from row number i and l 
			for(i = 0; i<= n-l+1;i++)
			{
			int j = i+l-1;
			cost[i][j]=Integer.MAX_VALUE;
			
				//try making all keys in interval[i..j] as root
				for(int r = i ; r <=j ; r++)
				{
				//cost when keys [r] becomes root of subtree
				int c = ((r > i) ? cost[i][r - 1] : 0)  + ((r < j) ? cost[r + 1][j] : 0) + sum(freq, i, j); 
                if (c < cost[i][j]) 
                {
                    cost[i][j] = c; 
			}	}
			
		}
	}
		
		return cost[0][n - 1]; 
	}
	
	
	 //get sum of array elements  
    
    static int sum(int freq[], int i, int j) 
    { 
        int s = 0; 
        for (int k = i; k <= j; k++) 
        { 
            if (k >= freq.length) 
                continue; 
            s += freq[k]; 
        } 
        return s; 
    } 

	public static void main(String[] args) 
	{
		 int keys[] = { 10, 12, 20 }; 
	     int freq[] = { 34, 8, 50 }; 
	     int n = keys.length; 
	     System.out.println("Cost of Optimal BST is "  + BST(keys, freq, n)); 

	}

}


//Cost of Optimal BST is 142
 