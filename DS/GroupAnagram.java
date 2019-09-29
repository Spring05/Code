package New;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
	
	//Maintain a map {String -> List} where each key is a sorted string, 
	
	// VAlue is the list of strings from the initial input that when sorted and are equal to Key
	
	//After processing all strings, traversal the map and sort each list to be lexicographical 
	//order and copy the new list to answer list..
	
	
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
		for(int i = 0 ; i <strs.length;i++)
		{
			char[] c =strs[i].toCharArray();
			Arrays.sort(c);
			String s = new String(c);
			if(hm.containsKey(s))
			{
				hm.get(s).add(strs[i]);
			}
			else
			{
				List<String> l = new ArrayList<String>();
				l.add(strs[i]);
				hm.put(s,l);
			}
		}
		
		return new ArrayList<List<String>>(hm.values());
		
		
	}

	public static void main(String[] args) 
	{
		GroupAnagram g = new GroupAnagram();
		String[] strs= 
			{"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(g.groupAnagrams(strs));

	}

}
