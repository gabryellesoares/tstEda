package eda;

import java.util.Scanner;

public class TorreDeHanoi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		Stack A = new Stack(input);
		Stack B = new Stack(input);
		Stack C = new Stack(input);
		
		preenchePilha(A, input);
	}
	
	public static void preenchePilha(Stack p, int n) {
		for (int i = n; i >= 0; i--) {
			p.push(i);
		}
	}
	
	public static void move(Stack A, Stack B, Stack C) {
		int peek = A.peek();
		
		while (C.peek() != peek) {
			if (B.isEmpty() || B.peek() > A.peek()) {
				B.push(A.peek());
				A.pop();
			} else {
				if (A.peek() > B.peek() && C.peek() > A.peek()) {
					C.push(A.peek());
					A.pop();
				} else {
					C.push(B.peek());
					B.pop();
				}
			}
		}
	}
	
}

