package Array;
import java.util.Scanner;

public class RightRotation {

		static void Rotate(int array[], int d, int n) 
	    {  
			reverseArray(array, 0, n-1); 
			reverseArray(array, 0, d-1); 
	        reverseArray(array, d, n-1); 
	        
	    } 
		static void reverseArray(int array[], int start, int end) 
	    { 
	        int temp; 
	        while (start < end) 
	        { 
	            temp = array[start]; 
	            array[start] = array[end]; 
	            array[end] = temp; 
	            start++; 
	            end--; 
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
			Rotate(array,d,n);
			
			for (int i=0; i<n; i++) 
	        {
	        System.out.print(array[i]+" "); 
	        }       
		}
	
	}

//Test Case 1 
//Enter the number of elements
//10
//Enter numbers
//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
//Enter the value of d  
//3
//8 9 10 1 2 3 4 5 6 7 

//Test case 2
//Enter the number of elements
//5
//Enter numbers
//-3
//-2
//-6
//-1
//-8
//Enter the value of d  
//2
//-1 -8 -3 -2 -6 