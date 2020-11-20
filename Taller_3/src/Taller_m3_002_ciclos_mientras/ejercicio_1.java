package Taller_m3_002_ciclos_mientras;

import java.util.Scanner;

public class ejercicio_1 {
	public static void main (String[] args){
		
		System.out.println();
		System.out.println("+********************************+");
		System.out.println("+    Autor: Daniel Artunduaga    +");
		System.out.println("+********************************+");
		System.out.println("+    Fecha: 15/11/2020            +");
		System.out.println("+********************************+");
		System.out.println("+    Herramientas Computacional  +");
		System.out.println("+********************************+");
		System.out.println();
	
	
String num;
int invnum, inv;
int numin=0;
Scanner scan = new Scanner (System.in);

System.out.println("Digite un número: ");
num=scan.next();
invnum= Integer.parseInt(num);
scan.reset();

while (invnum > 0) {
	inv= invnum % 10; 
	numin= numin*10+inv;
	invnum /=10;
	
}
System.out.println("Inversa del número digitado: "+numin);	
}
}
