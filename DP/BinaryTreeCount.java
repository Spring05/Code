package New;

public class BinaryTreeCount {

	public int preorderCount(int n)
	{
		if(n == 0)
		{
            return 0;
        }
		
        int T[] = new int[n+1];
        T[0] = 1;
        T[1] = 1;
        for(int i=2; i <= n; i++)
        {
            int sum = 0;
            for(int j=0; j < i; j++)
            {
                sum += T[j]*T[i-j-1];
            }
            T[i] = sum;
        }
        return T[n];
	
	}
	public static void main(String[] args) 
	
	{
		BinaryTreeCount c = new BinaryTreeCount();
		System.out.println("Preorder count :" +c.preorderCount(3));
		System.out.println("Preorder count :" +c.preorderCount(4));
		System.out.println("Preorder count :" +c.preorderCount(5));
		System.out.println("Preorder count :" +c.preorderCount(6));

	}

}
//
////Preorder count :5
//Preorder count :14
//Preorder count :42
//Preorder count :132

