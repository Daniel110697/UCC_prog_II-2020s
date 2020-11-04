package Taller_M2_001_programacion_java;

import java.util.Scanner;

public class ejercicio_3 {
	public static void main(String[] args) {
		
		String a,b,c ="";
		int an,bn,cn = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite la primera nota:");
		a = scan.next();
		an = (int) Double.parseDouble(a);
		
		
		System.out.println("Digite la segunda nota:");
		b = scan.next();
		bn = (int) Double.parseDouble(b);
		
	 
		System.out.println("Digite la tercera nota:");
		c = scan.next();
		cn = (int) Double.parseDouble(c);
		
		double nota_1 = (double) an*0.3;
		double nota_2 = (double) bn*0.3;
		double nota_3 = (double) cn*0.4;
		double nota_final = (double) (nota_1+nota_2+nota_3);
		
		System.out.println("La nota 1 es:" + nota_1 );
		System.out.println("La nota 2 es:" + nota_2 );
		System.out.println("La nota 3 es:" + nota_3 );
		System.out.println("La nota final es:" + nota_final );
		
		
		
		System.out.println("+********************************+");
		System.out.println("+    Autor: Daniel Artunduaga    +");
		System.out.println("+    Fecha: 2/11/2020            +");
		System.out.println("+    Herramientas Computacional  +");
		System.out.println("+********************************+");
	}

}
