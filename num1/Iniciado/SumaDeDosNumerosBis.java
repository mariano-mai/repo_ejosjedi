package Ejos_Jedi.num1.Iniciado;

public class SumaDeDosNumerosBis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, resultado;
		
		num1=233;
		num2=43;
		
		resultado = num1+num2;
		
		String paridad = (resultado%2==0)?"es par":"es impar";
		
		System.out.println("El resultado es "+resultado+" y es "+paridad);

	}

}
