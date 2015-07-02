package leetcode;


// https://leetcode.com/problems/excel-sheet-column-title/


public class ExcelSheetColumnTitle {
	public String convertToTitle(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException("n is invalid.");
		}
		StringBuilder sbuilder = new StringBuilder();
		while (n > 0) {
			n--;  // change 1 into 0;
			char res = (char)(n % 26 + 'A');
			sbuilder.append(res);
			n /= 26;
		}
		sbuilder.reverse();
		return sbuilder.toString();
	}
	public static void main(String[] args) {
		ExcelSheetColumnTitle test = new ExcelSheetColumnTitle();
		String res = test.convertToTitle(27);
		System.out.println(res);
	}
}
