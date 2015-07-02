package leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class LongestConsecutiveSequence {
	public int longestConsecutive(int[] num) {
        if(num == null || num.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int x: num) {
            set.add(x);
        }
        int res = 0;
        while(!set.isEmpty()) {
            Iterator item = set.iterator();
            int val = (Integer)item.next();
            set.remove(val);
            
            int len = 1;
            int i = val - 1;
            while(set.contains(i)) {
                len++;
                set.remove(i--);
            }
            int j = val + 1;
            while(set.contains(j)) {
                len++;
                set.remove(j++);
            }
            if(len > res) {
                res = len;
            }
        }
        return res;
    }
}
