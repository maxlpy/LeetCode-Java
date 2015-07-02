package leetcode;


public class SpiralMatrixII {
	public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        if(n == 0)
            return res;
        int p = n;
        int q = n;
        int row = 0, col = -1;
        int count = 1;
        while(true) {
            for(int i = 0; i < p; i++) {
                res[row][++col] = count++;
            }
            if(--q == 0) break;
            for(int i = 0; i < q; i++) {
                res[++row][col] = count++;
            }
            if(--p == 0) break;
            for(int i = 0; i < p; i++) {
                res[row][--col] = count++;
            }
            if(--q == 0) break;
            for(int i = 0; i < q; i++) {
                res[--row][col] = count++;
            }
            if(--p == 0) break;
        }
        return res;
    }
}
