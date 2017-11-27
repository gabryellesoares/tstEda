package eda;

public class Stack {

	// essa eh a pilha normal, criada p ser usada no problema: torreDeHanoi
	
	int[] stack;
	int top;
	
	public Stack(int capacity) {
		this.stack = new int[capacity];
		this.top = -1;
	}
	
	public void push(int n) {
		if (isFull()) throw new RuntimeException();
		
		this.top++;
		this.stack[top] = n;
	}
	
	public int pop() {
		if (isEmpty()) throw new RuntimeException();
		
		int removed = stack[top];
		this.top--;
		return removed;
	}
	
	public int peek() {
		if (isEmpty()) return -1;
		
		return this.stack[top];
	}

	public boolean isEmpty() {
		return this.top == -1;
	}
	
	private boolean isFull() {
		return this.top == (stack.length - 1);
	}
}
