package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given numRows, generate the first numRows of Pascal's triangle.
 * 
 * For example, given numRows = 5, Return
 * 
 * [      
 *        [1], 
 *       [1,1], 
 *      [1,2,1], 
 *     [1,3,3,1], 
 *    [1,4,6,4,1] 
 * ]
 */
public class PascalTriangle {
	public List<ArrayList<Integer>> generate(int numRows) {
	     List<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	     
	     for (int i = 1; i <= numRows; i++) {
	    	 ArrayList<Integer> list = new ArrayList<Integer>();
	         for (int j = 1; j <= i; j++) {
	             list.add(1);
	         }
	         res.add(list);
	     }
	     
	     for (int k = 2; k <= numRows; k++) {
	    	 ArrayList<Integer> prev = res.get(k - 2);
	    	 ArrayList<Integer> cur = res.get(k - 1);
	         for (int g = 1; g < cur.size() - 1; g++) {
	             cur.set(g, prev.get(g-1) + prev.get(g));
	         }
	     }
	     return res;
	}
	public static void main(String[] args) {
		PascalTriangle temp = new PascalTriangle();
		System.out.println(temp.generate(5));
	}
}
