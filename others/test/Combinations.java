package test;

public class Combinations {
	public StringBuilder out = new StringBuilder();
	public String in;
	
	public Combinations(String str) {
		this.in = str;
	}
	public void combine() {
		conbine(0);
	}
	public void conbine(int start) {
		for (int i = start; i < in.length(); ++i) {
			out.append(in.charAt(i));
			System.out.println(out);
			if (i < in.length()) 
				conbine(i+1);
			out.setLength(out.length()-1);
		}
	}
	
	public static void main(String[] args) {
		Combinations combination = new Combinations("abcd");
		combination.combine();
	}
}
