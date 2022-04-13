package UD05;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserte número");
		int num = scanner.nextInt();

		System.out.println((num % 2 == 0) ? "Es divisible de 2" : "No es divisible entre 2");

	}
}