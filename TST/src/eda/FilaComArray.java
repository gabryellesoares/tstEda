package eda;

import java.util.Scanner;

public class FilaComArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		Fila fila = new Fila(n);
		
		String operation = sc.nextLine();
		String[] op = operation.split(" ");
		
		while (!(op[0].equals("end"))) {
			switch(op[0]) {
			case "add":
				System.out.print(fila.add(Integer.parseInt(op[1])));
				break;
				
			case "remove":
				System.out.print(fila.remove());
				break;
				
			case "element":
				System.out.println(fila.element());
				break;
				
			case "print":
				System.out.println(fila.print());
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

