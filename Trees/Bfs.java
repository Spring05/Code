package New;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

	private Queue<Node> q;
	static ArrayList<Node> nodes = new ArrayList<Node>();
	static class Node
	{
		int data;
		boolean visited;
		List <Node> neighbours;
		Node(int data)
		{
			this.data=data;
			this.neighbours=new ArrayList<>();
		}
		public void addneighbours(Node neighbourNode)
		{
			this.neighbours.add(neighbourNode);
		}
		public List<Node> getNeighbours()
		{
			return neighbours;
		}
		public void setNeighbours(List<Node> neighbours)
		{
			this.neighbours=neighbours;
		}
	}
			
	public Bfs()
	{
		q=new LinkedList<Node>();
	}
	
	public void dfs(Node node)
	{
		System.out.println(node.data);
		List<Node> neighbours=node.getNeighbours();
		node.visited=true;
		for(int i =0 ; i<neighbours.size();i++)
		{
			Node n = neighbours.get(i);
			if(n!=null && !n.visited)
			{dfs(n);
			}
		}
	}
		
		
		
	
	public void findnode(Node node)
	{
		q.add(node);
		node.visited=true;
		while(!q.isEmpty())
		{
			Node element = q.remove();
			System.out.println(element.data);
			List <Node> neighbours=element.getNeighbours();
			for(int i =0 ; i<neighbours.size();i++)
			{
				Node n = neighbours.get(i);
				if(n!=null && !n.visited)
				{
					q.add(n);
					n.visited=true;
				}
			}
		}
	}

	
	public static void main(String[] args) 
	{
		Node n1 = new Node(40);
		Node n2 = new Node(10);
		Node n3 = new Node(20);
		Node n4 = new Node(30);
		Node n5 = new Node(60);
		Node n6 = new Node(50);
		Node n7 = new Node(70);
		n1.addneighbours(n2);
		n1.addneighbours(n3);
		n2.addneighbours(n4);
		n2.addneighbours(n1);
		n2.addneighbours(n5);
		n2.addneighbours(n7);
		n3.addneighbours(n6);
		n3.addneighbours(n4);
		n4.addneighbours(n3);
		n5.addneighbours(n2);
		n6.addneighbours(n7);
		System.out.println("BFS");
		Bfs f = new Bfs();
		f.findnode(n4);
		System.out.println("DFS");
		f.dfs(n1);
		
		
	}

}
