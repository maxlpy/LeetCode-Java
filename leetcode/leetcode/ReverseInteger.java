package leetcode;


public class ReverseInteger {
	public static int reverse(int x) {
		int ret = 0;
		while (x != 0) {
			if (Math.abs(ret) > 214748364) 
				return 0;
			ret = ret*10 + x%10;
			x = x/10;
		}
		return ret;
	}
	public static void main(String[] args) {
		int data = 1534236469;
		System.out.println(reverse(data));
		System.out.println(Integer.MAX_VALUE);
	}
}
