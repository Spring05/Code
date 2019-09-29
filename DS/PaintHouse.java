package New;

public class PaintHouse {
	 public int minCost(int[][] costs)
	 {
		 if(costs.length==0 || costs==null)
		 {
			 return 0;
		 }
		 
		 for(int i = 1 ; i < costs.length; i++)
		 {
			 costs[i][0]+=Math.min(costs[i-1][1],costs[i-1][2]);
			 costs[i][1]+=Math.min(costs[i-1][0],costs[i-1][2]);
			 costs[i][2]+=Math.min(costs[i-1][0],costs[i-1][1]);
		 }
		 
		 return Math.min(Math.min(costs[costs.length-1][0],costs[costs.length-1][1]),costs[costs.length-1][2]);
	}

	public static void main(String[] args) 
	{
		PaintHouse ph = new PaintHouse ();
		int[][] costs= {{17,2,17},{16,16,5},{14,3,19}};
		int[][] cost= {{},{},{}};
		System.out.print(ph.minCost(costs));
		System.out.print(ph.minCost(cost));
	}

}
