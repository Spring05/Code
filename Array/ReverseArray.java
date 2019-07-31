package Array;
import java.util.Scanner;

public class ReverseArray 
{
	static void RevArray(int[] array , int n)
	{
//		for(int i =0 ; i <n/2 ; i++)
//		{
//			int temp = array[i];
//			array[i]=array[n-1-i];
//			array[n-1-i]=temp;
//			
//		}
		
//		for (int i = array.length-1; i >= 0; i--) 
//		{  
//	        return array[i];
//		}
//		return 0;
		
		if(n==1)
		{ System.out.print("Single element Array : ");}
		
		int left = 0;
		int right = n-1;
		while(left <right)
		{
			int temp = array[left];
			array[left]=array[right];
			array[right]=temp;
			left++;
			right--;
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



//
//Test case 
//Enter the number of elements
//9
//Enter numbers
//10
//20
//30
//20
//15
//20
//30
//50
//40
//10 20 30 20 15 20 30 50 40 



//Test Case
//Enter the number of elements
//8
//Enter numbers
//-1
//5
//120
//65
//-34
//0
//120
//2
//2 120 0 -34 65 120 5 -1 


//Enter the number of elements
//1
//Enter numbers
//2
//Single element Array : 2 