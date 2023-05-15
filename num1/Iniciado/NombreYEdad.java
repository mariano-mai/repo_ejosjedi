package Ejos_Jedi.num1.Iniciado;
import java.util.*;

public class NombreYEdad {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");
		String nombre = entrada.nextLine();
		
		System.out.println("Ingrese su apellido: ");
		String apellido = entrada.nextLine();
		
		System.out.println("Ingrese su edad: ");
		int edad = entrada.nextInt();
		
		System.out.println("Mi nombre es "+nombre+" "+apellido);
		System.out.println("Mi edad es: "+edad+" años");

	}

}
