package New;

import java.util.Scanner;

public class LongestCommonSubstring {
	
	public static int LCS(char c1[],char c2[])
	{
		int T[][] = new int[c1.length+1][c2.length+1];
        int max = 0;
        for(int i=1; i <= c1.length; i++)
        {
            for(int j=1; j <= c2.length; j++)
            {
                if(c1[i-1] == c2[j-1])
                {
                    T[i][j] = T[i-1][j-1] +1;
                    if(max < T[i][j])
                    {
                        max = T[i][j];
					}
				}
			}
		}
		
		return max;
	}
	
	
	

	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		System.out.println("Enterthe string1");
		char[] c1 = a.nextLine().toCharArray();
		System.out.println("Enterthe string2");
		char[] c2 = a.nextLine().toCharArray();
		LongestCommonSubstring lc=new LongestCommonSubstring();
		System.out.println(lc.LCS(c1,c2));
		

	}

}

//Enterthe string1
//abcde
//Enterthe string2
//abc
//3
//30 min