package New;

public class MatrixtwoD {
	
	public static int serachMatrix(int[][] matrix , int target)
	{
		if(matrix.length==0||matrix[0].length==0||matrix==null)
		{
			return 0;
			
		}
		
		int m = matrix.length;
		int n = matrix[0].length;
		
		int start = 0;
		int end = m*n-1;
		while(start<=end)
		{
			int mid = (start+end)/2;
			int midX=mid/n;
			int midY=mid%n;
			
			if(matrix[midX][midY]==target)
			{
				System.out.println("Index :" + midX + "" +midY);
				return 1;
			}
			
			if(matrix[midX][midY]<target)
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		
		//System.out.println("Element not found");
		return -1;
	}

	public static void main(String[] args) 
	{
		int[][]matrix= { {1,   3,  5,  7},
		                 {10, 11, 16, 20},
				         {23, 30, 34, 50} };
		int target =3;
		System.out.println(serachMatrix(matrix,target));
						  
	}

}
