package CTCI;

public class InterleavingString {
	static boolean[][] mat;
	
	public boolean isInterleave(String s1, String s2, String s3) {
		if (s1.length() + s2.length() != s3.length())
			return false;
		
		mat = new boolean[s1.length() + 1][s2.length() + 1];
		mat[0][0] = true;
		
		for (int i = 1; i <= s1.length(); ++i)
			mat[i][0] = mat[i - 1][0] && (s3.charAt(i - 1) == s1.charAt(i - 1));
		
		for (int i = 1; i <= s2.length(); ++i)
			mat[0][i] = mat[0][i - 1] && (s3.charAt(i - 1) == s2.charAt(i - 1));
		
		for (int i = 1; i <= s1.length(); ++i)
			for (int j = 1; j <= s2.length(); ++j)
				mat[i][j] = (mat[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1))
						|| (mat[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1));
		return mat[s1.length()][s2.length()];
	}
	
	public static void main(String[] args) {
		
		String s2 = "wang";
		String s1 = "wana";
		String s3 = "wawangna";
		
		InterleavingString temp = new InterleavingString();
		
		temp.isInterleave(s1, s2, s3);
		
		for (int i = 0; i <= s1.length(); ++i) {
			for (int j = 0; j <= s2.length(); ++j) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
	}
}