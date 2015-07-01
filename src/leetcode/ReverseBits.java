package leetcode;

public class ReverseBits {
	// you need treat n as an unsigned value
    public static long reverseBits(long n) {
    	long res = 0;
    	int count = Integer.SIZE;
    	long data = n;
    	while (count > 1) {
    		long temp = data & 1;
    		res += temp;
    		data = data >> 1;
    		res = res << 1;
    		count--;
    	}
    	return res;
    }
    public static void main(String[] args) {
		long res = reverseBits(2147483647);
		System.out.println(res); //964176192
	}
    // Unfinished
}
