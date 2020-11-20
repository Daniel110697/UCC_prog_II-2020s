package Taller_m3_002_ciclos_mientras;

import java.util.Scanner;

public class ejercicio_5 {
	public static void main (String[] args){

		
		System.out.println();
		System.out.println("+********************************+");
		System.out.println("+    Autor: Daniel Artunduaga    +");
		System.out.println("+********************************+");
		System.out.println("+    Fecha: 15/11/2020           +");
		System.out.println("+********************************+");
		System.out.println("+    Herramientas Computacional  +");
		System.out.println("+********************************+");
		System.out.println();
		
		String n1;
		int n,m;
		
		
		 Scanner scan = new Scanner (System.in);
		 
		 
		 System.out.println("Digite un número:");
		 n1=scan.next();
		 n=Integer.parseInt(n1);
		 scan.reset();
		 
		 
		 
		m=0;
		
		while(n>0) {
			
			if ((n%10)>m) {m=n%10;}
			
			n=n/10;}
		
		System.out.println("Este es el digito mayor: " + m);
	}
		}
		 