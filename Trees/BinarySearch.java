package New;

public class BinarySearch {
	
	private static void BSearch(int[] array, int key, int low, int high) 
	{
		
		int index = Integer.MAX_VALUE;
		while(low<=high)
		{
		int mid = (low+high/2);
		if(array[mid]<key)
		{
			low=mid+1;
		}
		else if(array[mid]>key)
		{
			high=mid-1;
		}
		
		else if(array[mid]==key)
		{
			index=mid;
			System.out.println("Element is found at index: " + index);  
			break;
		}
		
	
		
	}
	}

	public static void main(String[] args) 
	{
		int array[] = {10,20,30,40,50};  
        int key = 30; 
        int high=array.length-1;  
        int low = 0;
        if ( low > high )
        {  
            System.out.println("Element is not found!");  
        }  
        	
        BSearch( array,key,low,high);

	}

	
		
	}


