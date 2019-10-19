package spring;



public class LinkList {
	
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
  
	
	
	public static Node insert(int value)
	{ 
		Node newNode = new Node(0);
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
		return newNode;
		
	}
  
    
	public void print(Node node)
	{
			Node current = head;
			while(current!=null)
			{
				System.out.print(current.value + "->" );
				current= current.next;
			}
	}
	 
	
	
	public static Node merge(Node l1 ,Node l2)
	{
		
		Node temp = new Node(0);
		Node l3 = temp;
		while(l1!=null && l2 !=null)
		{
			if(l1.value <=l2.value)
			{
				l3.next=l1;
				l1=l1.next;
			}
			
			else
			{
				l3.next=l2;
				l2=l2.next;
			}
			
			l3=l3.next;
		}
		
		if(l1!=null)
		{
			l3.next=l1;
		}
		
		if(l2!=null)
		{
			l3.next=l2;
		}
		return temp.next;
	
	}
	

	public static void main(String[] args) 
	{ 
		Node head1 = insert(2); 
        head1.next = insert(4); 
        head1.next.next = insert(6); 
  
        
        Node head2 = insert(1); 
        head2.next = insert(3); 
        head2.next.next = insert(5); 
  
        
  
        Node mergedhead = merge(head1, head2); 
        
        System.out.println("Merged List");
        print(mergedhead); 
    } 

	
}
