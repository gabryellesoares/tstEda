package eda;

import java.util.Scanner;

public class InverteFrase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		System.out.println(inverter(input));
		
		sc.close();
		
	}
	
	private static String inverter(String[] array) {
		int i = 0;
		
		while (i < (array.length - 1) - i) {
			swap(array, i, (array.length - 1)- i);
			i++;
		}
		
		return newPhrase(array);
	}

	private static String newPhrase(String[] array) {
		String frase = "";
		
		for (int i = 0; i < array.length; i++) {
			frase += array[i];
			if (i != array.length-1) {
				frase += " ";
			}
		}
		
		return frase;
	}

	private static void swap(String[] array, int i, int j) {
		String aux = array[i];
		array[i] = array[j];
		array[j] = aux;
	}

	
}
