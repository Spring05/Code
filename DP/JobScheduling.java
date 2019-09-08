package New;

import java.util.Arrays;
import java.util.Comparator;

class Job
{
	int start ,end,profit;
	Job(int start,int end,int profit)
	{
	this.start=start;
	this.end=end;
	this.profit=profit;
	}
}

class FinishComparator implements Comparator<Job>
{
	public int compare(Job arg0 , Job arg1)
	{
		if(arg0.end <= arg1.end)
		{
			return -1 ; 
		}
		
		else
		{
			return 1;
		}
	}
}



public class JobScheduling 
{
	
	public static int maximumProfit(Job[] jobs)
	{
		int T[]=new int[jobs.length];
		FinishComparator fc = new FinishComparator();
		
		//sort the jobs by finish time 
		Arrays.sort(jobs,fc);
		
		T[0]=jobs[0].profit;
		for(int i = 1 ; i < jobs.length ; i++)
		{
			T[i]=Math.max(jobs[i].profit, T[i-1]);
			for(int j = i-1; j >=0;j--)
			{
				if(jobs[i].end<=jobs[i].start)
				{
					T[i]=Math.max(T[i],jobs[i].profit+T[j]);
					break;
				}
			}
		}
		
		int value = Integer.MIN_VALUE;
		for(int val : T)
		{
			if(value<val)
			{
				value=val;
			}
		}
		
		return value;
		
	}
	

	public static void main(String[] args)
	{
		
		Job jobs[]=new Job[6];
		jobs[0]=new Job(1,3,5);
		jobs[1]=new Job(2,5,6);
		jobs[2]=new Job(4,6,5);
		jobs[3]=new Job(6,7,4);
		jobs[4]=new Job(5,8,11);
		jobs[5]=new Job(7,9,2);
		JobScheduling js = new JobScheduling();
		System.out.println("Maximum profit:" + JobScheduling.maximumProfit(jobs));
		
	}

}

//Maximum profit:11

