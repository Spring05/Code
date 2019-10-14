package New;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Randomized 
{
	
	 ArrayList<Integer> array;
	 HashMap<Integer, Integer> h = new HashMap<Integer,Integer>();
	    

	    /** Initialize your data structure here. */
	    public Randomized() 
	    {
	        array = new ArrayList<Integer>();
	        h=new HashMap<Integer,Integer>();
	        
	    }
	    
	    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
	    public boolean insert(int val) 
	    {
	        //if element is already present in hash 
	        if(h.containsKey(val))
	        {
	            return false;
	        }
	        
	          //add to hash 
	        h.put(val,array.size());
	       // Add the element to array 
	        array.add(val);
	      
	        return true;
	    }
	    
	  
	    public boolean remove(int val) 
	    {
	        //if element is not present
	        if(!h.containsKey(val))
	        {
	            return false;
	        }
	        
	          //swap the element to be removed with the last element in arraay to be done in o(1) time;
	        if(h.get(val) < array.size()-1)
	        {
	            int last = array.get(array.size()-1);
	            array.set(h.get(val),last);
	            h.put(last,h.get(val));
	            
	        }
	    
	        //else remove
	        
	        h.remove(val);
	        array.remove(array.size()-1);
	        return true;
	        
	    }
	   
	    
	   
	    public int getRandom() 
	    {
	         Random rand = new Random();
	         return array.get( rand.nextInt(array.size()) );
	    }


	public static void main(String[] args)
	{
		Randomized r = new Randomized();
		System.out.println("Obj:"+r);
		System.out.println("Added element:" + r.insert(10));
		System.out.println("Added element:" + r.insert(1));
		System.out.println("Added element:" + r.insert(1));
		System.out.println("Added element:" + r.insert(2));
		System.out.println("Random :" + r.getRandom());
		System.out.println("Remove Element: " + r.remove(1));
		System.out.println("Random: " + r.getRandom());
		
		
	}

}

//ObjNew.Randomized@33909752
//Added element:true
//Added element:true
//Added element:false
//Added element:true
//Random :2
//Remove Element: true
//Random: 2

