package Ejos_Jedi.num1.Iniciado;
import java.util.*;

public class Multiplicacion {

	public static void main(String[] args) {
		
		double real1, real2, multreal, suma;
		
		int ent1, ent2, multent;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un número real: ");
		real1 = entrada.nextDouble();
		
		System.out.println("Ingrese otro número real: ");
		real2 = entrada.nextDouble();
		
		System.out.println("Ingrese un número entero: ");
		ent1 = entrada.nextInt();
		
		System.out.println("Ingrese otro número entero: ");
		ent2 = entrada.nextInt();
		
		multreal = real1*real2;
		multent = ent1*ent2;
		
		suma = multreal+multent;
		
		System.out.println("El resultado es "+suma+"; es real, porque primero se multiplicaron dos valores de tipo double.");

	}

}
