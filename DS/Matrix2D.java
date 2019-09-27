package New;

public class Matrix2D {
	
	//first column and first row to track if col or row is set to 0 
	
	public void setZeroes(int[][]matrix) 
	
	{
		if( matrix.length <=0 || matrix[0].length <= 0 || matrix == null)
		{
			System.out.println("Not a valid matrix");
		}
		
		
		
		//have a flag with the boolean value 
		boolean setRow=false;
		boolean setCol=false;
		
		//set first row and column to zero or not
		for(int i =0 ; i < matrix.length;i++)
		{
			if(matrix[i][0]==0)
			{
				setCol=true;
				break;
			}
		}
		
		for(int j =0 ; j < matrix[0].length;j++)
		{
			if(matrix[0][j]==0)
			{
				setRow=true;
				break;
			}
		}
		
		//use first row and column to mark zero and column
		for(int i =1 ; i < matrix.length;i++)
		{
			for(int j =1 ; j < matrix[0].length;j++)
			{
				if(matrix[i][j]==0)
				{
					matrix[i][0]=0;
					matrix[0][j]=0;
				}
			}
		}
		
		
		//set each elements by using the marks in first row and column 
		for(int i =1 ; i < matrix.length;i++)
		{
			for(int j =1 ; j < matrix[0].length;j++)
			{
				if(matrix[i][0]==0 || matrix[0][j]==0)
				{
					matrix[i][j]=0;
				}
			}
		}
		
		//set the first row and column 
		if(setRow)
		{
			for(int i =0 ; i < matrix.length;i++)
			{
				matrix[i][0]=0;
			}
			
		}
		
		if(setCol)
		{
			for(int i =0 ; i < matrix.length;i++)
			{
				matrix[0][i]=0;
			}
		}
		
			
	}

	public static void main(String[] args) 
	{
		
		Matrix2D m = new Matrix2D();
//		int[][] matrix= {
//                {1,1,1,0},
//                {1,1,1,0},
//                {1,1,0,0},
//                {1,0,0,0}};
		int[][] matrix = {{},{}};
		m.setZeroes(matrix);
		for(int i = 0 ; i <matrix.length ; i ++)
		{
			for(int j = 0 ; j <matrix[0].length;j++)
			{
				System.out.print(matrix[i][j] + "");
			}
			
			System.out.println("");
		}
		}
		
		}
		

	


//Time complexity O(r*c);
//Space complexity O(1);