package leetcode;

import java.util.HashMap;


public class ConstructBinaryTreeFromInorderAndPostOrderTraversal {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		if (inorder == null || postorder == null) {
		return null;
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < inorder.length; i++) {
			map.put(inorder[i], i);
		}
		return helper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, map);
	}

	private TreeNode helper(int[] inorder, int inL, int inR, int[] postorder, int postL, int postR, HashMap<Integer, Integer> map) {
		if (inL > inR || postL > postR) {
		return null;
		}
		TreeNode root = new TreeNode(postorder[postR]);
		int index = map.get(root.val);
		root.left = helper(inorder, inL, index - 1, postorder, postL, postL + index -inL - 1, map);
		root.right = helper(inorder, index + 1, inR, postorder, postR -(inR - index), postR - 1, map);
		return root;
	}
}
