package New;

import java.util.Scanner;

public class LongSub {
	
	public int lcs(char s1[],char s2[], int len1 , int len2)
	{
		if(len1==s1.length || len2==s2.length)
		{
			return 0 ;
		}
		
		if(s1[len1]==s2[len2])
		{
			return 1+ lcs(s1,s2,len1+1,len2+1);
		}
		else
		{
			return Math.max(lcs(s1,s2,len1+1,len2),lcs(s1,s2,len1,len2+1));
		}
	}
	
	public int findlcs(char s1[],char s2[])
	{
		int temp[][]=new int[s1.length+1][s2.length+1];
		int max =0 ;
		for(int i =1;i<temp.length;i++)
		{
			for(int j =1 ;j<temp[i].length;j++)
			{
				if(s1[i-1]==s2[j-1])
				{
					temp[i][j]=temp[i-1][j-1]+1;
				}
				else
				{
					temp[i][j]=Math.max(temp[i][j-1],temp[i-1][j]);
				}
				if(temp[i][j]>max)
				{
					max=temp[i][j];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) 
	{
		LongSub ls =new LongSub();
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the String1");
		char s1[]=a.nextLine().toCharArray();
		Scanner b=new Scanner(System.in);
		System.out.println("Enter the String2");
		char s2[]=b.nextLine().toCharArray();
		int result = ls.findlcs(s1,s2);
		System.out.println("length of the seq"+result);
		

	}

}
//Output 
Enter the String1
abcde
Enter the String2
cdef
length of the seq3
