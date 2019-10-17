package spring;

import java.util.Arrays;

public class ThreeSum
{
	
	 public int findTriplets(int arr[], int n) 
	 {
		 if(n==0)
		 {
			 return 0;
		 }
		 
		 boolean found = false;
		 //Sort the array 
		 Arrays.sort(arr);
		 for(int i = 0 ; i < n-1 ; i ++)
		 {
			 //intialize the left and right
			 int left = i+1; // second element
			 int right = n-1; // third element
			 int x = arr[i]; // first element
			 while(left<right)
			 {
				 if(x+arr[left]+arr[right]==0)
				 {
					 System.out.print(x + " "); 
	                 System.out.print(arr[left]+ " "); 
	                 System.out.println(arr[right]+ " "); 
	                 left++;
	                 right--;
	                 found=true;
				 }
				 
				 if(x+arr[left]+arr[right] <0)
				 {
					 left++;
				 }
				 
				 else
				 {
					 right--;
				 }
			 }
			 
		 }
		 
		 if(found==false)
		 {
			 System.out.println("Not found");
		 }
		return n;
		 
	 }
	 
	 public int threeSumClosest(int[] nums, int target)
	 {
		 if(nums.length==0||nums.length==1)
		 {
			 System.out.println("Not Valid");
			 return -1;
		 }
		 
		 int result = nums[0] + nums[1] + nums[nums.length - 1];
		 Arrays.sort(nums);
		 
		 for(int i = 0 ; i < nums.length-2 ; i++)
		 {
			 
			 int left = i+1;
			 int right = nums.length-1;
			 
			 while(left<right)
			 {
				 int sum =nums[i]+nums[left]+nums[right];
				 if(sum>target)
				 {
					 right--;
				 }
				 
				 else
				 {
					 left++;
				 }
				 
				 if (Math.abs(sum - target) < Math.abs(result - target)) 
				 {
	                    result = sum;
	             }
			 }
			 
			 
		 }
		return result;
		 
	 }
	 

	public static void main(String[] args) 
	{
		ThreeSum ts = new ThreeSum();
		int[] arr = {-1, 0, 1, 2, -1, -4};
		int n=arr.length;
		System.out.println("Triplets : " + ts.findTriplets(arr, n));

		int[] arr1 = {-1, 0, 1};
		int n1=arr1.length;
		System.out.println("Triplets1  : " + ts.findTriplets(arr1, n1));

		int[] arr2 = {-1};
		int n2=arr2.length;
		System.out.println("Triplets2 : " + ts.findTriplets(arr2, n2));
		

		int[] arr3 = {};
		int n3=arr3.length;
		System.out.println("Triplets3  : " + ts.findTriplets(arr3, n3));
		
		int[] nums = {-1, 2, 1, -4};
		int target = 1;
		System.out.println("Triplets4  : " + ts.threeSumClosest(nums,target));
		
		int[] nums1 = {-1};
		int target1 = 1;
		System.out.println("Triplets5  : " + ts.threeSumClosest(nums1,target1));
		
		int[] nums2 = {};
		int target2 = 1;
		System.out.println("Triplets6:   " + ts.threeSumClosest(nums2,target2));
		
		int[] nums3 = {5, 1, 3, 4, 7 };
		int target3 = 12;
		System.out.println("Triplets7  :" + ts.threeSumClosest(nums3,target3));
		
		
		
		

	}

}


//-1 -1 2 
//-1 0 1 
//Triplets : 6
//-1 0 1 
//Triplets1  : 3
//Not found
//Triplets2 : 1
//Triplets3  : 0
//Triplets4  : 2
//Not Valid
//Triplets5  : -1
//Not Valid
//Triplets6:   -1
//Triplets7  :12

//O(n2)