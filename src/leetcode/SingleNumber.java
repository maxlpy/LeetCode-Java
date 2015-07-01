package leetcode;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber {
	public int singleNumber(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {  // too slow
			int count = map.containsKey(arr[i]) ? map.get(arr[i]) : 0;
			map.put(arr[i], count + 1);
		}
		for (int item: arr) {
			int res = map.get(item);
			if (res == 1)
				return item;
		}
		throw new IllegalArgumentException("There is no single number.");
	}
	public int singleNumber2(int[] arr) {  // too slow
		Set<Integer> set = new HashSet<>();
		for (int item: arr) {
			if (set.contains(item))
				set.remove(item);
			else
				set.add(item);
		}
		return set.iterator().next();
	}
	public static void main(String[] args) {
		int num = 100;
		int x = 101;
		num ^= x;
		System.out.println(num);
	}
}
