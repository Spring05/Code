package New;

public class RemoveElement {
	
	 public int removeElement(int[] nums, int val)
	 {
		int j = 0 ;
		if(nums.length==0)
		{ 
			System.out.print("Not Valid : ");
		}
			
		for(int i = 0 ; i < nums.length ; i++)
		{
			 if(nums[i]!=val)
			 {
				nums[j]=nums[i];
				j++;
			  }
		}
		
		return j;
	 }

	public static void main(String[] args)
	{
		RemoveElement rm = new RemoveElement();
		int[] nums= {2,2,2,4,5,8,8,9,9};
		int val = 9;
		int[] nums1= {};
		int[] nums2= {2,2};
		System.out.print("New Array Length :");
		System.out.println(rm.removeElement(nums, val));
		System.out.println(rm.removeElement(nums2, val));
		System.out.println(rm.removeElement(nums1, val));
		

	}

}
