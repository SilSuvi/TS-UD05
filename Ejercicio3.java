package UD05;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("�C�mo te llamas");
    String respuesta = scanner.nextLine();
    scanner.close();
    System.out.println("Hola a ti tambi�n " + respuesta); 
    
	}
}
