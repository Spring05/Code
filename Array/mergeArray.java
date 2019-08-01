import java.util.Scanner;

public class mergeArray {

	public static int[] merges(int[] array1, int[] array2, int[] array3, int n2, int n1)
	{
		if(array1.length==0)
		{
			return array2;
		}
		
		if(array2.length==0)
		{
			return array1;
		}
		
		int i = 0 , j = 0, k = 0 ;
		if(array1[i]<array2[j])
		{
			array3[k++]=array1[i++];
		}
		
		else 
		{
			array3[k++]=array2[j++];
		}
		
		if(i < n1)
		{
			array3[k++]=array1[i++];
		}
		
		else if (j < n2)
		{
			array3[k++]=array2[j++];
		}
		return array3;
		
	}
	
	
	public static void main(String[] args) 
	{
		Scanner a =new Scanner(System.in);
		Scanner b =new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter the number of elements Array 1");
		n1= a.nextInt();
		System.out.println("Enter the number of elements Array 2");
		n2= b.nextInt();
		int[] array1 =new int[n1];
		int[] array2 =new int[n2];
		int n3 = n1+ n2;
		int[] array3= new int[n3];
		
		System.out.println("Enter numbers in array 1");
		for(int i=0 ;i<n1;i++)	
		{
			array1[i]=a.nextInt();
		}
		System.out.println("Enter numbers in array 2");
		for(int i=0 ;i<n2;i++)	
		{
			array2[i]=b.nextInt();
		}
		
		merges(array1,array2,array3,n2,n1);
		
		for(int i=0 ;i<n3;i++)
		{
			System.out.println(array3[i]);
		}
	}

}
