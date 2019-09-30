package New;

public class Sorting {

	public void bubbleSort(int[] array)
	{
		if(array.length==0 || array==null)
		{
			System.out.println("Invalid");
		}
		
		if(array.length==1)
		{
			System.out.println("Single element");
		}
		
		boolean sorted = false;
	    int temp;
	    while(!sorted)
	    {
	    	sorted = true;
	    	for(int i = 0 ; i < array.length-1;i++)
	    	{
	    		if(array[i]>array[i+1])
	    		{
	    			temp = array[i];
	    			array[i]=array[i+1];
	    			array[i+1]=temp;
	    			sorted=false;
	    		}
	    	}
	    }
	    
	    
	}
	
	
	public void InsertionSort(int[] array)
	{
		if(array.length==0 || array==null)
		{
			System.out.println("Invalid");
		}
		
		if(array.length==1)
		{
			System.out.println("Single element");
		}
		
		for(int i = 0 ; i <array.length-1;i++)
		{
			int k = array[i];
			int j = i-1;
			while(j>=0&&array[j]>k)
			{
				array[j+1]=array[j];
				j=j-1;
			}
			
			array[j+1]=k;
		}
		
	}
	
	public void SelectionSort(int[] array)
	{
		if(array.length==0 || array==null)
		{
			System.out.println("Invalid");
		}
		
		if(array.length==1)
		{
			System.out.println("Single element");
		}
		
		for(int i = 0 ; i < array.length-1 ;i++)
		{
			int min =i;
			for(int j =i+1 ; j <array.length ; j++)
			{
				if(array[j]<array[min])
				{
					min=j;
				}
			}
			
			int temp = array[min]; 
            array[min] = array[i]; 
            array[i] = temp; 
			
		}
		
		
	}
	
	
	public void mergeSort(int array[],int left , int right)
	{
		if(array.length==0 || array==null)
		{
			System.out.println("Invalid");
		}
		
		if(array.length==1)
		{
			System.out.println("Single element");
		}
		
		if(right<=left)
		{
			return;
		}
		
		int mid = (left +right)/2;
		mergeSort(array,left,mid);
		mergeSort(array,mid+1,right);
		merge(array,left,mid,right);
	}
	
	public void merge(int[] array , int left , int mid , int right)
	{
		//calculate the length 
		int leftLength= mid-left +1;
		int rightLength = right-mid;
		
		//create two temp subarrays
		int[] leftArray = new int[leftLength];
		int[] rightArray = new int[rightLength];
		
		//copy sorted subarray into temp 
		for(int i = 0 ; i < leftLength ; i ++)
		{
			leftArray[i]=array[left+i];
			
		}
		
		for(int i = 0 ; i < rightLength ; i ++)
		{
			rightArray[i]=array[mid+i+1];
			
		}
		
		//current index in iterator 
		int leftIndex=0;
		int rightIndex=0;
		
		//copying left array , right array bacl to the original array 
		for(int i = left ; i < right +1 ; i++)
		{
			// if there are still uncopied elements in R and L, copy minimum of the two
			if(leftIndex<leftLength && rightIndex < rightLength)
			{
				if (leftArray[leftIndex] < rightArray[rightIndex])
				{
				array[i]=leftArray[leftIndex];
				leftIndex++;
				}
				else 
				{
					array[i]=rightArray[rightIndex];
					rightIndex++;
				}
			}
			
			 // if all the elements have been copied from rightArray, copy the rest of leftArray
	        else if (leftIndex < leftLength) 
	        {
	            array[i] = leftArray[leftIndex];
	            leftIndex++;
	        }
			
			// if all the elements have been copied from leftArray, copy the rest of rightArray
	        else if (rightIndex < rightLength)
	        {
	            array[i] = rightArray[rightIndex];
	            rightIndex++;
	        }
			
		}
		
	}
	
	
	public void quickSort(int array[],int left , int right)
	{
		if(array.length==0 || array==null)
		{
			System.out.println("Invalid");
		}
		
		if(array.length==1)
		{
			System.out.println("Single element");
		}
		
		if(right<=left)
		{
			return;
		}
		
		int pivot = partition(array,left,right);
		quickSort(array,left,pivot-1);
		quickSort(array,pivot+1,right);
	}
	
	public int partition(int array[],int left , int right)
	{
		int pivot = right;
		int counter = left;
		for(int i = left ; i <right ; i ++)
		{
			if(array[i]<array[pivot])
			{
				int temp = array[counter];
				array[counter]=array[i];
				array[i]=temp;
				counter++;
						
			}
		}
		
		int temp = array[pivot];
	    array[pivot] = array[counter];
	    array[counter] = temp;
	    return counter;
	}
	
	
	
	
	
	
	static void printArray(int array[]) 
    { 
        for (int i = 0; i < array.length; i++) 
        {
            System.out.print(array[i] + " "); 
        }
        System.out.println(); 
    } 
	
	public static void main(String[] args)
	{
		int array[] = { 64, 34, -25, 12, 22, 11, -90 };    
		Sorting s = new Sorting();
		
		
		System.out.println("-----Bubble Sort------------ ");
		s.bubbleSort(array);
        System.out.println("Sorted array: ");
        printArray(array);
        int array1[] = { 64 }; 
        s.bubbleSort(array1);
        System.out.println("Sorted array: ");
        printArray(array1);
        int array2[] = {  }; 
        s.bubbleSort(array2);
        System.out.println("Sorted array: ");
        printArray(array2);
        
        
        System.out.println("-----Insertion  Sort------------ ");
        s.InsertionSort(array);
        System.out.println("Sorted array: ");
        printArray(array);
        s.InsertionSort(array1);
        System.out.println("Sorted array: ");
        printArray(array1);
        s.InsertionSort(array2);
        System.out.println("Sorted array: ");
        
        
        System.out.println("-----Selection  Sort------------ ");
        s.SelectionSort(array);
        System.out.println("Sorted array: ");
        printArray(array);
        s.SelectionSort(array1);
        System.out.println("Sorted array: ");
        printArray(array1);
        s.SelectionSort(array2);
        System.out.println("Sorted array: ");
        
        
        
        System.out.println("-----Merge  Sort------------ ");
        s.mergeSort(array,0,array.length-1);
        System.out.println("Sorted array: ");
        printArray(array);
        s.mergeSort(array1,0,array1.length-1);
        System.out.println("Sorted array: ");
        printArray(array1);
        s.mergeSort(array2,0,array2.length-1);
        System.out.println("Sorted array: ");
        printArray(array2);
        
        
        System.out.println("-----Quick Sort------------ ");
        s.mergeSort(array,0,array.length-1);
        System.out.println("Sorted array: ");
        printArray(array);
        s.mergeSort(array1,0,array1.length-1);
        System.out.println("Sorted array: ");
        printArray(array1);
        s.mergeSort(array2,0,array2.length-1);
        System.out.println("Sorted array: ");
        printArray(array2);
        
        
        
        
	}

}


//-----Bubble Sort------------ 
//Sorted array: 
//-90 -25 11 12 22 34 64 
//Single element
//Sorted array: 
//64 
//Invalid
//Sorted array: 

//Worst and Average Case Time Complexity O(n^2)./Bubble/Insert,Selection
//Best Case Time Complexity: O(n). Best case occurs when array is already sorted.


//O(nlog n) Time Complexity for MergeSort /QuickSort