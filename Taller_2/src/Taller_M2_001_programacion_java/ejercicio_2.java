package Taller_M2_001_programacion_java;

import java.util.Scanner;

public class ejercicio_2 {
	public static void main(String[] args) {
		
		String a,b ="";
		int an,bn = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite un número:");
		a = scan.next();
		an = Integer.parseInt(a);
		
		System.out.println("Digite un número:");
		b = scan.next();
		bn = Integer.parseInt(b);
		
		int resultado_de_la_suma = (int) an+bn;
		int resultado_de_la_resta = (int) an-bn;
		int resultado_del_producto = (int) an*bn;
		double resultado_del_promedio = (double) ((an+bn))/2;
		
		System.out.println("La suma es:"+ resultado_de_la_suma);
		System.out.println("La resta es:"+ resultado_de_la_resta);
		System.out.println("El producto es:"+ resultado_del_producto);
		System.out.println("El promedio es:"+ resultado_del_promedio);
		
		System.out.println("+********************************+");
		System.out.println("+    Autor: Daniel Artunduaga    +");
		System.out.println("+    Fecha: 2/11/2020            +");
		System.out.println("+    Herramientas Computacional  +");
		System.out.println("+********************************+");
		
				}			
		
}	
		
		