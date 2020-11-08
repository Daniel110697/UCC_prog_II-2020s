 package Taller_m3_001_seleccion_multiple;

 import java.util.Scanner;
 
 public class ejercicio_2 {
 	public static void main(String[] args) {
 		

		System.out.println();
		System.out.println("+********************************+");
		System.out.println("+    Autor: Daniel Artunduaga    +");
		System.out.println("+    Fecha: 8/11/2020            +");
		System.out.println("+    Herramientas Computacional  +");
		System.out.println("+********************************+");
		System.out.println();
 		
 		String ubi,tam  ="";
		int ubic,tama,costo = 0;
		Scanner scan = new Scanner (System.in);
 		
		System.out.println("Digite la ubicacion: norte=1, sur=2, oriente=3, occiodente=4");
 		ubi = scan.next();
 		ubic = Integer.parseInt(ubi);
 		scan.reset();
	
		 	
		System.out.println("Digite el tamaño: pequeño=1, mediano=2, grande=3");
 		tam = scan.next();
 		tama = Integer.parseInt(tam);
 		scan.reset();
 		
 		switch (tama) {
 		        case 1:
 		        	   switch (ubic) {
 		        	   case 01: costo = 500;
		        	   case 02: costo = 400;
		        	   case 04: costo = 400;
 		        	break;
 		        	   }
 		        	   break;
 		        case 2:
 		        	   switch (ubic) {
 		        	   case 01: costo = 250;
		        	   case 02: costo = 200;
 		        	break;
 		        	   }
 		        	   break;
 		       case 3:
		        	   switch (ubic) {
		        	   case 01: costo = 100;
		        	   case 04: costo = 200;
		        	break;
		        	   }
		        	   break;	   
		       
		       default:
		    	       costo = 0;
		    	       System.out.println("La entrada no existe");
		    	       
		    	       switch (ubic) {
		    	       case 03: costo = 100;
		    	       break;
		    	       default:
		    	    	       costo = 0;
		    	    	       System.out.println("La entrada no existe");
		    	    	       
		    	       }
 		
 		}
 		  System.out.println("El beneficio es de:" + costo + "por minuto");
	

		
	}
	

}   
