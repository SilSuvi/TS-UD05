package UD05;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String radio;
		double numRadio = 0.0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el radio del c�rculo: ");
		radio = scanner.nextLine();

		numRadio = Double.parseDouble(radio);
		System.out.println("El �rea del c�rculo es: " + Math.PI * (Math.pow(numRadio, 2)));
		
	}

}
