package New;



public class SumDigits 
{
	private Node head;
 	private static class Node 
 	{
		private int value;
		private Node next;
 
		Node(int value) 
		{
			this.value = value;
 
		}
	}
 
	public void insert(Node node) 
	{
 
		if (head == null) 
		{
			head = node;
		} 
		else 
		{
			Node current = head;
			while (current.next != null)
			{
				current = current.next;
			}
			current.next = node;
		}
	}
 
	public Node addList(Node first , Node second)
	{
		int carry=0,sum=0;
		Node temp=new Node(0);
		Node prev=temp;
		while(first!=null && second!=null)
		{
			sum=first.value+second.value+carry;
			if(sum >=10)
			{
				sum=sum %10;
				carry=1;
			}
			else
			{
				carry=0;
			}
			prev.next=new Node(sum);
			prev=prev.next;
			first=first.next;
			second=second.next;
		}
		
		while(first!=null)
		{
			sum=carry+first.value;
			carry=sum/10;
			prev.next=new Node(sum);
			prev=prev.next;
			first=first.next;			
		}
		while(second!=null)
		{
			sum=carry+second.value;
			carry=sum/10;
			prev.next=new Node(sum);
			prev=prev.next;
			second=second.next;			
		}
		
		if(carry==1)
		{
			prev.next=new Node(sum);
		}
		
		return temp.next;
			
	}
	public static void printnode(Node head )
	{
		Node current = head;
		System.out.println("linked List:");
		while(current!=null)
		{   
			System.out.println(current.value);
			current=current.next;
		}
	}
	
	public static void main(String[] args)
	{
		SumDigits first=new SumDigits();
		Node head1=new Node(2);
		first.insert(head1);
		first.insert(new Node(4));
		first.insert(new Node(3));

		SumDigits second=new SumDigits();
		Node head2=new Node(5);
		second.insert(head2);
		second.insert(new Node(6));
		second.insert(new Node(4));
		
		Node re = first.addList(head1,head2);
		printnode(re);
		
	}

}
//test Case 
//linked List:
//7
//0
//8
//Time complexity o(m+n)