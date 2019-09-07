package New;

public class EditDistance {
	static int editcount(String s1, String s2,int m , int n)
	{
		int T[][]=new int[m+1][n+1];
		for(int i = 0 ;  i <= m ; i ++)
		{
			for(int j = 0 ; j <= n ; j++)
			{
				//if first string is empty ,insert all characters of second string 
				if( i == 0)
				{
					T[i][j]=j;
				}
				
				//if second string is empty , insert to first string
				else if(j==0)
				{
					T[i][j]=i;
				}
				
				//if the last character of both te strings are same ingnore them , traverse the remaining one 
				else if (s1.charAt(i-1)== s2.charAt(j-1))
				{
					T[i][j] =T[i-1][j-1];
				}
				
				//Update , delete , insert
				else 
					T[i][j]=1+ min(T[i][j-1],T[i-1][j-1],T[i-1][j]);
			}
		}
		
		return T[m][n];
		
	}
	
	static int min (int x , int y , int z)
	{
		if(x<=y && x<=z) 
		{
			return x;
		}
		if(y<=x && y<=z)
		{
			return y;
		}
		else return z;
	}

	public static void main(String[] args) 
	{
		String s1 = "abcdefg";
		String s2 = "achjfg";
		System.out.println("No of operations required :" + editcount(s1,s2,s1.length(),s2.length()));

	}

}


//No of operations required :3
