import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.invoke.VarHandle;

public class programas {

	public static void main(String[] args) {
		
		   int opcionPrograma;
	 	   char otroValor;
		   String comando = "", ruta="D:\\final\\";
		  
		   Scanner leer = new Scanner(System.in); 
		
	do{	   
		System.out.print("Ingrese el numero del programa que desea ejecutar: ");
		   System.out.println("Digite 1 para el programa Ejercicio_1");
		   System.out.println("Digite 2 para el programa Ejercicio_2");
		   System.out.println("Digite 3 para el programa Ejercicio_3");
		   System.out.println("Digite 4 para el programa Ejerecicio_4");
		   System.out.println("Digite 5 para el programa Ejercicio_5");
		   System.out.println("Digite 6 para el programa Ejercicio_1");
		   System.out.println("Digite 7 para el programa Ejercicio_2");
		   System.out.println("Digite 8 para el programa Ejercicio_3");
		   System.out.println("Digite 9 para el programa Ejerecicio_4");
		   System.out.println("Digite 10 para el programa Ejercicio_5");
		   System.out.println("Digite 11 para el programa Ejercicio_1");
		   System.out.println("Digite 12 para el programa Ejercicio_2");
		   System.out.println("Digite 13 para el programa Ejercicio_3");
		   System.out.println("Digite 14 para el programa Ejerecicio_4");
		   System.out.println("Digite 15 para el programa Ejercicio_5");
		   System.out.println("Digite 16 para el programa Ejemplo");
		   
		   
		   
		   opcionPrograma=leer.nextInt();
		    
		   switch (opcionPrograma) {
		   case 1:
			   comando = "ejercicio_1";
			   break;
		   case 2:
			   comando = "ejercicio_2";
			   break;
		   case 3:
			   comando = "ejercicio_3";
			   break;
		   case 4:
			   comando = "ejercicio_4";
			   break;
		   case 5:
			   comando = "ejercicio_5";
			   break;
			case 6:
			   comando = "ejercicio_6";
			   break;
		   case 7:
			   comando = "ejercicio_7";
			   break;
		   case 8:
			   comando = "ejercicio_8";
			   break;
		   case 9:
			   comando = "ejercicio_9";
			   break;
		   case 10:
			   comando = "ejercicio_10";
			   break;   
			case 11:
			   comando = "ejercicio_11";
			   break;
		   case 12:
			   comando = "ejercicio_12";
			   break;
		   case 13:
			   comando = "ejercicio_13";
			   break;
		   case 14:
			   comando = "ejercicio_14";
			   break;
		   case 15:
			   comando = "ejercicio_15";
			   break;   

			case 16:
			   comando = "ejemplo";
			   break;    
		   }
		   
		   try
		    
		   { 
			  
			   var processBuilder = new ProcessBuilder();
			   processBuilder.command("java","D:\\final\\" +comando+ ".java");
			   var process = processBuilder.inheritIO().start();
			   var ret = process.waitFor();
			   				   
		   }
		   
		   catch (Exception e)
		   {
			   System.out.println(e);
		   }
		   	   System.out.println("QUIERE EJECUTAR EL SIGUIENTE PROGRAMA? 1 para SI 2 para NO ");
		   	   otroValor = leer.next().charAt(0);
	   		} while(otroValor=='1');
}
}



	
