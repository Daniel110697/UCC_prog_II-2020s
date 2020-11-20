package Taller_m3_002_ciclos_mientras;

import java.util.Scanner;

public class ejercicio_3 {
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
		
		int numero;
    	int fltnt;
    	int numInv;
    	int rstnt;
    	
    		Scanner scan=new Scanner(System.in);
    		
    		System.out.println("Digite un número: ");
            numero=scan.nextInt();
    		
    		fltnt=numero;
    		numInv=0;
    		rstnt=0;
    		
    		while(fltnt!=0) {
           
    	    rstnt=fltnt%10;
            numInv=numInv*10+rstnt;
            fltnt=fltnt/10;
    		
    		}
    		
    	    if(numInv==numero){
    			
            System.out.println("El número es capicua");
            
    		}
    	    
    	    else {
           
            System.out.println("El número no es capicua");
    		
    	    }
    	    
	}
}


