package eda;

public class Pilha {
	
	// essa foi criada de acordo c as especificacoes do problema: PilhaComArray

	int top;
	int[] pilha;
	
	public Pilha(int capacity) {
		this.pilha = new int[capacity];
		this.top = -1;
	}
	
	public String push(int n) {
		String toReturn = "";
		
		if (isFull()) {
			toReturn = "full" + System.lineSeparator();
		} else {
			top++;
			pilha[top] = n; 
		}
		
		return toReturn;
	}

	public String pop() {
		if (isEmpty()) {
			return "empty" + System.lineSeparator();
		}  
		
		top--;
		return "";
		
	}
	
	public String peek() {
		String toReturn = "";
		
		if (isEmpty()) {
			toReturn = "empty";
		} else {
			toReturn = String.valueOf(pilha[top]);
		}
		
		return toReturn;
	}
	
	public String print() {
		String toReturn = "";
		if (isEmpty()) {
			toReturn = "empty";
		} else {
			toReturn += String.valueOf(pilha[0]);
			
			for (int i = 1; i <= top; i++) {
				toReturn += " " + pilha[i];
			}
		}
		
		return toReturn;
	}

	private boolean isEmpty() {
		return top == -1;
	}

	private boolean isFull() {
		return top == (pilha.length - 1);
	}
	
}
