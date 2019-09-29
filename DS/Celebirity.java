package New;

public class Celebirity {
	
	 public int findCelebrity(int n) 
	    {
	        int celeb = 0;
	        for(int i=1 ; i < n ; i ++)
	        {
	            if(knows(celeb,i))
	            {
	                celeb=i;
	            }
	        }
	        
	        for(int i=1 ; i < n ; i ++)
	        {
	            if(i!= celeb && knows(celeb,i) || !knows(i,celeb))
	            {
	                return -1;
	            }
	        }
	        
	        return celeb;
	    }
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
