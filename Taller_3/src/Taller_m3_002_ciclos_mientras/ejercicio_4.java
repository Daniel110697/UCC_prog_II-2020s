package Taller_m3_002_ciclos_mientras;

import java.util.Scanner;

public class ejercicio_4 {
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
	

	int numero,digito,invertido=0,resto,existe=0;

    Scanner scan = new Scanner(System.in);

    System.out.print("Digite un número: ");
    numero= scan.nextInt();
    System.out.print("Ingrese un digito: ");
    digito= scan.nextInt();

    do{
      resto= numero%10;
      invertido=invertido*10+resto;
      numero/=10;
      
      
      if (digito==resto)
        existe=1;

    } while(numero>0 && existe==0);
    if (existe==1)
    	
      System.out.print("El digito esta dentro del número");
    
    else
    	
      System.out.print("El digito no esta dentro del número");
  }
}


