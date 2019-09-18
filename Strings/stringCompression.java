package New;

public class stringCompression {
	
	public static void result(String str)
	{
		if(str=="" || str.length()==0)
		{
			return;
		}
		
		for(int i = 0 ; i < str.length() ; i ++)
		{
			int count = 1 ; //count teh ocurrences of the character
			while(i < str.length()-1 && str.charAt(i)==str.charAt(i+1))
			{
				count++;
				i++;
			}
			
			System.out.print(str.charAt(i));
		}
		
	}
	
	 void CompressionBetter(String str)
	{
		int size = countCmp(str);
		if(size > str.length())
		{
			System.out.print("Not Valid");
		}
	
	}
	
	String countCompression(String str)
	{
		StringBuffer s = new StringBuffer();
		char last=str.charAt(0);
		int count =1;
		for(int i = 1 ; i <str.length();i++)
		{
			//found the repated characters
			if(str.charAt(i)==last)
			{
				count++;
			}
			
			// update teh count , last character 
			else
			{
				s.append(last);
				s.append(count);
				last = str.charAt(i);
				count =1;
			}
			
			
		}
		
		s.append(last);
		s.append(count);
		return s.toString();
		
	}
	
	static int countCmp(String str)
	{
		if(str==null || str.isEmpty())
		{
			return 0;
		}
		
		char last = str.charAt(0);
		int size = 0;
		int count =1;
		for(int i = 1 ; i < str.length() ; i++)
		{
			if(str.charAt(i)==last)
			{
				count++;
			}
			
			else
			{
				last =str.charAt(i);
				size+=1+String.valueOf(count).length();
				count =1;
			}
		}
		
		size+=1+String.valueOf(count).length();
		return size;
		
	}
	

	public static void main(String[] args) 
	{
		String str = "aaaaaaaannnnnnnsssmmmmmmwwwwlllllrr";
		result(str);
	}

}
