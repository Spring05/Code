import java.util.Scanner;

public class Printnumbers {

	public static void main(String[] args) {
	
		Scanner a = new Scanner(System.in);
		int result = 0 ;
		System.out.println("Enter  num:");
		for(int i =0 ;i<10;i++)
		result +=a.nextInt()+2; 
		System.out.println("Result:" + result);
		
		
		
		System.out.println("Method 2" );
		
		int[] array = new int[10];
		int sum =0;
		System.out.println("Enter  num:");
		for(int j =0 ;j<10;j++)
		{
			array[j]=a.nextInt();
			
		}
		for(int num:array) {
			sum +=num+2;
		
		}
		System.out.println("sum: "+sum);
		}
	}


