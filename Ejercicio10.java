package UD05;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce n�mero de ventas");
		int resp1 = scanner.nextInt();
		int[] lista = new int[resp1];
		int total = 0;
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println("N�mero ventas en la posici�n " + i);
			lista[i] = scanner.nextInt();
			total += lista[i];
		}
		
		System.out.println("Suma: " + total);

	}

}
