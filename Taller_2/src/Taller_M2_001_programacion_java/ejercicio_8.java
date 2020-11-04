package Taller_M2_001_programacion_java;

import java.util.Scanner;

public class ejercicio_8 {
	public static void main(String[] args) {
		
		String a,b,c,d ="";
		int an,bn,cn,dn = 0;
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Nombre del empleado:");
	    String nombre = scan.next();
	
		
		System.out.println("Valor hora : $");
		a = scan.next();
		an = (int) Double.parseDouble(a);
		
		System.out.println("Horas trabajadas:");
		b = scan.next();
		bn = (int) Double.parseDouble(b);
		
		System.out.println("Horas extras trabajadas");
		c = scan.next();
		cn = (int) Double.parseDouble(c);
		
		double salario = (double) ((an*bn+(an*0.5))+cn);
		double extras = (double) cn*(an*0.5);
		double salario_extras = (double) salario+extras;
		double salario_total = (double) salario_extras-(salario*0.12);
		
		System.out.println("El salario es: $" + salario_total  );
		
		
		System.out.println("+********************************+");
		System.out.println("+    Autor: Daniel Artunduaga    +");
		System.out.println("+    Fecha: 2/11/2020            +");
		System.out.println("+    Herramientas Computacional  +");
		System.out.println("+********************************+");

	
	}
}