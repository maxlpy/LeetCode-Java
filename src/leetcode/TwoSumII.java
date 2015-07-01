package leetcode;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumII {
	public int[] twoSumI(int[] numbers, int target) {  // method 1
		for (int i = 0; i < numbers.length; i++) {
			int x = numbers[i];
			int res = Arrays.binarySearch(numbers, target - x);
			if (res >= 0)
				return new int[] {i + 1, res + 1};
		}
		throw new IllegalArgumentException("No such two numbers");
	}
	public int[] twoSumII(int[] numbers, int target) {  // method 2
		for (int i = 0; i < numbers.length; i++) {
			int x = numbers[i];
			int res = bSearch(numbers, target - x, i);
			if (res >= 0)
				return new int[] {i + 1, res + 1};
		}
		throw new IllegalArgumentException("No such two numbers");
		
	}
	private int bSearch(int[] numbers, int key, int start) {
		int left = start;
		int right = numbers.length - 1;
		
		while (left <= right) {
			int mid = (left + right)/2;
			if (key < numbers[mid]) 
				right = mid - 1;
			else if (key > numbers[mid]) 
				left = mid + 1;
			else
				return mid;
		}
		return -1;
	}
	public int[] twoSumIII(int[] numbers, int target) {  // method 3
		int left = 0; 
		int right = numbers.length - 1;
		while (left < right) {
			int key = numbers[left] + numbers[right];
			if (target < key)
				right--;
			else if (target > key)
				left++;
			else
				return new int[] {left + 1, right + 1};
		}
		throw new IllegalArgumentException("No such two numbers.");
	}
	
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 6, 8, 9}; // Sorted array
		TwoSumII temp = new TwoSumII();
		System.out.println(Arrays.toString(numbers)); // Output an int array
		System.out.println(Arrays.toString(temp.twoSumIII(numbers, 10)));
	}
}
