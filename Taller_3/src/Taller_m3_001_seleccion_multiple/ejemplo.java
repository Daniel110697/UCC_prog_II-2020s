package Taller_m3_001_seleccion_multiple;

import java.util.Scanner;

public class ejemplo {
	public static void main(String[] args) {
		
	try (Scanner scan = new Scanner(System.in)) {
	
		System.out.println();
		System.out.println("+********************************+");
		System.out.println("+    Autor: Daniel Artunduaga    +");
		System.out.println("+    Fecha: 8/11/2020            +");
		System.out.println("+    Herramientas Computacional  +");
		System.out.println("+********************************+");
		System.out.println();
		
	String nombre = "";
	int cate;
	double sueldo =0 ;

	System.out.println("Digite el nombnre del empleado:");
	nombre = scan.next();
	
	System.out.println("Digite la categoria entre 1 y 4:");
	cate = scan.nextInt(); 
	scan.reset();

	System.out.println("Digite el sueldo: $");
	sueldo = scan.nextDouble();

	switch (cate) {
	
	case 1:
		sueldo = (int) (sueldo * 1.15);
		break;
			
    case 2:
    	sueldo = (int) (sueldo * 1.10);
		break;
	case 3:
		sueldo = (int) (sueldo * 1.08);
		break;
	case 4:
		sueldo = (int) (sueldo * 1.07);
		break;
		
		default:
			sueldo = 0;
			System.out.println("La categoria no existe");
		
	}
	
	System.out.println("El nombre del empleado es:" + nombre);
	System.out.println("Su sueldo es de: $" + sueldo);
			
			 
			
			
			
		
		}

	
	}
}