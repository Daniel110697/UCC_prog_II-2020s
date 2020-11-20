package Taller_m3_002_ciclos_mientras;



import java.util.Scanner;

public class ejercicio_6 {
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
		
		Scanner scan = new Scanner(System.in);
	       int a=0,i,n;
	       
	       System.out.println("Digite un número: ");
	       n=scan.nextInt();
	       
	       for(i=1;i<(n+1);i++){
	       if(n%i==0){
	           a++;
	          }
	       }
	       if(a!=2){
	            System.out.println("El número noo es Primo");
	          }else{
	              System.out.println("El número si es Primo");
	       }
	   }
	}


