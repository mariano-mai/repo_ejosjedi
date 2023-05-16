package Ejos_Jedi.num1.padawan;
import java.util.*;

public class ConversionAKilogramos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final double kilos = 0.453592;
		
		System.out.println("Ingrese su peso en libras: ");
		double peso = entrada.nextDouble();
		
		double calculo = peso*kilos;
		
		System.out.println("Su peso es "+calculo+" kilogramos.");

	}

}
