package leetcode;
// https://leetcode.com/problems/factorial-trailing-zeroes/

/*
 * Method:
 * 1. the problem is equal to compute how many multiples of 5 are between 1 and n.
 * 2. reference here: http://www.purplemath.com/modules/factzero.htm
 */

public class FactorialTrailingZeroes {
	public static int trailingZeroes(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
        	int res = (int) (n / Math.pow(5, i));
        	if (res >= 1) {
        		sum += res;
        	} else {
        		break;
        	}
        }
        return sum;
    }
	public static void main(String[] args) {
		System.out.println(trailingZeroes(101));
	}
}
