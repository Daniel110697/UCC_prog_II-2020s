package Taller_m3_001_seleccion_multiple;

import java.util.Scanner;

public class ejercicio_1 {
	public static void main(String[] args) {
	try(Scanner leer = new Scanner(System.in)) {

		System.out.println();
		System.out.println("+********************************+");
		System.out.println("+    Autor: Daniel Artunduaga    +");
		System.out.println("+    Fecha: 8/11/2020            +");
		System.out.println("+    Herramientas Computacional  +");
		System.out.println("+********************************+");
		System.out.println();
			
	String nombre,plan="";
	int semestre;
	double carnt =0 ;
	char opc;
	
	Scanner scan = new Scanner(System.in);
			
	
		System.out.println("Ingrese el nombre:");
		nombre = scan.next();
		scan.reset();
		System.out.println("Ingrese el plan: (Economia, Administracion, Ciencias");
		plan = scan.next();
		scan.reset();
		System.out.println("Ingrese el semestre (1 - 10):");
		semestre = scan.nextInt();
		
		switch (plan) {
		  case "Econoia":
		    if (semestre <= 3) {
		    carnt = 1500;
		    }
		    else if (semestre <= 7) {
		    carnt = 2220;  
		      }
		    else {
		    carnt = 3000;
	    }
		  break;
		  
		  case "Administracion":
		    if (semestre <= 3) {
			carnt = 2000;
			}
		    else if (semestre <= 7) {
			carnt = 4000;
			}
		    else {
			carnt = 6000;
			} 
		 break;
		 
		  case "Ciencias":
		    if (semestre <= 3) {
			carnt = 1800;
		 		}
		    else if (semestre <= 7) {
			carnt = 5000;
				}
	        else {
			carnt = 7000;
				} 
		 break; 
		      default:
		      break;
		      
		}
		
		System.out.println("El valor a pagar es: $" + carnt);
		
			
				
	  }
	}
}



		
	
			
			
		
		


