package Ejos_Jedi.num1.Iniciado;
import java.util.*;

public class TrianguloAsteriscos {

	public static void main(String[] args) {
		
		String contador = "*";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese un valor");
		int cantidad = entrada.nextInt();
		
		while(cantidad !=0) {
			System.out.println(contador);
			contador = contador + "*";
			cantidad--;
		}

	}

}
