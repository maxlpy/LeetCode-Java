package leetcode;
// https://leetcode.com/problems/intersection-of-two-linked-lists/


// Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
	    val = x;
	    next = null;
	}
}

/*
 * Method: 
 * 1. get the length of two lists; 
 * 2. move the longer list's pointer to abs(lenA - lenB); 
 * 3. use two pointers to check val of each ListNode, return the intersection node if two ListNode are equal.
 * Time: O(m+n), Space: O(1)
 */

public class IntersectionofTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
        	return null;
        }
        int lenA = 0;
        int lenB = 0;
        ListNode pa = headA;
        ListNode pb = headB;
        
        while (headA != null) {
        	lenA++;
        	headA = headA.next;
        }
        while (headB != null) {
        	lenB++;
        	headB = headB.next;
        }
        
        int diff = Math.abs(lenA - lenB);
        if (lenA > lenB) {
        	while (diff > 0) {
        		pa = pa.next;
        		diff--;
        	}
        } else {
        	while (diff > 0) {
        		pb = pb.next;
        		diff--;
        	}
        }
        ListNode beginer = null;
        while (pa != null && pb != null) {
        	if (pa.val == pb.val && beginer == null) {
        		beginer = pa;
        	} else if (pa.val != pb.val && beginer != null) {
        		beginer = null;
        	}
        	pa = pa.next;
    		pb = pb.next;
        }
        return beginer;
    }
}
