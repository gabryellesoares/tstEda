package eda;

import java.util.Scanner;

public class Parenteses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		System.out.println(reviewInput(input));
		
		sc.close();
	}
	
	public static String reviewInput(String input) {
		int count = 0;
		int i = 0;
		boolean flag = false;
		
		while (i < input.length() && !flag) {
			String ch = Character.toString(input.charAt(i));
			if (ch.equals("(")) {
				count += 1;
			} else if (ch.equals(")")) {
				count -= 1;
			}
			
			if (count < 0) {
				flag = true;
			}
			
			i++;
		}
		
		
		if (count == 0) {
			return "S";
		}
		
		return "N";
	}
	
}
