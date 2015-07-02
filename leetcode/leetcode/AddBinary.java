package leetcode;


/**
 * Given two binary strings, return their sum (also a binary string).
 * 
 * For example, a = "11" b = "1" Return "100".
 */

public class AddBinary {
	
	public static String addBinary(String a, String b) {
		int i = a.length() - 1; 
		int j = b.length() - 1;
		
		int da = 0;
		int db = 0;
		int avd = 0;
		
		StringBuffer result = new StringBuffer(); // StringBuffer can be modified.
		
		while(i >= 0 && j >= 0) {
			da = a.charAt(i--)=='0'? 0:1; 
			db = b.charAt(j--)=='0'? 0:1;
			int d = da + db + avd;
			result.append(d % 2 == 0? '0':'1');
			avd = d >> 1;		
		}
		
		if(i >= 0) {
			while(i >=0) {
				da = a.charAt(i--)=='0'? 0:1;
				int d = da + avd;
				result.append(d % 2 == 0? '0':'1');
				avd = d >> 1;
			}
		}
		else if(j >= 0) {
			while(j >= 0) {
				db = b.charAt(i--)=='0'? 0:1;
				int d = db + avd;
				result.append(d % 2 == 0? '0':'1');
				avd = d >> 1;
			}
		}
		if (avd == 1)
		result.append('1');
		
		return result.reverse().toString(); // cast StringBuffer to String.
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "1000";
		String b = "1111";
		AddBinary temp = new AddBinary();
		String sum = temp.addBinary(a, b);
		
		System.out.println(sum);
		System.out.println("Test");
	}
}
