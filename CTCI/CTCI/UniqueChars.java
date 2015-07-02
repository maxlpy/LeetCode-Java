package CTCI;

/*
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you can not use additional data structures?
 */

public class UniqueChars {
	
	public boolean isUniqueChars(String str){
		boolean[] result = new boolean[256];
		
		for (int i = 0 ; i < str.length(); i++) {
			int val = str.charAt(i);
			System.out.println(val);
			
			if (result[val]) return false;
			
			result[val] = true;
		}
		return true;
	}

	public static void main(String[] args) {
		UniqueChars uniqueChars = new UniqueChars();
		
		boolean str = uniqueChars.isUniqueChars("aabcdef");
		System.out.println(str);
	}
}
