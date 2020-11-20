package Taller_m3_002_ciclos_mientras;

import java.util.Scanner;

public class ejercicio_2 {
	public static void main (String[] args){

		System.out.println();
		System.out.println("+********************************+");
		System.out.println("+    Autor: Daniel Artunduaga    +");
		System.out.println("+********************************+");
		System.out.println("+       Fecha: 15/11/2020        +");
		System.out.println("+********************************+");
		System.out.println("+   Herramientas Computacional   +");
		System.out.println("+********************************+");
		System.out.println();
	
		
		int num;
    	int resultado=0; 
    	Scanner scan= new Scanner (System.in);
    	
    	System.out.println("Digite un número: ");
    	num=scan.nextInt();
    	
    	while (num > 0) {
    		resultado += num % 10; 
    		num = num/10;
    		
    	}
    	System.out.println("Suma total: "+resultado);
	}
}



