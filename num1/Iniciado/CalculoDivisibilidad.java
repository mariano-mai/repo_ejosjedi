package Ejos_Jedi.num1.Iniciado;

public class CalculoDivisibilidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, suma;
		
		num1 = 56;
		num2 = 8;
		
		suma = num1+num2;
		
		String divi = (num1%num2==0)?"es divisible":"no es divisible";
		
		System.out.println("el resultado de la suma es "+suma+"\ny además, el primer valor "+divi+" por el segundo.");
		
		

	}

}
