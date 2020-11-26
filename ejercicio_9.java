package Taller_M2_001_programacion_java;

import java.util.Scanner;

public class ejercicio_9 {
	public static void main(String[] args) {
		
		System.out.println("+********************************+");
		System.out.println("+    Autor: Daniel Artunduaga    +");
		System.out.println("+    Fecha: 2/11/2020            +");
		System.out.println("+    Herramientas Computacional  +");
		System.out.println("+********************************+");
		
		String a ="";
		int n, suma = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite un numero de cuatro cifras:");
		a = scan.next();
		n = Integer.parseInt(a);
		
		while (n>0) {
			suma = suma+n%10;
			n = n/10;
			
			System.out.println("La suma de los cuatro digitos es:" + suma);
			
			
		}
		
	}

}
