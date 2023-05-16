package Ejos_Jedi.num1.padawan;
import java.util.*;

public class PromedioEdad {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese la cantidad de personas: ");
		int cantidad = entrada.nextInt();
		
		String [] personas = new String[cantidad];
		
		int [] edades = new int[cantidad];
		
		for(int i=0; i<personas.length; i++) {
			System.out.println("ingrese un nombre: ");
			personas[i] = entrada.next();
			
			System.out.println("ingrese la edad de "+personas[i]+": ");
			edades[i] = entrada.nextInt();
		}
		
		/*for(int i=0; i<edades.length; i++) {
			System.out.println("ingrese la edad de "+personas[i]+": ");
			edades[i] = entrada.nextInt();
		}*/
		
		for(int i=0; i<personas.length; i++) {
			System.out.println(personas[i]+" tiene "+edades[i]+" años.");
		}
		
		int suma = 0;
		
		for(int edad: edades) {
			suma = suma + edad;
		}
		
		System.out.println("El promedio de edades es de "+(suma/cantidad)+" años.");

	}

}
