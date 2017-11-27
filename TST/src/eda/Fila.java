package eda;

public class Fila {

	private int[] fila;
	private int head;
	private int tail;
		
	public Fila(int capacity) {
		this.fila = new int[capacity];
		this.head = -1;
		this.tail = -1;
	}
	
	public String add(int n) {
		if (isFull()) {
			return "full" + System.lineSeparator();
		}
		
		if (isEmpty()) {
			this.head = 0;
			this.tail = 0;
		} else {
			tail = (tail + 1) % fila.length;
		}

		this.fila[tail] = n; 
		return "";
	}

	public String remove() {
		if (isEmpty()) {
			return "empty" + System.lineSeparator();
		}  
		
		if (this.head == this.tail) {
			this.head = -1;
			this.tail = -1;
		} else {
			this.head = (this.head + 1) % fila.length;
		}
		
		return "";
	}
	
	public String element() {
		if (isEmpty()) {
			return "empty";
		}
		
		return String.valueOf(fila[head]);
	}
	
	public String print() {
		if (isEmpty()) {
			return "empty";
		}
		
		String toReturn = String.valueOf(fila[head]);
		
		if (head <= tail) {
			for (int i = head + 1; i <= tail; i++) {
				toReturn += " " + fila[i];
			}
		} else {
			for (int i = head + 1; i < fila.length; i++) {
				toReturn += " " + fila[i];
			}
			
			for (int j = 0; j <= tail; j++) {
				toReturn += " " + fila[j];
			}
		}
		
		return toReturn;
	}

	private boolean isEmpty() {
		return this.head == -1 && this.tail == -1;
	}

	private boolean isFull() {
		return ((this.tail + 1) % this.fila.length) == this.head;
	}
	
}