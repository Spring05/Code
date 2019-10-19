package spring;

import java.util.HashSet;

public class LinkedList {
	
	public static Node head;
	class Node
	{   
		int value;
		Node next;
		Node(int value)
		{
			this.next=null;
			this.value=value;
		}
	}


	public int insert(int value)
	{ 
		Node newNode = new Node(value);
		newNode.next=null;
		
		//first
		if(head==null)
		{
			head=newNode;
		}
		
		//end
		else
		{
			Node current = head;
			while(current.next!=null)
			{
				current = current.next;
			}
			
			current.next=newNode;
		}
		return value;
		
	}
	
	public int insertbeg(int value)
	{
	 
		Node newNode = new Node(value);
		newNode.next=head;
		head=newNode;
		return value ;		
	}
	
	
	public int insertbet(Node prev,int value)
	{
		Node newNode = new Node(value);
		if(prev==null)
		{
			System.out.println("not valid");
		}
		
		prev.next=newNode.next;
		prev.next=newNode;
		
		return value;
		
	}
	
	void deleteNode(int key) 
    { 
        // Store head node 
        Node temp = head, prev = null; 
  
        // If head node itself holds the key to be deleted 
        if (temp != null && temp.value == key) 
        { 
            head = temp.next; // Changed head 
            return; 
        } 
  
        // Search for the key to be deleted, keep track of the 
        // previous node as we need to change temp.next 
        while (temp != null && temp.value != key) 
        { 
            prev = temp; 
            temp = temp.next; 
        }     
  
        // If key was not present in linked list 
        if (temp == null) return; 
  
        // Unlink the node from linked list 
        prev.next = temp.next; 
    } 
	
	public void removeLast(Node node)
	{
		if (head ==null || head.next==null)
		{
			return;
		}
		
		Node second = head;
		if(second.next.next==null)
		{
			second.next=null;
		}
		
		second=second.next;
	}
	
	
	public void search(LinkedList s)
	{
		Node slow =head;
		Node fast = head;
		while(fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast=fast.next.next;
		}
		
		System.out.println("Element : " + slow.value);
	}
	
	public void searchLL(Node head ,int key)
	{
		Node current = head;
		if(current!=null)
		{
			if(current.value==key)
			{
				System.out.println("Element Found " + current.value);
				return;
			}
			
			current= current.next;
		}
		
		System.out.println("Not found");
	}
	
	public boolean cycle(Node h)
	{
		HashSet <Node> hs=new HashSet<>();
		while(h!=null)
		{
			if(hs.contains(h))
			{
				return true;
			}
			
			hs.add(h);
			h=h.next;
		}
		
		return false;
		
	}
	
	public Node reverse(LinkedList ll)
	{
		if(head==null | head.next==null)
		{
			return null;
		}
		Node forward=head;
		Node previous=null;
		Node current=head;
		while(current!=null)
		{ 
			//traverse forward
			forward=forward.next;
			
			//assign for reversal
			current.next=previous;
			previous=current;
			current=forward;
			
		}
		
		return previous;
	}
	
	
	
	
	
	public void print(LinkedList ll)
	{
			Node current = head;
			while(current!=null)
			{
				System.out.print(current.value + "->" );
				current= current.next;
			}
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		LinkedList s = new LinkedList();
		s.insert(7);
		s.insert(1);
		s.insert(3);
		s.insert(2);
		s.insert(8);
//		s.print(s);
//		System.out.println("Delete");
//		s.deleteNode(1);
//		s.deleteNode(8);
//		s.print(s);
//		s.removeLast(head);
//		s.print(s);
//		s.search(s);
		s.searchLL(head, 3);
		s.reverse(s);
		s.print(s);

	}

}
