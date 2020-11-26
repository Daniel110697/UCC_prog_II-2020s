package Taller_M2_001_programacion_java;

import java.util.Scanner;

public class ejercicio_11 {
public static void main(String[] args) {
		
		String a ="";
		int n = 0;
		Scanner scan = new Scanner (System.in);

		System.out.println("Digite un número:");
		a = scan.next();
		n = Integer.parseInt(a);
		
		int resultado = (int) Math.abs(n);
				
				System.out.println("El valor absoluto del numero es:"+resultado);
				
				System.out.println("+********************************+");
				System.out.println("+    Autor: Daniel Artunduaga    +");
				System.out.println("+    Fecha: 2/11/2020            +");
				System.out.println("+    Herramientas Computacional  +");
				System.out.println("+********************************+");
}
}
