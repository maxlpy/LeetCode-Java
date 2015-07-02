package leetcode;

import java.util.ArrayList;

import leetcode.ReverseNodesinKGroup.ListNode;

public class SortedListToBST {
	public TreeNode sortedListToBST(ListNode head) {
		if(head == null) {
		return null;
		}
		int count = 0;
		ListNode cur = head;
		while (cur != null)
			count++;
			cur = cur.next;
		}
		ArrayList<ListNode> list = new ArrayList<ListNode>();
		list.add(head);
		return helper(list, 0, count-1);
	}
	public static TreeNode helper(ArrayList<ListNode> list, int start, int end) {
		if (start > end) {
			return null;
		}
		int mid = (start+end)/2;
		TreeNode left = helper(list, start, mid-1);
		TreeNode root = new TreeNode(list.get(0).val);
		list.set(0, list.get(0).next);
		root.left = left;
		root.right = helper(list, mid+1, end);

		return root;
	}

}
