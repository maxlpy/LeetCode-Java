package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//Binary Tree Level Order Traversal
//Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
//
//For example:
//Given binary tree {3,9,20,#,#,15,7},
//    3
//   / \
//  9  20
//    /  \
//   15   7


public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrder(TreeNode root) {
    	
    	List<List<Integer>> ret = new ArrayList<List<Integer>>();
    	
    	
    	if (root == null)
			return null;
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		
		List<Integer> innerList = new ArrayList<Integer>();
		
		queue.add(root);
		int curLevCnt = 1;
		int nextLevCnt = 0;
		
		
		while(!queue.isEmpty()) {
			TreeNode cur = queue.poll();
			innerList.add(cur.val);
			curLevCnt--;
			
			if (cur.left != null) {
				queue.add(cur.left);
				nextLevCnt++;
			}
			if (cur.right != null) {
				queue.add(cur.right);
				nextLevCnt++;
			}
			if (curLevCnt == 0) {
				curLevCnt = nextLevCnt;
				nextLevCnt = 0;
				ret.add(innerList);
				innerList = new ArrayList<Integer>();
			}
			
		}
		
		Collections.reverse(ret);
    	
    	return ret;
        
    }
    
    public static void main(String[] args) {  
//      TreeNode root = new TreeNode(1);  
//      TreeNode n1 = new TreeNode(2);  
//      TreeNode n2 = new TreeNode(3);  
//      TreeNode n3 = new TreeNode(4);  
//      TreeNode n4 = new TreeNode(5);  
//      root.left = n1;  
//      root.right = n2;  
//      n1.left = n3;  
//      n1.right = n4;  
          
        // {1,2,3,4,#,#,5}  
    	BinaryTreeLevelOrderTraversal temp = new BinaryTreeLevelOrderTraversal();
    	
        TreeNode root = new TreeNode(1);  
        TreeNode n1 = new TreeNode(2);  
        TreeNode n2 = new TreeNode(3);  
        TreeNode n3 = new TreeNode(4);  
        TreeNode n4 = new TreeNode(5);  
        root.left = n1;  
        root.right = n2;  
        n1.left = n3;  
        n2.right = n4;  
        System.out.println(temp.levelOrder(root));  
//      System.out.println(levelOrder(null));  
    }  
}