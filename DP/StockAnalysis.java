package New;

public class StockAnalysis {

	public int maxProfit(int[] prices)
	{
		int maxprofit =0 ;
		int minPrice =Integer.MAX_VALUE;
		for( int i = 0 ; i < prices.length;i++)
		{
			minPrice=Math.min(prices[i], minPrice);
			maxprofit=Math.max(maxprofit, prices[i]-minPrice);
		}
		
		return maxprofit;
	}
	
	public static void main(String[] args) 
	{
		StockAnalysis s = new StockAnalysis();
		int[] prices = {7,1,5,3,6,4};
		System.out.println("Maximum Profit :" + s.maxProfit(prices));

	}

}


//Maximum Profit :5
