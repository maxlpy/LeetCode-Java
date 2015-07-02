package leetcode;

import java.util.ArrayList;
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

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class BinaryTreeLevelOrderTraversal {
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
    	return ret;
    }
    
/*
 *  Try to use BFS to do binary tree level order traversal    
 */
    public List<List<Integer>> BFS(TreeNode root) {
    	List<List<Integer>> ret = new ArrayList<List<Integer>>();
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	List<Integer> innerList = new ArrayList<Integer>();
    	
    	if (root == null) return null;
    	TreeNode flag = new TreeNode(-100);
    	   	
    	queue.add(root);
    	queue.add(flag);   // end flag of each level
    	
    	while (!queue.isEmpty()) {
    		TreeNode node = queue.poll();  // queue.poll return and remove
    		if (node.left != null) {
    			queue.add(node.left);
    		}
    		if (node.right != null) {
    			queue.add(node.right);
    		}
    		// flag node if node.val = -1, tree node if node.val != -1
    		if (node.val != -100)
    			innerList.add(node.val);
    		else {
    			ret.add(innerList);
    			innerList = new ArrayList<Integer>();
    			// the last element is flag, then queue is empty
    			if (queue.isEmpty()) 
        			break;
    			else
    				queue.add(flag);
    		}
    	}
    	return ret;
    }
    
    public static void main(String[] args) {  
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
        n1.right = n4;  
        System.out.println(temp.levelOrder(root));  
        System.out.println(temp.BFS(root));  
    }  
}