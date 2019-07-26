import java.util.Scanner;

public class rotate
{
	
	static void rotates(int array[],int d,int n)
	{
		int[] temp = new int[d];
		for(int i =0 ; i<d ;i++)
		{
			temp[i]=array[i];		
		}
		for (int i = d; i < n; i++) 
		{
			array[i - d] = array[i];
		}
		for (int i = n-d; i < n; i++) 
		{
			array[i] = temp[i - (n - d)];
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
		
		System.out.println("Enter the value of d  ");
		int d =a.nextInt();
		rotates(array,d,n);
		for (int i=0; i<n; i++) 
        {
        System.out.print(array[i]+" "); 
        }       
	}
}

//Test Case 
//Enter the number of elements
//7
//Enter numbers
//1
//2
//3
//4
//5
//6
//7
//Enter the value of d  
//2
//3 4 5 6 7 1 2 


//Test Case 
//Enter the number of elements
//4
//Enter numbers
//-1
//-2
//-3
//-4
//Enter the value of d  
//1
//-2 -3 -4 -1 

