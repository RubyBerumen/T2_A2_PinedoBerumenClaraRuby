import java.util.Scanner;

class Factorial{
	
	public void Factorial1(int x, int factorial, int numero) {
		if(x<numero) {
			factorial*=x;
			Factorial1((x+1),factorial,numero);
		}else if(x==numero) {
			factorial*=x;
			System.out.println(factorial);
		}
	}
	
}// class Factorial1

public class Ej02_Factorial {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		Factorial f = new Factorial();
			
		System.out.println("Ingresa un número para obtener su factorial: ");
		int numero = ent.nextInt();
		System.out.print("\nEl factorial de "+ numero + " es: ");
		f.Factorial1(1,1,numero);
			
		
		


	}//main

}
