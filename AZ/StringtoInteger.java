package spring;

public class StringtoInteger {
	
	  public int myAtoi(String str)
	  {
		  if(str==null || str.length()==0)
		  {
			  System.out.println("Not Valid");
			  return 0;
		  }
		  
		  //check for non whitespace 
		  str= str.trim();
		 
		//check for positive or negative sign
	        boolean isNegative = false;
	        int startIndex = 0;
	        double result =0 ;
	        
	        //first character of the string is ‘+’ or ‘-’, and if so we increment the startIndex
	        if(str.charAt(0) == '+' || str.charAt(0) == '-')
	        {
	           startIndex++;
	        }
	        
	        if(str.charAt(0) == '-') 
	        {
	            isNegative = true;
	        }
	        
	        for(int i = startIndex ; i < str.length() ; i ++)
	        {
	        	
	        	////checking if  value is below or above 0 or 9
	        	if(str.charAt(i) < '0' || str.charAt(i) > '9') 
	        	{ 
	                 break;
	            }
	        	
	        	//get the ith character and sub with 0 as int value 
	        	int digitvalue = (int)(str.charAt(i) - '0');
	        	
	        	//update result variable in order to regenerate the numeric value as result * 10 + digitValue.
	        	result = result * 10+digitvalue;
	        }
	        	
	        	// result is negative if first character is negative 
	            if(isNegative) 
	            {
	                result = -result;
	            }
	            
	            //check min and max value
	            if(result < Integer.MIN_VALUE)
	            {
	            	return Integer.MIN_VALUE;
	            }
	            
	            if(result > Integer.MAX_VALUE)
	            {
	            	return Integer.MAX_VALUE;
	            }
	            
	          //return result in integer form
	            return (int)result;
	        
	  }

	public static void main(String[] args) 
	{
		StringtoInteger st = new StringtoInteger();
		String str = "+-123";
		String str1 = "+-wehave";
		String str2 = "";
		String str3 = "hi12jk23";
		String str4 = "12+-234";
		String str5 = "     +-123";
		String str6 =  "-91283472332";
		String str7= "42";
		System.out.println("Value : " + st.myAtoi(str));
		System.out.println("Value1 : " + st.myAtoi(str1));
		System.out.println("Value2 : " + st.myAtoi(str2));
		System.out.println("Value3 : " + st.myAtoi(str3));
		System.out.println("Value4 : " + st.myAtoi(str4));
		System.out.println("Value5 : " + st.myAtoi(str5));
		System.out.println("Value6 : " + st.myAtoi(str6));
		System.out.println("Value7 : " + st.myAtoi(str7));
	}

}
