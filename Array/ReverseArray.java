package Array;
import java.util.Scanner;

public class ReverseArray 
{
	static void RevArray(int[] array , int n)
	{
		for(int i =0 ; i <n/2 ; i++)
		{
			int temp = array[i];
			array[i]=array[n-1-i];
			array[n-1-i]=temp;
			
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
		RevArray(array,n); 
		for (int i=0; i<n; i++) 
        {
        System.out.print(array[i]+" "); 
        }
     }

}

//
//Test case 
//Enter the number of elements
//
//4
//Enter numbers
//3
//3
//2
//1
//1 2 3 3 


//Enter the number of elements
//7
//Enter numbers
//2
//2
//3
//-1
//-6
//-3
//-6
//-6 -3 -6 -1 3 2 2 