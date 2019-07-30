import java.util.Scanner;

public class times 
{
	
	static void findDuplicates(int[] array,int n)
	{
	    for (int i = 0; i < array.length; i++) 
	    {
	        for (int j = i+1; j < array.length; j++) 
	        {
	            if(array[i] == array[j])
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


//Test Case 1 
//Enter the number of elements
//6
//Enter numbers
//1
//3
//2
//3
//2
//4
//Duplicate Element : 3
//Duplicate Element : 2


//test Case 2
//Enter the number of elements
//6
//Enter numbers
//-1
//-2
//-2
//-6
//-6
//-3
//Duplicate Element : -2
//Duplicate Element : -6
