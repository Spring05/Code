package New;

public class TrappngWater {
	
	public int trap(int[] height)
	{	
	 int n = height.length;
	
	//left[i] contains the left tallest bar including the ith bar
	 int[] left = new int[n]; 
	 
	 //right[i] contains the right tallest bar including the ith bar
	 int[] right = new int[n-1];
	 
	 int water =0 ; 
	 
	 //fill the left bar 
	 left[0]=height[0];
	 for(int i = 1 ; i < n ; i ++)
	 {
		 left[i]=Math.max(left[i-1], height[i]);
	 }
	 
	 //fill right bar 
	 right[n-1]=height[n-1];
	 for(int i = n-2 ; i >=0 ; i--)
	 {
		 right[i]=Math.max(right[i+1], height[i]);
	 }
	 
	 
	 //total water trapped by calculating the left and right tallest bar
	 for(int i = 0 ; i < n ; i++)
	 {
		 water+=Math.min(left[i], right[i])-height[i];
	 }
	 
	 return water;
		 
	}
	
	public static void main(String[] args)
	{
		TrappngWater tp = new TrappngWater();
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		tp.trap(height);
	}

}
