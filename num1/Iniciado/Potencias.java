package Ejos_Jedi.num1.Iniciado;
import java.util.*;

public class Potencias {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un valor: ");
		int numero = entrada.nextInt();
		
		double pot1 = Math.pow(numero, 2);
		double pot2 = Math.pow(numero, 3);
		
		System.out.println("El número "+numero+" elevado al cuadrado es "+pot1);
		System.out.println("El número "+numero+" elevado al cubo es "+pot2);

	}

}
