package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumIII {
	public int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			int x = numbers[i];
			if (map.containsKey(target - x))
				return new int[] {map.get(target - x) + 1, i + 1};
			else
				map.put(x, i);
		}
		throw new IllegalArgumentException("No such two numbers.");
	}
	
	public static void main(String[] args) {
		int[] numbers = {5, 2, 3, 4, 8, 9};
		TwoSumIII temp = new TwoSumIII();
		System.out.println(Arrays.toString(numbers)); // output an int array
		System.out.println(Arrays.toString(temp.twoSum(numbers, 11)));
	}
}
