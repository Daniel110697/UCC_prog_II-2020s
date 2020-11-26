package Taller_M2_001_programacion_java;

import java.util.Scanner;

public class ejercicio_13 {
	public static void main(String[] args) {
		
		
		  
		  Scanner leer = new Scanner(System.in);
			
			double digite, porcentaje, Calvin, Hobbes,Hobbestotal;
			
			System.out.println("Digite la cantidad de aceite de oliva");
			digite = leer.nextInt();
			
			porcentaje = 0.66666667;
			
			Hobbes = digite;
		    Hobbestotal = Hobbes * porcentaje;
			Calvin = Hobbes - Hobbestotal;
			
			System.out.println("Total de aceite: " + digite);
			System.out.println("Total producción Calvin: " + Calvin);
			System.out.println("Total producción Hobbes:" + Hobbestotal);
			
			System.out.println("+********************************+");
			System.out.println("+    Autor: Daniel Artunduaga    +");
			System.out.println("+    Fecha: 2/11/2020            +");
			System.out.println("+    Herramientas Computacional  +");
			System.out.println("+********************************+");

	}

}
