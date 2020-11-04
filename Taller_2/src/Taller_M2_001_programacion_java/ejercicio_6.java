package Taller_M2_001_programacion_java;

import java.util.Scanner;

public class ejercicio_6 {
	public static void main(String[] args) {
		
		String a,b ="";
		int an,bn = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Nombre del empleado:");
	    String nombre = scan.next();
	
		
		System.out.println("Valor hora : $");
		a = scan.next();
		an = (int) Double.parseDouble(a);
		
		System.out.println("Horas trabajadas:");
		b = scan.next();
		bn = (int) Double.parseDouble(b);
		
		double salario = (double) an*bn;
		
		System.out.println("El salario es: $" + salario );
		
		
		System.out.println("+********************************+");
		System.out.println("+    Autor: Daniel Artunduaga    +");
		System.out.println("+    Fecha: 2/11/2020            +");
		System.out.println("+    Herramientas Computacional  +");
		System.out.println("+********************************+");
		
	}

}
