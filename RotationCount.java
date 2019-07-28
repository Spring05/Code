import java.util.Scanner;	

public class RotationCount 
{
	static int count(int array[], int n) 
    { 
        int min = array[0], min_index = -1; 
        for (int i = 0; i < n; i++) 
        { 
            if (min > array[i]) 
            { 
                min = array[i]; 
                min_index = i; 
            } 
        }  
        return min_index; 
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
		
		System.out.println("Number of Rotations : " +count(array, n)); 		
		
	}

}


//Test case
//Enter the element size
//5
//Enter the elements
//4
//5
//6
//7
//1
//Number of Rotations : 4


//Test case 2 
//Enter the element size
//5
//Enter the elements
//-9
//-10
//-11
//-1
//-2
//Number of Rotations : 2


