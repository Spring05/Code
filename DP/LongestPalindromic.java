package New;

import java.util.Scanner;

public class LongestPalindromic {
	
	public int find(char[] c)
	{
		int T[][] = new int[c.length][c.length];
        for(int i=0; i < c.length; i++)
        {
            T[i][i] = 1;
        }
        for(int l = 2; l <= c.length; l++)
        {
            for(int i = 0; i < c.length-l + 1; i++)
            {
                int j = i + l - 1;
                if(l == 2 && c[i] == c[j])
                {
                    T[i][j] = 2;
                }
                else if(c[i] == c[j])
                {
                    T[i][j] = T[i + 1][j-1] + 2;
                }
                else
                {
                    T[i][j] = Math.max(T[i + 1][j], T[i][j - 1]);
                }
            }
        }
        return T[0][c.length-1];
    }
		

	public static void main(String[] args) 
	{
		Scanner a= new Scanner(System.in);
		System.out.println("Enterthe string1");
		char[] s1 = a.nextLine().toCharArray();
		LongestPalindromic lp = new LongestPalindromic ();
		int r = lp.find(s1);
		System.out.println(r);
	}

}


//Enterthe string1
//agbdba
//5

//Enterthe string1
//a
//1

//45 min 
