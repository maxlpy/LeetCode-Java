package leetcode;


import java.util.ArrayList;
import java.util.List;

public class PathSumII {
	int result = 0;
	static int flag = 0;
	static List<List<Integer>> ret = new ArrayList<List<Integer>>();
	List<Integer> innerList = new ArrayList<Integer>();
	
	public List<List<Integer>> pathSumII(TreeNode root, int sum) {
		if (root == null)
			return null;
		result = result + root.val;
		innerList.add(root.val);
		
		if (root.left == null && root.right == null) {
			if (result == sum) {
				flag = flag + 1;
				ret.add(innerList);
				innerList = new ArrayList<Integer>(innerList);
				result = result - root.val;
				innerList.remove(innerList.size()-1);
				return null;
			}
			else {
				result = result - root.val;
				innerList.remove(innerList.size()-1);
				return null;
			}
		}
		
		pathSumII(root.left, sum);
		pathSumII(root.right, sum);
		
		if (flag >= 1) {
			result = result - root.val;
			innerList.remove(innerList.size()-1);
			return null;
		}
		else {
			result = result - root.val;
			innerList.remove(innerList.size()-1);
			return null;
		}
	}
	
	public static void main(String[] args) {  
        // {1,2,3,4,#,#,5}  
		PathSumII temp = new PathSumII();
    	
        TreeNode root = new TreeNode(1);  
        TreeNode n1 = new TreeNode(2);  
        TreeNode n2 = new TreeNode(7);  
        TreeNode n3 = new TreeNode(4);  
        TreeNode n4 = new TreeNode(5);  
        root.left = n1;  
        root.right = n2;  
        n1.left = n3;  
        n1.right = n4;  
        
        temp.pathSumII(root, 8);
        System.out.println(ret); 
        System.out.println(flag);
    } 

}
