package New;

public class MaxSumSub {
	
	public int adjacentSum(int arr[])
	{
		int excl =0 ; 
		int incl =arr[0];
		for(int i =1 ; i < arr.length;i++)
		{
			int temp = incl;
			incl= Math.max(arr[i]+excl, incl);
			excl=temp;
		}
		
		return incl;
	}

	public static void main(String[] args) 
	{
		MaxSumSub m= new MaxSumSub();
		int arr[]= { 2,10,13,4,2};
		System.out.println("Mx Sum:" + m.adjacentSum(arr));
		
		
	}

}
//Mx Sum:17
