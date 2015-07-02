package leetcode;


public class Sqrtx {
	public static int sqrt1(int num) {
		if (num == 0 || num == 1)
			return num;
		long low = 1;
		long high = num;
		long mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;
			long res = mid * mid;
			if (res <= num && (mid+1)*(mid+1) > num) {
				break;
			} 
			if (res > num) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return new Long(mid).intValue();
	}
	public static int sqrt(int x) {
        if (x == 0 || x == 1) return x;
        long low = 1;
        long high = x;
        long mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (mid * mid <= x && (mid + 1) * (mid + 1) > x) {
            	break;
            }
            if (mid * mid > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return (int)mid;
    }
	public static void main(String[] args) {
		int num = 5;
		System.out.println(sqrt(num));
		System.out.println(sqrt1(num));
	}
}
