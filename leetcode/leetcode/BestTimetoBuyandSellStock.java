package leetcode;


public class BestTimetoBuyandSellStock {
	public int maxProfit(int[] num) {
		if (num == null || num.length == 0) {
			return 0;
		}
		int[] val = new int[num.length];
		int i = num.length - 2;
		val[num.length-1] = num[num.length-1];
		while (i >= 0) {
			if(num[i] > val[i+1]) {
				val[i] = num[i];
			} else {
				val[i] = val[i+1];
			}
			i--;
		}
		int j = 0;
		int maxProfit = 0;
		while (j < num.length-1) {
			if ((val[j+1] - num[j]) > maxProfit) {
				maxProfit = val[j+1] - num[j];
			}
			j++;
		}
		return maxProfit;
	}
	public int maxProfit2(int[] num) {
		if (num == null || num.length == 0) {
			return 0;
		}
		int global = num[0];
		int maxProfit = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] < global) {
				global = num[i];
			} else if (num[i] - global > maxProfit) {
				maxProfit = num[i] - global;
			}
		}
		return maxProfit;
	}
	public static void main(String[] args) {
		int[] price = {6,1,3,2,4,7};
		BestTimetoBuyandSellStock temp = new BestTimetoBuyandSellStock();
		System.out.println(temp.maxProfit2(price));
	}
}
