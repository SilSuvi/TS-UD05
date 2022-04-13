package UD05;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String password = "1234";
		String intento = "";
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Intento " + (i + 1) + ": ");
			intento = scanner.nextLine();

			if (intento.equals(password)) {
				System.out.println("Enhorabuena, contraseña correcta");
				break;
			}
		}
		
		scanner.close();
	}

}
