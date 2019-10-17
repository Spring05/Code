package spring;

public class Product {
	
	public int[] productExceptSelf(int[] nums)
	{
		if(nums.length==0)
		{
			System.out.println("Not Valid ");
		}
		if(nums.length==1)
		{
			System.out.println("Single Character");
		}
		int length = nums.length;
		int[] Left = new int[length];
		int[] Right =new int[length];
		int[] result =new int[length];
		Left[0]=1;
		for(int i = 1 ; i < length ; i ++)
		{
			Left[i]=Left[i-1] * nums[i-1];
		}
		Right[length-1]=1;
		for(int i = length-2 ; i >=0 ; i--)
		{
			Right[i]=Right[i+1]*nums[i+1];
		}
		
		for(int i = 0 ; i < length ; i++)
		{
			result[i] = Left[i] * Right[i];
		}
		
		return result;
	}

	public static void main(String[] args) 
		
	{
		Product p = new Product();
		int[] nums ={1,2,3,4};
		System.out.println("Product" + p.productExceptSelf(nums));
		int[] nums1 ={1};
		System.out.println("Product" + p.productExceptSelf(nums1));
		int[] nums2 ={};
		System.out.println("Product" + p.productExceptSelf(nums2));

	}

}
