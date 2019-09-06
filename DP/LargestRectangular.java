//package New;
//
//import java.util.Deque;
//import java.util.LinkedList;
//
//public class LargestRectangular {
//	
//	public int Rectangular(int matrix[][])
//	{
//		int[] temp = new int [matrix[0].length];
//		int maxArea=0;
//		int area=0;
//		maxHistogram(matrix);
//		for(int i =0 ;i <matrix.length;i++)
//		{
//			for(int j = 0 ; j <temp.length;j++)
//			{
//				if(matrix[i][j]=0)
//				{
//					temp[j]=0;
//				}
//			}
//		}
//		
//		area=mh.maxHistogram(temp);
//		if(area>maxArea)
//		{
//			maxArea=area;
//		}
//		return maxArea;
//	}
//	
//	public int maxHistogram(int[][] matrix){
//        Deque<Integer> stack = new LinkedList<Integer>();
//        int maxArea = 0;
//        int area = 0;
//        int i;
//        for(i=0; i < matrix.length;)
//        {
//            if(stack.isEmpty() || matrix[stack.peekFirst()] <= matrix[i])
//            {
//                stack.offerFirst(i++);
//            }
//            else
//            {
//                int top = stack.pollFirst();
//                
//                if(stack.isEmpty()){
//                    area = matrix[top] * i;
//                }
//                
//                else
//                {
//                    area = matrix[top] * (i - stack.peekFirst() - 1);
//                }
//                if(area > maxArea){
//                    maxArea = area;
//                }
//            }
//        }
//        while(!stack.isEmpty())
//        {
//            int top = stack.pollFirst();
//          
//            if(stack.isEmpty())
//            {
//                area = matrix[top] * i;
//            }
//            
//            else
//            {
//                area = matrix[top] * (i - stack.peekFirst() - 1);
//            }
//        if(area > maxArea)
//        {
//                maxArea = area;
//            }
//        }
//        return maxArea;
//    }
//
//	public static void main(String[] args) 
//	{
//		int matrix[][]= 
//		{{1,1,1,0},
//		{1,1,1,1},
//		{0,1,1,0},
//		{0,1,1,1},
//		{1,0,0,1},
//		{1,1,1,1}
//		};
//		LargestRectangular lr = new LargestRectangular();
//		int sum=lr.Rectangular(matrix);
//		
//			
//	}
//
//}
