package chp3;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class Chp3_1_1_ThreeStacks {
	int stackSize = 100;
	int[] buffer = new int[stackSize*3];
	int[] stackPointer = {0, 0, 0}; // track top element
	
	public void push(int stackNum, int value) {
		int index = stackNum * stackSize + stackPointer[stackNum] + 1;
		stackPointer[stackNum]++;
		buffer[index] = value;
	}
	
	public int pop(int stackNum) {
		if (isEmpty(stackNum)) throw new RuntimeException("Stack underflow");
		
		int index = stackNum * stackSize + stackPointer[stackNum];
		stackPointer[stackNum]--;
		int value = buffer[index];
		buffer[index] = 0;
		return value;
	}
	
	public int peek(int stackNum) {
		int index = stackNum * stackSize + stackPointer[stackNum];
		return buffer[index];
	}
	
	public boolean isEmpty(int stackNum) {
		return stackPointer[stackNum] == 0;
	}
	
	@Test
	public void test() {
		try {
			push(1, 11);
			push(1, 12);
			push(2, 21);
			push(2, 22);
			assertEquals(pop(1), 12);
			assertEquals(pop(1), 11);
//			pop(1);
			assertEquals(pop(2), 22);
		} catch (Exception e) {
			fail("InvalidStackException: " + e.getMessage());
		}
	}
}
