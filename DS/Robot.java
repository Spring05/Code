package New;

public class Robot {

	 public boolean judgeCircle(String moves)
	 
	 {
		 if(moves.length()==0 || moves =="")
		 {
			 return false;
		 }
		 int x = 0, y = 0;
	     for (char c: moves.toCharArray()) 
	     {
	            if (c == 'U')
	            {
	            	y--;
	            }
	            else if (c == 'D') 
	            {
	            	y++;
	            }
	            else if (c == 'L') 
	            {
	            	x--;
	            }
	            else if (c == 'R') 
	            {
	            	x++;
	            }
	      }
	        return x == 0 && y == 0;
	    }
	 	 
	public static void main(String[] args) 
	{
		Robot r = new Robot ();
		String moves = "UD";
		String moves1 = "";
		String moves2 ="LL";
		String moves3 ="RL";
		System.out.println(r.judgeCircle(moves));
		System.out.println(r.judgeCircle(moves1));
		System.out.println(r.judgeCircle(moves2));		
		System.out.println(r.judgeCircle(moves3));	
	}

}
