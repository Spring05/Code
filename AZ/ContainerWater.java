package spring;

//Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

public class ContainerWater 
{
	public int maxArea(int[] height) 
	{
		if(height==null)
		{
			System.out.println("Not Valid");
			return 0;
		}
		
		if(height.length==1)
		{
			System.out.print("Single length  ");
			return 1;
		}
		
		int left =0 ;
		int right = height.length-1;
		int maxarea =0;
		int area=0;
		
		while(left<right)
		{	
			
			area = (right-left * Math.min(height[left], height[right]));
			maxarea=Math.max(maxarea,area);
			if(height[left]<height[right])
			{
				left++;
				
			}
			else
			{
				right--;
			}
		}
		
		return maxarea;
	}
	

	public static void main(String[] args) 
	{
		ContainerWater c = new ContainerWater();
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		int[] height1 = {1};
		int[] height2 = {};
		int[] height3 = {1,8,-6,2,5,-4,8,-3,7};
		System.out.println("Max area :" + c.maxArea(height));
		System.out.println("Max area :" + c.maxArea(height1));
		System.out.println("Max area :" + c.maxArea(height2));
		System.out.println("Max area :" + c.maxArea(height3));

	}

}

//Max area :8
//Single length  Max area :1
//Max area :0
//Max area :10

//O(n)

