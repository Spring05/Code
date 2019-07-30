import java.util.Scanner;

public class times 
{
	
	static void findDuplicates(int array[],int n)
	{
		for(int i = 0 ;i < n ;i++)
		{
			for (int j = i+1 ; j<n; j++)
			{
				if(array[i]==array[j]);
				{
					System.out.println("Duplicate Element : "+array[i]);
				}
			}
		}
		
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
		findDuplicates(array,n);
        
     }
}
