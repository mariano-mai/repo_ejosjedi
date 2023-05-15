package Ejos_Jedi.num1.Iniciado;
import java.util.*;

public class Acumulador {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el primer valor: ");
		int num1 = entrada.nextInt();
		
		System.out.println("Ingrese el segundo valor: ");
		int num2 = entrada.nextInt();
		
		double mult = num1*num2;
		
		double valor = 0;
		
		int i=0;
		
		while(i<15) {
			valor = valor + mult/(i+1);
			//System.out.println(valor);
			i++;
		}
		
		System.out.printf("%1.2f", valor);
	}

}
