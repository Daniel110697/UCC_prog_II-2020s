package Taller_m3_001_seleccion_multiple;

import java.util.Scanner;

public class ejercicio_3 {
	public static void main(String[] args) {
		
	
		 double valorfactura=0,precio=0,iva=0;
		int cantidad;
		String tipo;
		char opc;

		 Scanner leer = new Scanner(System.in);

		
		System.out.print("Ingrese el tipo de producto (a,b,c): ");
		tipo = leer.next();
		System.out.print("Ingrese el numero de unidades: ");
		cantidad= leer.nextInt();

		 switch(tipo){
		case "a":
		if (cantidad<501) {
		precio=500;
		iva=(precio*cantidad)*0.07;
		}
		else{
		precio=1000;
		iva=(precio*cantidad)*0.09;
		}
		break;
		case "b":
		if (cantidad<501) {
		precio=800;
		iva=(precio*cantidad)*0.08;
		}
		else{
		precio=1400;
		iva=(precio*cantidad)*0.11;
		}
		break;
		case "c":
		if (cantidad<501) {
		precio=1000;
		iva=(precio*cantidad)*0.05;
		}
		else{
		precio=1600;
		iva=(precio*cantidad)*0.1;
		}
		break;
		default:
		break;
		}
		valorfactura=cantidad*precio+iva;

		 System.out.println("El valor a pagar es: $"+valorfactura);
		 opc = leer.next().charAt(0);

		 }
		}
		