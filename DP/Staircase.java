package New;

public class Staircase {
	public int fibonacc(int n)
	{
		int sum;
		int n1 = 0 , n2 =1;
		if(n==n1 || n==n2 || n<0)
		{
			System.out.println("test Case");
			return n;
		}
		
		for( int i = 2; i < n ; i++)
		{
			sum= n1+ n2;
			n1= n2;
			n2 = sum;
		}
		
		return n2;
	}

	public static void main(String[] args)
	{
		Staircase s = new Staircase();
		System.out.println("No of ways :" +s.fibonacc(4));
		System.out.println("No of ways :" +s.fibonacc(10));
		System.out.println("No of ways :" +s.fibonacc(1));
		System.out.println("No of ways :" +s.fibonacc(0));
		System.out.println("No of ways :" +s.fibonacc(-1));
	}

}
//
//No of ways :2
//No of ways :34
//test Case
//No of ways :1
//test Case
//No of ways :0
//test Case
//No of ways :-1
