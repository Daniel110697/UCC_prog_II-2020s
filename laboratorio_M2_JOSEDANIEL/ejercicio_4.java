package laboratorio_M2_JOSEDANIEL;

import java.util.Scanner;

public class ejercicio_4 {
	public static void main (String[] args){
		int l1,l2;
		boolean bl1=false,bl2=false,k;
		
		try (Scanner leer = new Scanner(System.in)) {
			System.out.print("�Inglaterra es un pais suramericano [0]...falso [1]...verdadero?");
			l1 = leer.nextInt();
			System.out.print("�Maria Currie invent� el radio [0]...falso [1]...verdadero?");
			l2 = leer.nextInt();
			
			if (l1!=0) bl1=false;
			if (l1!=1) bl1=true;
			if (l2!=1) bl2=true;
			if (l2!=0) bl2=false;
			k= bl1 && bl2; 
			
		}
		
		System.out.print("El valor de la variable k es: " +k);
		System.out.println("+********************************+");
		System.out.println("+    Autor: Daniel Artunduaga    +");
		System.out.println("+    Fecha: 25/10/2020           +");
		System.out.println("+    Herramientas Computacional  +");
		System.out.println("+********************************+");
}

}
