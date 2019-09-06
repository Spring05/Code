package New;

import java.util.HashSet;
import java.util.Scanner;

public class Intersection
{

	void findIntersection(int array1[],int array2[])
	{
		HashSet<Integer> hm1 = new HashSet<Integer>(); //Empty Hash Set for 1st array of integers
		HashSet<Integer> hm2 = new HashSet<Integer>(); //Empty Hash Set for 2nd array of integers
		int M = array1.length; //Length of first array
		int N = array2.length; //length of Second array
	
		for(int i = 0 ; i <M; i++) //iterate the first array and add to the set 
		{
			hm1.add(array1[i]);
		}
		
		for(int i = 0 ; i <N; i++) //iterate the second array
		{
			if(hm1.contains(array2[i])) //Check for the element in the first set if so print it .
			{
				System.out.println(array2[i]+"");
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		//get the arraay1 size and the elements
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the Length of Array1");
		int M=a.nextInt();
		int[] array1 = new int[M];
		System.out.println("Enter the numbers");
		for(int i =0 ; i<M ;i++)
		{
			array1[i]=a.nextInt();
		}
		
		//get the arraay2 size and the elements
		Scanner b = new Scanner(System.in);
		System.out.println("Enter the Length of Array2");
		int N=a.nextInt();
		int[] array2 = new int[N];
		System.out.println("Enter the numbers");
		for(int i =0 ; i<N ;i++)
		{
			array2[i]=b.nextInt();
		}
		if(M==1 && N==1)
		{
			System.out.println("Single element Array");
			return;
		}
		Intersection i = new Intersection();
		System.out.println("Intersection of Arrays:");
		i.findIntersection(array1,array2);	
		
	}

}



//-------Output---------
//Positive Numbers 
//Enter the Length of Array1
//4
//Enter the numbers
//2
//1
//4
//9
//
//Enter the Length of Array2
//7
//Enter the numbers
//2
//1
//5
//3
//6
//4
//8


//Intersection of Arrays:
//2
//1
//4



//Test Case 2 : Single ELement
//Enter the Length of Array1
//1
//Enter the numbers
//1
//Enter the Length of Array2
//1
//Enter the numbers
//1
//Single element Array


//negative Numbers
//Enter the Length of Array1
//3
//Enter the numbers
//-1
//-2
//3
//Enter the Length of Array2
//2
//Enter the numbers
//-2
//1
//Intersection of Arrays:
//-2