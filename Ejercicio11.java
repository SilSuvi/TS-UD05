package UD05;

import javax.swing.JOptionPane;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pregunta = JOptionPane.showInputDialog("�Qu� d�a es hoy?");
        String dia = pregunta.toLowerCase().replace('�','e').replace('�','a').trim();
        
        switch (dia) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes": JOptionPane.showMessageDialog(null, "Es d�a laborable");
            break;
            case "sabado":
            case "domingo": JOptionPane.showMessageDialog(null, "Es fin de semana");
            break;
            default: JOptionPane.showMessageDialog(null,"Respuesta no v�lida");
            break;
		
	}

}}
