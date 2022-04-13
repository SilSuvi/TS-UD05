package UD05;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		double precio;
		final double IVA = 0.21;

		System.out.print("Introducir el precio: ");
		Scanner scan = new Scanner(System.in);
		precio = scan.nextDouble();
		System.out.print("Precio con IVA: " + (precio + precio * IVA));

	}
}
