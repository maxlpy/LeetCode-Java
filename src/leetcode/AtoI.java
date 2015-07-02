package leetcode;


public class AtoI {
	private static final int maxDiv10 = Integer.MAX_VALUE/10;
	public int atoi2(String str) {
		int i = 0; 
		int len = str.length();
		while (i < len && str.charAt(i) == ' ') i++;
		int sign = 1;
		if (i < len && str.charAt(i) == '+') 
			i++;
		else if (i < len && str.charAt(i) == '-') {
			sign = -1;
			i++;
		}
		int num = 0;
		while (i < len && Character.isDigit(str.charAt(i))) {
			int digit = Character.getNumericValue(str.charAt(i));
			if (num > maxDiv10 || (num == maxDiv10 && digit >= 8))
				return sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			num = 10*num + digit;
			i++;
		}
			
		return sign*num;
	}
	
	public int atoi(String str) {

		if (str == null || str.length() == 0) {
			return 0;
		}

		str = str.trim();
		char flag = '+';
		if (str.charAt(0) != flag) {
			flag = '-';
		} 
		int res = 0;
		int i = 1;
		while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			res = res*10 + (str.charAt(i) - '0');
			i++;
		}
		if (flag == '-')
			res = -res;
		if (res > Integer.MAX_VALUE) {
			res =  Integer.MAX_VALUE;
		}
		if (res < Integer.MIN_VALUE) {
			res = Integer.MIN_VALUE;
		}

		return res;

	}

	
	public static void main(String[] args) {
		AtoI temp = new AtoI();
		String str = "-1111111111111111111111111111111";
		System.out.println(temp.atoi(str));
	}
}
