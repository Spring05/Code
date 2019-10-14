package New;

import java.util.HashMap;
import java.util.TreeMap;

public class TimeKey {
	
	HashMap<String,TreeMap<Integer,String>> hm ;
	
	public TimeKey()
	{
		hm= new HashMap<>();
	}
	
	public void set(String key , String value, int timestamp)
	{
		if(!hm.containsKey(key))
		{
			hm.put(key,new TreeMap<>());
		}
		
		hm.get(key).put(timestamp, value);
	}
	
	public String get(String key , int timestamp)
	{
		TreeMap<Integer,String> tm = hm.get(key);
		if(tm==null)
		{
			return "Hi";
		}
		
		Integer floor = tm.floorKey(timestamp);
		if(floor==null)
		{
			return "No";
		}
		
		return tm.get(floor);
	}

	public static void main(String[] args)
	{
		TimeKey tk = new TimeKey();
		tk.set("foo", "bar", 10);
		
		String s =tk.get("foo", 1);
		System.out.println(s);
		
		String s1 =tk.get("foo", 3);
		System.out.println(s1);
		
		tk.set("foo", "bar2", 4);   
		
		String s2= tk.get("foo", 4);
		System.out.println(s2);
		String s3= tk.get("foo", 5);
		System.out.println(s3);

		String s4= tk.get("foo",-10);
		System.out.println(s4);

		
	
		
		
	}
	

}

//No
//No
//bar2
//bar2
//No
