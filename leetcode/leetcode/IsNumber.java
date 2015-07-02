package leetcode;


public class IsNumber {
	public boolean isNumber(String str) {
		int i = 0;
		int len = str.length();
		while (i < len && str.charAt(i) == ' ') i++;
		if ((i < len && str.charAt(i) == '+') || (i < len && str.charAt(i) == '-'))
			i++;
		boolean res = false;
		while (i < len && Character.isDigit(str.charAt(i))) {
			i++;
			res = true;
		}
		
		if (i < len && str.charAt(i) == '.') {
			i++;
			while (i < len && Character.isDigit(str.charAt(i))) {
				i++;
				res = true;
			}
		}
		if (res && i < len && str.charAt(i) == 'e') {
			i++;
			
			if (i < len && (str.charAt(i) == '+' || str.charAt(i) == '-'))
				i++;
			if (i < len && Character.isDigit(str.charAt(i))) {
				while (i < len && Character.isDigit(str.charAt(i))) {
					i++;
					res = true;
				}
			} else 
				res = false;
		}
		while (i < len && str.charAt(i) == ' ') i++;
		return res && i == len;
	}
	public static void main(String[] args) {
		IsNumber temp = new IsNumber();
		String str = "0e+1";
		System.out.println(temp.isNumber(str));
	}
}
