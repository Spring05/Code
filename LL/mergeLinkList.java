package New;

class mergeLinkList{ 
  
    static class Node 
    { 
        int data; 
        Node next; 
    }; 
  
    static Node newNode(int key) 
    { 
        Node temp = new Node(); 
        temp.data = key; 
        temp.next = null; 
        return temp; 
    } 
  
    
    static void printList(Node node) 
    { 
        while (node != null) 
        { 
            System.out.println(node.data); 
            node = node.next; 
        } 
    } 
  
    
    static Node merge(Node h1, Node h2) 
    { 
        if (h1 == null) 
            return h2; 
        if (h2 == null) 
            return h1; 
  
      
        if (h1.data < h2.data) { 
            h1.next = merge(h1.next, h2); 
            return h1; 
        } 
        else { 
            h2.next = merge(h1, h2.next); 
            return h2; 
        } 
    } 
  
    
    public static void main(String args[]) 
    { 
        Node head1 = newNode(2); 
        head1.next = newNode(4); 
        head1.next.next = newNode(6); 
  
        
        Node head2 = newNode(1); 
        head2.next = newNode(3); 
        head2.next.next = newNode(5); 
  
        
  
        Node mergedhead = merge(head1, head2); 
        
        System.out.println("Merged List");
        printList(mergedhead); 
    } 
} 
//
//Complexity -O(n+m)
//Merged List
//1
//2
//3
//4
//5
//6
