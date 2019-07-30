package Array;
import java.util.Scanner;

public class rotate
{
	
//	static void rotates(int array[],int d,int n)
//	{
//		int[] temp = new int[d];
//		for(int i =0 ; i<d ;i++)
//		{
//			temp[i]=array[i];		
//		}
//		for (int i = d; i < n; i++) 
//		{
//			array[i - d] = array[i];
//		}
//		for (int i = n-d; i < n; i++) 
//		{
//			array[i] = temp[i - (n - d)];
//		}
//	}
	
//		static void rotates(int array[], int d, int n)
//		{
//			{ 
//		        for (int i = 0; i < d; i++) 
//		            leftrotate(array, n); 
//		    } 
//		}
//		
//		static void leftrotate(int array[],int n)
//		{
//			int i;
//			int temps =array[0];
//			for(i =0 ; i < n-1 ; i++)
//			{
//				array[i]=array[i+1];
//			}
//			array[i]=temps;
//			
//		}	
	
//	static void Rotateleft(int array[], int d, int n) 
//    { 
//        int i, j, k, temp; 
//        int g_c_d = gcd(d, n); 
//        for (i = 0; i < g_c_d; i++) 
//        {
//            temp = array[i]; 
//            j = i; 
//            while (true) 
//            { 
//                k = j + d; 
//                if (k >= n) 
//                {
//                    k = k - n; 
//                }
//                if (k == i) 
//                {
//                    break; 
//                }
//              array[j] = array[k]; 
//              j = k; 
//            } 
//            array[j] = temp; 
//        } 
//    } 
//	
//	static int gcd(int a, int b) 
//    { 
//        if (b == 0) 
//            return a; 
//        else
//            return gcd(b, a % b); 
//    } 
	
	static void Rotate(int array[], int d, int n) 
    {  
        reverseArray(array, 0, d-1); 
        reverseArray(array, d, n-1); 
        reverseArray(array, 0, n-1); 
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

