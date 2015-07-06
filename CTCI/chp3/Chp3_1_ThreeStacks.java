package chp3;


public class Chp3_1_ThreeStacks {
	class StackNode{
		public int previous;
		public int value;
		public StackNode(int pre, int val) {
			this.previous = pre;
			this.value = val;
		}
	}
	
	int stackSize = 300;
	int indexUsed = 0;
	int[] stackPointer = {-1, -1, -1};
	StackNode[] buffer = new StackNode[stackSize * 3];
	
	public void push(int stackNum, int value) {
		int lastIndex = stackPointer[stackNum];
		stackPointer[stackNum] = indexUsed;
		indexUsed++;
		buffer[stackPointer[stackNum]] = new StackNode(lastIndex, value);
	}
	
	public int pop(int stackNum) {
		int value = buffer[stackPointer[stackNum]].value;
		int lastIndex = stackPointer[stackNum];
		stackPointer[stackNum] = buffer[stackPointer[stackNum]].previous;
		buffer[lastIndex] = null;
		indexUsed--;
		return value;
	}
	
	public int peek(int stack) {
		return buffer[stackPointer[stack]].value;
	}
	
	public boolean isEmpty(int stackNum) {
		return stackPointer[stackNum] == -1;
	}
	
}
