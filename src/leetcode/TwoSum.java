package leetcode;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TwoSum {
	private Map<Integer, Integer> table = new HashMap<>();
	
	public void add(int number) {
		int count = table.containsKey(number)?table.get(number):0;
		this.table.put(number, count + 1);
	}
	
	public boolean find(int target) {
		Set<Map.Entry<Integer, Integer>> set = table.entrySet();
		Iterator<Map.Entry<Integer, Integer>> item = set.iterator();
		
		while (item.hasNext()) {
			Map.Entry<Integer, Integer> me = item.next();
			int key = me.getKey();
			int temp = target - key;
			if (key == temp) {
				System.out.println(me.getValue());
				if (me.getValue() >= 2)
					return true;
			} else if (table.containsKey(temp))
					return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] numbers = {2, 2, 3, 2, 7, 9};
		TwoSum temp = new TwoSum();
		for (int number: numbers)
			temp.add(number);
		System.out.println(temp.find(17));
	}
}
