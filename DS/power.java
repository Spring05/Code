package New;

public class power {
	
	 public boolean isPowerOfTwo(int n)
	 {
		 if(n<=0)
		 {
			 return false;
		 }
		 long i = 1;
		 while(i<n)
		 {
			 i = i* 2;
		 }
		 
		 return i ==n;
	 }

	public static void main(String[] args)
	{
		power p = new power();
		int n = 0;
		power p1 = new power();
		int n1 = 36;
		power p2 = new power();
		int n2 = 16;
		power p3 = new power();
		int n3 = -3;
		System.out.println(p.isPowerOfTwo(n));
		System.out.println(p1.isPowerOfTwo(n1));
		System.out.println(p2.isPowerOfTwo(n2));
		System.out.println(p3.isPowerOfTwo(n3));
	}
}

//false
//false
//true
//false
//O(1)

