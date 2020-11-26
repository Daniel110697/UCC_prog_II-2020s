package Taller_M2_001_programacion_java;

import java.util.Scanner;

public class ejercicio_7 {
	public static void main(String[] args) {
		
		String a,b="";
		int an,bn = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite el tiempo en minutos:");
		a = scan.next();
		an = (int) Double.parseDouble(a);
		
		
		System.out.println("Digite la cantidad  de paginas escritas:");
		b = scan.next();
		bn = (int) Double.parseDouble(b);
		
	 
	
		
		double paginas = (double) an*0.5;
		double tiempo = (double) bn*2;
		
	
		
		System.out.println("El numero de paginas que escribio fue:" + paginas);
		System.out.println("El tiempo que tardo en minutos fue:" + tiempo);
		
		System.out.println("+********************************+");
		System.out.println("+    Autor: Daniel Artunduaga    +");
		System.out.println("+    Fecha: 2/11/2020            +");
		System.out.println("+    Herramientas Computacional  +");
		System.out.println("+********************************+");
		
		
	}	

}
