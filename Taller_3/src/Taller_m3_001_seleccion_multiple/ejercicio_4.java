package Taller_m3_001_seleccion_multiple;

import java.util.Scanner;

public class ejercicio_4 {
	
    public static void main (String[] args){
    	System.out.println();
		System.out.println("+********************************+");
		System.out.println("+    Autor: Daniel Artunduaga    +");
		System.out.println("+    Fecha: 8/11/2020            +");
		System.out.println("+    Herramientas Computacional  +");
		System.out.println("+********************************+");
		System.out.println();

    double pasaje=0,utilidad=0,mantenimiento=0,salario=0;
    int ruta,servicio;
    char opc;
    
    Scanner leer = new Scanner(System.in);
    
    System.out.print("Ingrese el tipo de servicio: ");  
    System.out.print("(Servicio Corriente=1 o ");
      System.out.print("Servicio Ejecutivo=2) ");
      servicio= leer.nextInt();
      System.out.print("Ingrese la ruta (1,2,3,4): ");
      ruta = leer.nextInt();

        switch(ruta){
        case 1:
          if (servicio==1) {
            pasaje=200;
            salario=pasaje*0.3;
            mantenimiento=pasaje*0.1;
          }
          else{
            pasaje=300;
            salario=pasaje*0.3;
            mantenimiento=pasaje*0.1;
        }
        break;
        case 2:
          if (servicio==1) {
            pasaje=200;
            salario=pasaje*0.25;
            mantenimiento=pasaje*0.15;
          }
          else{
            pasaje=300;
            salario=pasaje*0.25;
            mantenimiento=pasaje*0.15;
        }
        break;
        case 3:
          if (servicio==1) {
            pasaje=200;
            salario=pasaje*0.20;
            mantenimiento=pasaje*0.20;
          }
          else{
            pasaje=300;
            salario=pasaje*0.20;
            mantenimiento=pasaje*0.20;
        }
        break;
        case 4:
          if (servicio==1) {
            pasaje=200;
            salario=pasaje*0.22;
            mantenimiento=pasaje*0.20;
          }
          else{
            pasaje=300;
            salario=pasaje*0.22;
            mantenimiento=pasaje*0.20;
        }
        break;
          default:
          break;
      }
      utilidad=pasaje-mantenimiento-salario;

      System.out.println("La utilidad final es: "+utilidad);
      opc = leer.next().charAt(0);

 

  
  }
}
		


