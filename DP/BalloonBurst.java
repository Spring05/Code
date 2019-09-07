package New;

public class BalloonBurst {
	
	public int maxcoins(int nums[])
	{
		 int T[][] = new int[nums.length][nums.length];

	        for (int len = 1; len <= nums.length; len++)
	        {
	            for (int i = 0; i <= nums.length - len; i++)
	            {
	                int j = i + len - 1;
	                for (int k = i; k <= j; k++) 
	                {
	                    //leftValue , rightValue is initially 1. 
	                    
	                    int leftValue = 1;
	                    int rightValue = 1;
	                    
	                    //if element present in left , left value is taken
	                    if (i != 0) 
	                    {
	                        leftValue = nums[i-1];
	                    }
	                    
	                  //if element present in right, right value is taken
	                    if (j != nums.length -1) 
	                    {
	                        rightValue = nums[j+1];
	                    }

	                    //default value  if k= i 
	                    int before = 0;
	                    
	                    //default value if k = j 
	                    int after = 0;
	                    
	                    
	                    if (i != k) 
	                    {
	                        before = T[i][k-1];
	                    }
	                    
	                    if (j != k) 
	                    {
	                        after = T[k+1][j];
	                    }
	                    
	                    T[i][j] = Math.max(leftValue * nums[k] * rightValue + before + after,T[i][j]);
	                }
	            }
	        }
	        return T[0][nums.length - 1];
	}

	public static void main(String[] args) 
	{
		BalloonBurst b = new BalloonBurst();
		int nums[] = { 3,1,5,8};
		System.out.println("The maximum coins collected by bursting balloons :" + b.maxcoins(nums));

	}

}

//The maximum coins collected by bursting balloons :167

