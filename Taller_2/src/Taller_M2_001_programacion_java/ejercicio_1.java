package Taller_M2_001_programacion_java;

import java.util.Scanner;

public class ejercicio_1 {
	public static void main (String[] args){
	
	String a = "";
	int an  =0;
	Scanner scan = new Scanner (System.in);
	
	System.out.println("digite un número:");
	a = scan.next();
	an = Integer.parseInt(a);
	

	
	System.out.println("El cubo del numero digitado es:" + an*an*an);
	
	System.out.println("+********************************+");
	System.out.println("+    Autor: Daniel Artunduaga    +");
	System.out.println("+    Fecha: 2/11/2020            +");
	System.out.println("+    Herramientas Computacional  +");
	System.out.println("+********************************+");
	
 }
	
 }
