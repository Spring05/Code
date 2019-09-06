package New;

import java.util.Arrays;

public class MinCoin {
	
	public int coinChange(int[] coins , int amount)
	{
		//default values 
		int max = amount +1;
		
		//dp stores subproblem
		int[] dp=new int[amount+1];
		
		//intialize the table
		Arrays.fill(dp,max);
		
		//min coins for 0 is 0 coins
		dp[0]=0;
		
		//subproblem frm 1 to amount
		for(int i =1 ; i <= amount ; i ++)
		{
			//for each coin 
			
			for(int j=0;j<coins.length;j++)
			{
				//if its is less than or eqal to subproblem amount
				if(coins[j] <=i);
				{
					//chk for optimal sol
					dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
				}
			}
		}
		
		//dp[amount] rp the final result , if not amount +1 
		return dp[amount] >amount ?-1 :dp[amount];
		
	}

	public static void main(String[] args) {
		MinCoin m = new MinCoin();
		int amount = 13;
		int coins[] = { 7, 3 , 2 , 6};
		int result = m.coinChange(coins, amount);
		System.out.print(result);

	}

}
