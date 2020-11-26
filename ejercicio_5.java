package Taller_M2_001_programacion_java;

import java.util.Scanner;

public class ejercicio_5 {
	public static void main(String[] args) {
		
		String a,b ="";
		int an,bn = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Efectivo: $");
		a = scan.next();
		an = (int) Double.parseDouble(a);
		
		System.out.println("Valor pagado: $");
		b = scan.next();
		bn = (int) Double.parseDouble(b);
		
		double cambio = (double) (an-bn);
		
		System.out.println("Cambio es: $" + cambio);
		
		System.out.println("+********************************+");
		System.out.println("+    Autor: Daniel Artunduaga    +");
		System.out.println("+    Fecha: 2/11/2020            +");
		System.out.println("+    Herramientas Computacional  +");
		System.out.println("+********************************+");
	}

}
