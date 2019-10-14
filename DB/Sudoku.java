package New;

public class Sudoku {
	
	
		int[] mat[];
		int N ;//no of  cols and rows
		int sqN; //sqr root of rows/column
		int K ; // Numbers to be solved
		
		Sudoku(int N , int K)
		{
			this.N= N;
			this.K =K;
			Double d  = Math.sqrt(N); //square root of N to get sqNxsqN block 
			sqN=d.intValue();
			mat=new int[N][N];
		}
		
		//Sudolu generator 
		public void fillvalues()
		{
				//diagnol matrix
			fillDiagonal(); 
			
			//remaining ones 
			fillRemaining(0, sqN);
			
			 // Remove Randomly K digits to make game 
	        removeKDigits(); 

			
		}

		private void fillDiagonal() 
		{
			for(int i = 0 ; i <N ; i=i+sqN)	
			{
				// for diagonal box, start coordinates->i==j 
				fillBox(i, i);
			}
			
		}
		
		//check if the 3x3 matrix is filled with nums or not
		boolean unusedBox(int rowstart,int colstart,int num)
		{
			for(int i = 0 ; i <sqN ; i++)
			{
				for(int j = 0 ; j < sqN ; j++)
				{
					if(mat[rowstart+i][colstart+j]==num)
					{
						return false;
					}
				}
			}
			
			return true;
		}
		
		// fill the sqNxsqN block

		private void fillBox(int row, int col) 
		{
			int no;
			for(int i = 0 ; i <sqN ; i++)
			{
				for(int j = 0 ; j < sqN ; j++)
				{
					do
	                { 
	                    no = randomGenerator(N); 
	                } 
					
					while(!unusedBox(row,col,no));
					{
						mat[row+1][col+1]=no;
					}
				}
			}
			
		}

		private int randomGenerator(int no) 
		{
			return (int) Math.floor((Math.random()*no+1)); 
		}
		
		//check if its valid to add the digits in row , col 
		 boolean CheckIfSafe(int i,int j,int num) 
		 {
			 return (unusedRow(i, num) && unusedCol(j, num) && unusedBox(i-i%sqN, j-j%sqN, num)); 
		 }
		

		    // check in the row for existence 
		    boolean unusedRow(int i,int num) 
		    { 
		        for (int j = 0; j<N; j++) 
		        {
		           if (mat[i][j] == num) 
		           {
		                return false; 
		           }
		        }
		        return true; 
		    } 
		  
		    // check in the col for existence 
		    boolean unusedCol(int j,int num) 
		    { 
		        for (int i = 0; i<N; i++)
		        {
		            if (mat[i][j] == num) 
		            {
		                return false; 
		            }
		        }
		        return true; 
		    } 
		    
		 //fill the rest 
		    boolean fillRemaining(int i, int j) 
		    { 
		        if (j>=N && i<N-1) 
		        { 
		            i = i + 1; 
		            j = 0; 
		        } 
		        
		        if (i>=N && j>=N) 
		        {
		            return true; 
		        }
		  
		        if (i < sqN) 
		        { 
		            if (j < sqN) 
		            {
		                j = sqN; 
		            }
		        } 
		        else if (i < N-sqN) 
		        { 
		            if (j==(int)(i/sqN)*sqN) 
		            {
		                j =  j + sqN; 
		            }
		        } 
		        else
		        { 
		            if (j == N-sqN) 
		            { 
		                i = i + 1; 
		                j = 0; 
		                if (i>=N) 
		                {
		                    return true; 
		                }
		            } 
		        } 
		  
		        for (int num = 1; num<=N; num++) 
		        { 
		            if (CheckIfSafe(i, j, num)) 
		            { 
		                mat[i][j] = num; 
		                if (fillRemaining(i, j+1)) 
		                {
		                    return true; 
		                }
		                mat[i][j] = 0; 
		            } 
		        } 
		        return false; 
		    } 
		
		    //remove the k digits
		    public void removeKDigits() 
		    { 
		        int count = K; 
		        while (count != 0) 
		        { 
		            int cellId = randomGenerator(N*N); 
		  
		            
		            // extract coordinates i  and j 
		            int i = (cellId/N); 
		            int j = cellId%9; 
		            if (j != 0) 
		            {
		                j = j - 1; 
		            }
		            
		            if (mat[i][j] != 0) 
		            { 
		                count--; 
		                mat[i][j] = 0; 
		            } 
		        } 
		    } 
		    
		    
		    public void printSudoku() 
		    { 
		        for (int i = 0; i<N; i++) 
		        { 
		            for (int j = 0; j<N; j++) 
		            {
		                System.out.print(mat[i][j] + " ");
		            }
		            System.out.println(); 
		        } 
		        System.out.println(); 
		    } 
	

	public static void main(String[] args) 
	{
		int N = 9, K = 20; 
        Sudoku sudoku = new Sudoku(N, K); 
        sudoku.fillvalues(); 
        sudoku.printSudoku(); 

	}

}
