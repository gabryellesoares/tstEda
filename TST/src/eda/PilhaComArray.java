package eda;

import java.util.Scanner;

public class PilhaComArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		Pilha pilha = new Pilha(n);
		
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

}

