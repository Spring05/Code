import java.util.Scanner;

public class One {
	
	static void rotate(int[] array , int n)
	{
		int temp = array[array.length-1];
		for(int i = array.length-1 ; i>0 ;i--)
		{
		array[i]=array[i-1];
		}
		array[0]=temp;
	}

	public static void main(String[] args)
	{

		Scanner a = new Scanner(System.in);
		int n;
		System.out.println("Enter the element size");
		n=a.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the elements");
		for(int i = 0;i<n ;i ++)
		{
			array[i]=a.nextInt();
		}
		
		rotate(array,n);
		for (int i=0; i<n; i++) 
        {
        System.out.print(array[i]+" "); 
        }
        

	}

}


//TestCAse
//Enter the element size
//5
//Enter the elements
//3
//4
//5
//6
//7
//7 3 4 5 6 


//Test Case 
//Enter the element size
//5
//Enter the elements
//-7
//-8
//-3
//-10
//-2
//-2 -7 -8 -3 -10 

