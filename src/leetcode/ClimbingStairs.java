package leetcode;


public class ClimbingStairs {
	public int climbingStairs(int n) {
		if (n == 1) return 1;
		if (n == 2) return 2;
		
		return climbingStairs(n - 1) + climbingStairs(n - 2);
	}
	
	public int climbingStairs2(int n) {
		
		int[] array = new int[n+1];
		array[1] = 1;
		array[2] = 2;
		
		for (int i = 3; i < n + 1; i++)
			array[i] = array[i-1] + array[i-2];
		
		return array[n];
	}
	
	public static void main(String[] args) {
		int stairs = 40;
		
		ClimbingStairs temp = new ClimbingStairs();
		
		System.out.println(temp.climbingStairs2(stairs));
		System.out.println(temp.climbingStairs(stairs));
	}
}
