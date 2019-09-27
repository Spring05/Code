package New;

public class Permutationdup {
	
	//adding each character to tep string 
	//add first char of string to temp string and chk if the temp.length < 3 so call the func again 
	
	public void permute(String str1 , String res)
	{
		if(str1==null || str1.length()==0)
		{
			System.out.println("Invalid");
		}
		
		if(str1.length()==res.length())
		{
			System.out.println(res);
			return;
		}
		
		for(int i = 0 ; i <str1.length() ;i++)
		{
			permute(str1,res+str1.charAt(i));
		}
	}

	public static void main(String[] args) 
	{
		Permutationdup p = new Permutationdup();
		String str1 = "A";
		String res ="";
		System.out.println("The permuted String");
		p.permute(str1, res);

	}

}
