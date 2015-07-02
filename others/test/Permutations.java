package test;

public class Permutations {
	private boolean[] used;
	private StringBuilder out = new StringBuilder();
	private String in;
	
	public Permutations(String str) {
		in = str;
		used = new boolean[str.length()];
	}
	public void permute() {
		if (out.length() == in.length()) {
			System.out.println(out);
			return;
		}
		for (int i = 0; i < in.length(); i++) {
			if (used[i]) continue;
			System.out.println(in.charAt(i));
			out.append(in.charAt(i));
			used[i] = true;
			permute();
			used[i] = false;
			out.setLength(out.length()-1);
			System.out.println(out);
		}
	}
	
	public static void main(String[] args) {
		Permutations test = new Permutations("abcd");
		System.out.println("Start.");
		test.permute();
	}
}
