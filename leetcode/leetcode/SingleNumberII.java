package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * Given an array of integers, every element appears three times except for one. Find that single one.
 * Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/
public class SingleNumberII {
	public int singleNumberII(int[] num) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < num.length; i++) {
			if (map.containsKey(num[i])) {
				map.put(num[i], map.get(num[i]) + 1);
			} else 
				map.put(num[i], 1);
		}
		Iterator items = map.entrySet().iterator();
		int res = 0;
		while (items.hasNext()) {
			Map.Entry<Integer, Integer> elm = (Map.Entry<Integer, Integer>) items.next();
			if (elm.getValue() == 1) {
				res = elm.getKey();
				break;
			}
		}
		return res;
	}
}
