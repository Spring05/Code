package New;

public class BSTsmall 
{
	public class TreeNode 
	{
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) 
	     { val = x; }
	 }

	int count = 0 ; //count to iterate over element to find the smallest no
    int result =Integer.MIN_VALUE; // store result -kth
    
    public int kthSmallest(TreeNode root, int k) 
    {
        traverse(root,k);
        return result;
    }
    
    public void traverse(TreeNode  root, int k )
    {
        if(root==null || count >=k)
        {
            return;
        }
        
        traverse(root.left,k);
        count++;
        if(count==k)
        {
            result=root.val;
        }
        traverse(root.right,k);
        
        
    }

	public static void main(String[] args) 
	{
		TreeNode

	}

}
