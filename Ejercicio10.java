package UD05;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce número de ventas");
		int resp1 = scanner.nextInt();
		int[] lista = new int[resp1];
		int total = 0;
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Número ventas en la posición " + i);
			lista[i] = scanner.nextInt();
			total += lista[i];
		}
		
		System.out.println("Suma: " + total);

	}

}
