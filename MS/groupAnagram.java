package msOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class groupAnagram {

	public List<List<String>> groupAnagrams(String[] strs)
	{
		if(strs.length==0||strs==null)
		{
			System.out.println("Invalid Entry");
		}
		
		if(strs.length==1)
		{
			System.out.println("Single Character");
		}
		
		HashMap<String,List<String>> hm = new HashMap<String,List<String>>();
		for(int i = 0 ; i < strs.length;i++)
		{
			char[] ch = strs[i].toCharArray();
			Arrays.sort(ch);
			String sorted = new String(ch);
			if(hm.containsKey(sorted))
			{
				hm.get(sorted).add(strs[i]);
			}
			
			else
			{
				List<String> words = new ArrayList<>();
				words.add(strs[i]);
				hm.put(sorted,words);
				
			}
		}
		return new ArrayList<List<String>>(hm.values());
		
		
	}
	
	
	public static void main(String[] args)
	{
		groupAnagram g = new groupAnagram();
		String[] strs= 
			{"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(g.groupAnagrams(strs));


     }
	
	
	
	
	
}




//[[eat, tea, ate], [bat], [tan, nat]]

//TC o(nklogk) n - length of strs and kk max length strs
//sort o(klogk) o(n) -outer loop
//SC o(nk)
