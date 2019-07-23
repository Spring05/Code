
public class MissingNumber {

	public static void main(String[] args) 
	{
		int[] array = {1, 2, 3, 4, 5, 7, 8, 9, 10 };
		int X=array[0];
		int Y=1;
		int result;
		
		for(int i =1 ; i<array.length; i++)
		{
			X = X^ array[i];
		}
		
		for(int i =2 ; i<=array.length+1; i++)
		{
			Y	 = Y^ i;
		}
		
		result =  X^Y;

		System.out.println("Missing number: " + result);
	}

}
