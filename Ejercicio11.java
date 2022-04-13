package UD05;

import javax.swing.JOptionPane;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pregunta = JOptionPane.showInputDialog("¿Qué día es hoy?");
        String dia = pregunta.toLowerCase().replace('é','e').replace('á','a').trim();
        
        switch (dia) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes": JOptionPane.showMessageDialog(null, "Es día laborable");
            break;
            case "sabado":
            case "domingo": JOptionPane.showMessageDialog(null, "Es fin de semana");
            break;
            default: JOptionPane.showMessageDialog(null,"Respuesta no válida");
            break;
		
	}

}}
