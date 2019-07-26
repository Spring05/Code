import java.util.Scanner;

public class Minsr 
{
	static int Min(int array[],int high , int low)
	{
		// no rotation
		if(high<low)
		{
			return array[0];	
		}
		
		//one element
		if(high==low)
		{
			return array[low];
		}
		
		int mid = (low + high) /2;
		
		//mid + 1 is min element 
		if(mid<high && array[mid+1]<array[mid])
		{
			return array[mid+1];
		}
		
		//mid is min element
		if(mid>low && array[mid-1] > array[mid]) 
		{
			return array[mid];
		}
		
		//left , right traversal 
		if(array[high]>array[mid])
		{
			 return Min(array, low, mid-1);  
		}
		 return Min(array, mid+1, high);
		
	}

	public static void main(String[] args) 
	{

		Scanner a =new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n;
		n= a.nextInt();
		int[] array =new int[n];
		System.out.println("Enter numbers");
		for(int i = 0 ; i < n ; i++)	
		{
			array[i]=a.nextInt();
		}
		
		System.out.println("Minimum Element: " + Min(array,0,n-1));
		
		  
		
		

	}

}
