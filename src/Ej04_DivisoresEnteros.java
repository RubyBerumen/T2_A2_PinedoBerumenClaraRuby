import java.util.Scanner;

class DivisoresEnt{
	
	public void divisoresEnteros(int numero1, int numero2, int x, int divisores) {
		int min = Math.min(numero1, numero2);
		int max = Math.max(numero1, numero2);
		if(x<min) {
			x+=1;
			divisoresEnteros(numero1, numero2, x, divisores);
		}else if(min<=x&&x<=max) {
			if(max%x==0) {
				System.out.println(x);
				divisores+=1;
			}
			x+=1;
			divisoresEnteros(numero1, numero2, x, divisores);
		}else {
			System.out.println("Cantidad de divisores: "+divisores);
		}
	
	}
	
}//class DivisoresEnt


public class Ej04_DivisoresEnteros {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		DivisoresEnt d = new DivisoresEnt();
		
	
		System.out.println("Ingresa el número 1: ");
		int numero1 = ent.nextInt();
		System.out.println("Ingresa el número 2: ");
		int numero2 = ent.nextInt();
		d.divisoresEnteros(numero1, numero2, 0, 0);
				
		
		

	}//main

}
