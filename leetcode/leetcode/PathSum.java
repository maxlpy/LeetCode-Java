package leetcode;


//Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
//
//For example:
//Given the below binary tree and sum = 22,
//              5
//             / \
//            4   8
//           /   / \
//          11  13  4
//         /  \      \
//        7    2      1
//return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
		
public class PathSum {
	public int result = 0;
	public int flag = 0;
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;
		
		result = result + root.val;
		if (root.left == null && root.right == null) {
			if (result == sum) {
				flag = 1;
				return true;
			}
			else {
				result = result - root.val;
				return false;
			}
		}
		
		hasPathSum(root.left, sum);
		hasPathSum(root.right, sum);
		
		if (flag == 1)
			return true;
		else {
			result = result - root.val;
			return false;
		}
	}
	
    public static void main(String[] args) {  
        // {1,2,3,4,#,#,5}  
    	PathSum temp = new PathSum();
    	
        TreeNode root = new TreeNode(1);  
        TreeNode n1 = new TreeNode(2);  
        TreeNode n2 = new TreeNode(3);  
        TreeNode n3 = new TreeNode(4);  
        TreeNode n4 = new TreeNode(5);  
        root.left = n1;  
        root.right = n2;  
        n1.left = n3;  
        n1.right = n4;  
        System.out.println(temp.hasPathSum(root, 4));  
    }  
}
