package spring;

public class IntegertoRoman {

	
	public String intToRoman(int num)
	{
		if(num==0)
		{
			System.out.println("Not Valid");
			return null;
		}
        int[] arabics = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < arabics.length ; i ++)
        {
        	while(num-arabics[i]>=0)
        	{
        		sb.append(romans[i]);
        		num=num-arabics[i];
        	}
        	
        }
        
        return sb.toString();
	}
        
	public static void main(String[] args)
	{
		IntegertoRoman ir = new IntegertoRoman();
		int num = 3;
		System.out.println("IntegerttoRoman : " + ir.intToRoman(num));
		
		int num1 = 986;
		System.out.println("IntegerttoRoman : " + ir.intToRoman(num1));
		
		int num2 = 0;
		System.out.println("IntegerttoRoman : " + ir.intToRoman(num2));

	}

}


//IntegerttoRoman : III
//IntegerttoRoman : CMLXXXVI
//Not Valid
//IntegerttoRoman : null