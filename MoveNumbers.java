import java.util.Scanner;

public class MoveNumbers {

	public static void main(String[] args) 
	{
		Scanner a =new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n,nonzero=0;
		n= a.nextInt();
		int[] array =new int[n];
		System.out.println("Enter numbers");
		
			
		for(int i =0 ;i<n;i++)	
		{
			array[i]=a.nextInt();
		}
		
		for(int i =0; i<n;i++)
		{
			if(array[i]!=1)
			{
				array[nonzero++]=array[i];
			}
		}
		
		while(nonzero<n)
		{
			array[nonzero++]=1;
		}
		
		
	 	int k=0;
    	for(int i=0;i<array.length;i++)
    	{
    		if(array[i]==-1)
    		{
    			int temp=array[i];
    			array[i]=array[k];
    			array[k]=temp;
    			k++;
    		}
    	}
		
		System.out.println("New Array ");
		for(int i =0 ;i<n;i++)
		{
			System.out.println(array[i]);
		}

	}

}
//Input - output 
//Enter the number of elements
//6
//Enter numbers
//1
//-1
//0
//1
//-1
//0
//New Array 
//-1
//-1
//0
//0
//1
//1
