package spring;

public class RotateMatrix {

	//transpose the rows the first row becomes the first column
	//Reverse the rows  1st row becomes the last row 
	
	public void rotate(int[][] matrix) 
	{
		if(matrix.length==0 || matrix[0].length==0 || matrix ==null)
		{
			System.out.println("Not Valid");
			return;
		}
		
		transpose(matrix);
		reverse(matrix);
		printm(matrix);
	}
	
	
	public void transpose(int[][] matrix) 
	{
		//transpose
		for(int i = 0 ; i < matrix.length ; i++)
		{
			for(int j = i ;  j < matrix[0].length ; j++)
			{
				int temp = matrix[j][i];
				matrix[j][i]=matrix[i][j];
				matrix[i][j]= temp;
			}
			
		}
	}
	
	public void reverse(int[][] matrix) 
	{
		
		for(int i = 0 ; i < matrix.length ; i++)
		{
			for(int j = 0 ;  j < matrix[0].length/2; j++)
			{
				int temp = matrix[i][j];
				matrix[i][j]=matrix[i][matrix[0].length-j-1];
				matrix[i][matrix[0].length-j-1]= temp;
			}
			
		}
	}
		
		public  void printm(int[][] matrix) 
		{
		        for (int i = 0; i < matrix.length; i++)
		        { 
		          for (int j = 0; j <matrix[0].length; j++)
		          {
		                System.out.print(matrix[i][j] + " "); 
		          }
		           
		          System.out.println(""); 
		        } 
		}	
		
	
	public static void main(String[] args) 
	{
		int matrix[][] = 
			{ 
				{ 1, 2, 3, 4 }, 
                { 5, 6, 7, 8 }, 
                { 9, 10, 11, 12 }, 
                { 13, 14, 15, 16 } 
                
			}; 
		
		int matrix2[][] = {{},{}};
		int matrix3[][] = {{1},{1}};
		
		RotateMatrix m = new RotateMatrix();
		m.rotate(matrix);
		m.rotate(matrix2);
		m.rotate(matrix3);

	}

}


//13 9 5 1 
//14 10 6 2 
//15 11 7 3 
//16 12 8 4 
//Not Valid
//1 
//1 

//Time Com =o(ij);

