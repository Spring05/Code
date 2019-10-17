package spring;

import java.util.HashMap;
import java.util.HashSet;

public class CommonWords {
	
	public String mostCommonWord(String paragraph, String[] banned) 
    {
        if(paragraph.length()==0 || paragraph==null||banned.length ==0 || banned==null)
        {
            System.out.println("Not valid");
        }
        
        //add the  banned words to HashSet 
        HashSet<String> bannedwords = new HashSet<>();
        for(String words:banned)
        {
        	bannedwords.add(words);
        }
        
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        for(String words:paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase().split(""))
        {
        	if(!bannedwords.contains(words))
        	{
        		hm.put(words,hm.getOrDefault(words,0)+1);
        	}
        }
        
        
        String result = "";
        for(String key : hm.keySet())
        {
        	//if the previous word count  is greater than the current
        	if(result.equals ("") || hm.get(key) > hm.get(result))
        	{
        		result=key;
        	}
        }
        
        return result;
        
    }

	public static void main(String[] args) 
	{
		CommonWords cm = new CommonWords();
		String paragraph ="Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {"hit"};
		System.out.println("Common Words:" + cm.mostCommonWord(paragraph, banned));
	}

}
