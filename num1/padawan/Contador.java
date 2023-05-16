package Ejos_Jedi.num1.padawan;
import java.util.*;

public class Contador {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese un número: ");
		int numero = entrada.nextInt();
		
		int i = 0;
		
		while(i<20) {
			numero++;
			i++;
		}
		
		System.out.println("el número aumentado 20 veces es: "+numero);
		
		while(i>0) {
			numero--;
			i--;
		}
		
		System.out.println("el número, ahora descontado 20 veces, es: "+numero);

	}

}
