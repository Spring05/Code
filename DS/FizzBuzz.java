package New;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz 
{
	 public List<String> fizzBuzz(int n)
	 {
		 if(n<1)
		 {
			 System.out.println("Not Valid");
		 }
		 
		 List<String> ans = new ArrayList<String>();
		 for(int i =1 ; i <=n;i++)
		 {
			 if(i%3==0 & i%5==0)
				 
			 {
				 ans.add("FizzBuzz");
			 }
			 
			 else if(i%3==0)
			 {
				 ans.add("Fizz");
			 }
			 
			 
			 else if(i%5==0)
			 {
				 ans.add("Buzz");
			 }
			 
			 else
			 {
				 ans.add(Integer.toString(i));
			 }
			 
		 }
		 
		 return ans;
	 
	 }


	public static void main(String[] args)
	{
		FizzBuzz fb= new FizzBuzz();
		int n = 15;
		int n1 = -1;
		fb.fizzBuzz(n);
		System.out.println(fb.fizzBuzz(n));
		System.out.println(fb.fizzBuzz(n1));
	}


	}
	

//[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]
//Not Valid
//[]
//O(n)