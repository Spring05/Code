package New;

import java.util.Scanner;

public class SmallestElement {

	
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int n=s.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the element");
		for(int i = 0 ; i <n ; i ++)
		{
			a[i]=s.nextInt();
		}
		
		int small = a[0];
		for(int i = 0 ; i < n ; i ++ )
		{
			if(a[i]<small)
			{
				small=a[i];
			}
		}
		
		System.out.print("Smallest Element = " + small); 

	}

}
