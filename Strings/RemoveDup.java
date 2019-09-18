package New;

import java.util.HashMap;


public class RemoveDup {

	public static void main(String[] args) 
	{
		int[] arr= {2,3,4,5,6,6,7,7};
		HashMap<Integer,Integer> s = new HashMap<Integer,Integer>();
		for(int i = 0 ; i <arr.length ; i++)
		{
			
			if(s.containsKey(arr[i]))
			{	
				int count = s.get(arr[i])+1;
				s.put(arr[i],count);
				System.out.println("Array has duplicates : " + Math.abs(arr[i])+ " : " + count);
			}
			
			else
			{
				s.put(arr[i],1);
			}
		}
		

	}

}
