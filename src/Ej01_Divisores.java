import java.util.Scanner;

class Divisores{
	public void divisoresNumero (int x, int num) {
		if(x<=num) {
			if(num%x==0) {
				System.out.println(x+"	");
			}
			divisoresNumero((x+1),num);
		}
	}
}//class Divisores


public class Ej01_Divisores {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner (System.in);
		
		Divisores d1 = new Divisores();
		
		System.out.println("Ingresa un número para obtener sus divisores: ");
		int num = ent.nextInt();
		System.out.println("\nDivisores de "+ num);
		d1.divisoresNumero(1,num);
		

		

				
				
		
		
		
		
	}// main

}
