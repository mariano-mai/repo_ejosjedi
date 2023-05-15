package Ejos_Jedi.num1.Iniciado;
import java.util.*;

public class NombreBebida {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cuál es el nombre de tu última mascota?");
		String mascota = entrada.nextLine();
		
		System.out.println("¿Cuál fue la última película que viste?");
		String pelicula = entrada.nextLine();
		
		System.out.println("Nombre de la próxima bebida: "+mascota+" "+pelicula);

	}

}
