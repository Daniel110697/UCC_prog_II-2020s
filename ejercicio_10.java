package Taller_M2_001_programacion_java;

import java.util.Scanner;

public class ejercicio_10 {
	public static void main(String[] args) {
		
		String a,b,c ="";
		int an,bn,cn = 0;
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Nombre del empleado:");
	    String nombre = scan.next();
	    
	    System.out.println("Digite el codigo del trabajador:");
	    String codigo = scan.next();
	    
	    
	    System.out.println("Valor hora : $");
		a = scan.next();
		an = (int) Double.parseDouble(a);
		
		System.out.println("Horas trabajadas:");
		b = scan.next();
		bn = (int) Double.parseDouble(b);
		
		if (bn>48) {
			cn =bn-48;
		}
		System.out.println("Total de horas extras" +cn);
		
		int salario = (int) an*bn;
		int salario_extras = (int) ((an+(an*0.2))+cn);
		int salario_total = (int) salario+salario_extras;
		
		System.out.println("Salario a pagar es:"+salario_total);
		
		System.out.println("+********************************+");
		System.out.println("+    Autor: Daniel Artunduaga    +");
		System.out.println("+    Fecha: 2/11/2020            +");
		System.out.println("+    Herramientas Computacional  +");
		System.out.println("+********************************+");
		
		
		

}
}