package chp3;

import java.util.Stack;
import org.junit.Test;

public class Chp3_4_Tower {
	public class Tower {
		private Stack<Integer> disks;
		private int index;
		
		public Tower(int i) {
			disks = new Stack<Integer>();
			index = i;
		}
		
		public int index() {
			return index;
		}
		
		public void add(int d) { 
			try {
				if (!disks.isEmpty() && disks.peek() <= d)
					throw new Exception("Error placing disk " + d);
				else 
					disks.push(d);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void moveBottomTo(Tower t) {
			int top = disks.pop();
			t.add(top);
			System.out.println("Move disk " + top + " from " + this.index + " to " + t.index);
		}
		
		public void moveDisks(int n, Tower dest, Tower buffer) {
			if (n > 0) {
				moveDisks(n-1, buffer, dest);
				moveBottomTo(dest);
				buffer.moveDisks(n-1, dest, this);
			}
		}
		
		public int size() {
			return disks.size();
		}
		
		public String toString() {
			return disks.toString();
		}
	}		
	
	@Test
	public void test() {
		Tower[] towers = new Tower[3];
		for (int i = 0; i < 3; i++) {
			towers[i] = new Tower(i);
		}
		for (int i = 5; i >= 1; i--) {
			towers[0].add(i);
		}
		System.out.println("Tower0: " + towers[0]);
		towers[0].moveDisks(towers[0].size(), towers[1], towers[2]);
		System.out.println("Tower1: " + towers);
	}
}
