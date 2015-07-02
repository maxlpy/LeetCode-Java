package chp2;
/*
 *  Write code to remove duplicates from a unsorted string.
 */
import java.util.Hashtable;

import org.junit.Test;


public class Chp2_1_RemoveDuplicate {
	
	public String removeDuplicate(String str) {
		
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if(!table.contains(Character.toString(str.charAt(i)))) {
				table.put(i, Character.toString(str.charAt(i)));
				res.append(str.charAt(i));
			}
		}
		return res.toString();
	}
	
	@Test
	public void test() {
		String str = "abccddffffffffffefg";
		System.out.println(removeDuplicate(str));
	}
}
