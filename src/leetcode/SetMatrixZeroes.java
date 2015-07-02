package leetcode;


public class SetMatrixZeroes {
	public void setZeroes(int[][] num) {
		if (num == null || num.length == 0 || num[0].length == 0) {
			return;
		}
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[0].length; j++) {
				if (num[i][j] == 0) {
					num[i][0] = 0;
					break;
				}
			}
		}
		for (int j = 0; j < num[0].length; j++) {
			for (int i = 0; i < num.length; i++) {
				if (num[i][j] == 0) {
					num[0][j] = 0;
					break;
				}
			}
		}
		for (int i = 1; i < num.length; i++) {
			if (num[i][0] == 0) {
				for (int j = 1; j < num[0].length; j++) {
					num[i][j] = 0;
				}
			}
		}
		for (int j = 1; j < num[0].length; j++) {
			if (num[0][j] == 0) {
				for (int i = 1; i < num.length; i++) {
					num[i][j] = 0;
				}
			}
		}
		if (num[0][0] == 0) {
			for (int i = 1; i < num.length; i++) {
				num[i][0] = 0;
			}
			for (int j = 1; j < num[0].length; j++) {
				num[0][j] = 0;
			}
		}
		if (num.length > 1 && num[1][0] == 0) {
			num[0][0] = 0;
		}
		if (num[0].length > 1 && num[0][1] == 0) {
			num[0][0] = 0;
		}
	}
	public static void main(String[] args) {
		int[][] num = {{0}, {1}};
		SetMatrixZeroes temp = new SetMatrixZeroes();
		temp.setZeroes(num);
		System.out.println("Test");
	}
}
