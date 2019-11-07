package msOne;


public class Reverse {

	public String reverseString(String s)
	{
		if(s.length()==0 || s==null)
		{
			return "Not Valid";
		}
		
		char ch[] = s.toCharArray();
		String rev="";
		for(int i = ch.length-1 ; i >=0;i--)
		{
			rev = rev+ch[i];
		}
	
		return rev;
		
	}
	
	public char[] rev(char[] str)
	{

		if(str.length==0 || str==null)
		{
			return str;
		}
		
		int left = 0 ;
		int right = str.length-1;
		while(left < right)
		{
			char temp = str[left];
			str[left]=str[right];
			str[right]=temp;
			left++;
			right--;
		}
		return str;
		
		
		
	}
	

	
	
	public static void main(String[] args) 
	{
		Reverse r = new Reverse();
		String s = "hello";
		String s1 = "the sky is blue";
		String s2 = "  hello world!  ";
		String s3 ="a good   example";
		char[] s4 = {'h','e','l','l','o'};
		char[] s5 = {'t','h','e',' ','s','k','y', ' ','i','s',' ','b','l','u','e'};
		System.out.println(r.reverseString(s));
		System.out.println(r.reverseString(s1));
		System.out.println(r.reverseString(s2));
		System.out.println(r.reverseString(s3));
		char[] result = r.rev(s4);
		System.out.println(result);
		char[] result1 = r.rev(s5);
		System.out.println(result1);
	}

}
