package New;

public class PeakElement {
	
	public int findPeakElement(int[] m)
	{
		if(m.length==0)
		{
			return -1;
		}
		
		int l=0;
		int r = m.length-1;
		while(l<r)
		{
			int mid = (l+r)/2;
			if(m[mid]>	m[mid+1])
			{
				r=mid;
			}
			
			else
			{
				l= mid+1;
			}
		}
		
		return l;
	}

	public static void main(String[] args)
	{
		PeakElement pe = new PeakElement();
		int[] m = {1,2,3,1};
		System.out.println(pe.findPeakElement(m));

	}

}
//2
// O\big(log_2(n)\big)O(log 
