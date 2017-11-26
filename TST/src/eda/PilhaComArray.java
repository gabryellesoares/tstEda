package eda;

import java.util.Scanner;

public class PilhaComArray {
	
	int top;
	int[] pilha;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		PilhaComArray pilha = new PilhaComArray(n);
		
		String operation = sc.nextLine();
		String[] op = operation.split(" ");
		
		while (!(op[0].equals("end"))) {
			switch(op[0]) {
			case "push":
				System.out.print(pilha.push(Integer.parseInt(op[1])));
				break;
				
			case "pop":
				System.out.print(pilha.pop());
				break;
				
			case "peek":
				System.out.println(pilha.peek());
				break;
				
			case "print":
				System.out.println(pilha.print());
				break;
			
			default:
				System.exit(0);
			}
			
			operation = sc.nextLine();
			op = operation.split(" ");
		}
		
		sc.close();
	}
	
	public PilhaComArray(int capacity) {
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

