package New;

public class Merged
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
 
 
	public Node mergedNode(Node list1, Node list2)
	{
		int l1_len = 0;
		int l2_len = 0;
		Node temp1=list1, temp2=list2;
		if (temp1 == null || temp2 == null)
		{
			return null;
		}
		
		while(temp1 != null)
		{
			l1_len++;
			temp1 = temp1.next;
		}
		while(temp2 !=null)
		{
			l2_len++;
			temp2 = temp2.next;
		}
 
		int difference = 0;
		Node ptr1=list1;
		Node ptr2=list2;
		
		if(l1_len > l2_len)
		{
			difference = l1_len-l2_len;
			int i=0;
			while(i<difference)
			{
				ptr1 = ptr1.next;
				i++;
			}
		}
		else
		{
			difference = l2_len-l1_len;
			int i=0;
			while(i<difference)
			{
				ptr2 = ptr2.next;
				i++;
			}
		}
 
		
		while(ptr1 != null && ptr2 != null)
		{
			if(ptr1 == ptr2)
			{
				return ptr1;
			}
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}
 
		return null;
	}
 
	public static void main(String[] args) 
	{
		Merged list1=new Merged();
		Node head1=new Node(4);
		list1.insert(head1);
		list1.insert(new Node(1));
//		Node node = new Node(0);
//		list1.insert(node);
//		list1.insert(new Node(2));
//		list1.insert(new Node(9));
		list1.insert(new Node(11));
 
		Merged list2 = new Merged();
		Node head2=new Node(12);
		list2.insert(head2);
		//list2.insert(node);
		list2.insert(new Node(13));
		list2.insert(new Node(10));
//		list2.insert(new Node(14));
//		list2.insert(new Node(41));
//		list2.insert(new Node(51));
		 
 
		Node findNode = list1.mergedNode(head1, head2);
		if(findNode==null)
		{
			System.out.println(" No Merge");
		}
		else
		{
			System.out.println("Mereg Node "+findNode.value);
		}
	}
 
}

//Test Case :Mereg Node 0
//First list is
//4 1 0 2 9 11
//Second list is
//12 0 13 10 14 41 51


//4 1 11
// 10 13 10
//No Merge

//Time complexity
//o(m+n)