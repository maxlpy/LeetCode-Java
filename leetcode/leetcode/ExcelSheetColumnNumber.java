package leetcode;
// https://leetcode.com/problems/excel-sheet-column-number/
/*
 * Method: 
 * 1. reverse string.
 * 2. get each character and add each bit's number as 26 “jinzhi”.
 * Time: O(n), Space: O(1)
 */
public class ExcelSheetColumnNumber {
	public static int titleToNumber(String s) {
        StringBuilder sbuilder = new StringBuilder(s);
        sbuilder.reverse();
        int len = sbuilder.length();
        int res = 0;
        for (int i = 0; i < len; i++) {
        	int num = (char)sbuilder.charAt(i) - 'A' + 1;
        	res += num * Math.pow(26, i);
        }
        return res;
    }
	public static void main(String[] args) {
		String str = "BA";
		System.out.println(titleToNumber(str));
	}
}
