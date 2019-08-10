package New;

public class Sll 
{
	static Node head;

	public static class Node
	{
		int value ;
		Node next;
		Node(int value)
		{
			this.value = value;
			this.next=null;
		}
		
	}
	
	
	public static void Sllinsert( int value )
	{
		Node newNode = new Node(value);
		newNode.next=null;
		if(head==null)
		{
			head = newNode;
		}
		else
		{
			 Node current=head;
			 while(current.next!=null)
			 {
				 current=current.next;
			 }
			 current .next=newNode;
		}
		
	}
	
	public static void printnode(Sll s)
	{
		Node current = head;
		System.out.println("linked List:");
		while(current!=null)
		{   
			System.out.println(current.value);
			current=current.next;
		}
	}
	
	public static void findelement(Sll s)
	{
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		
		System.out.println("Middle element:" + slow.value);
		
	}
	
	public static void main(String[] args) 
	{
//		Scanner a =new Scanner(System.in);
//		System.out.println("Enter the number");
//		int nums;
//		nums= a.nextInt();

//		for(int i =1 ; i <nums ; i++)
//		{
//			Sll.Sllinsert(i);
//		}
		Sll s = new Sll();
		Sll.Sllinsert(1);
		Sll.Sllinsert(2);
		Sll.Sllinsert(3);
		Sll.Sllinsert(4);
		Sll.Sllinsert(5);
		Sll.Sllinsert(6);
		printnode(s);
		findelement(s);
	}
	
	
}

//linked List:
//1
//2
//3
//4
//5
//Middle element:3



//linked List:
//1
//2
//3
//4
//5
//6
//Middle element:4

//linked List:
//1
//Middle element:1


//Time Complexity : O(N)
