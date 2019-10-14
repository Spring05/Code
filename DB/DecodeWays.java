package New;

public class DecodeWays {
	
	
	public int numDecodings(String s) 
    {
		
	if(s==null ||s.length()==0)
	{
		return 0;
	}
	
	
	int count[] = new int[s.length()+1];
    //decode ways for length 0 
    
	count[0]=1;
    
    //if first character is mapped to  0 , there is no ways to decode it else its 1 for the character mapped to 1 
    count[1] = s.charAt(0) != '0' ? 1 : 0;
    
    for(int i = 2 ; i <= s.length(); i++)
    {
        //if the last digit isnot 
        int one = Integer.valueOf(s.substring(i-1,i));
        int two = Integer.valueOf(s.substring(i-2,i));
        
        //if the last is not 0 , then last digit must be added to to the word
        if(one>=1)
        {
            count[i] += count[i-1];
            
        }
        
         if(two>=10 && two<=26)
        {
            count[i] +=count[i-2];
            
        }
        
    }
    
    return count[s.length()];
}

	public static void main(String[] args)
	{
		DecodeWays d = new DecodeWays();
		String s = "226";
		String s1 = "22";
		String s2 = "2";
		String s3 = "";
	    System.out.println("Decode :" + d.numDecodings(s));
	    System.out.println("Decode :" + d.numDecodings(s1));
	    System.out.println("Decode :" + d.numDecodings(s2));
	    System.out.println("Decode :" + d.numDecodings(s3));

	}

}


//Decode :3