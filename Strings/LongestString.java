package New;

public class LongestString {
	public static String getLong(String[] array)
	{
		int maxlength= 0;
		String longest=null;
		for(String s : array)
		{
			if(s.length()>maxlength)
			{
				maxlength=s.length();
				longest=s;
				
			}
		}
	
	
	return longest;
	}
	
	  public static void main(String[] args)
	  {
	      String[] toppings = {"Cheese", "Pepperoni", "Black Olives"};
	      String longestString = getLong(toppings);
	      System.out.format("longest string: '%s'\n", longestString);
	  }
	
}
