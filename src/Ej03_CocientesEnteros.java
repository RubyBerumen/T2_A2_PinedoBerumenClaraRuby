import java.util.Scanner;

class Cocientes{
	
	public void cocientes(String dividendo, int divisor, int x, int residuo) {
		String cadDivisor=Integer.toString(divisor);
		if(cadDivisor.length()<=dividendo.length()) {
			if(x<=(dividendo.length()-cadDivisor.length())) {
				int dividendo1=Integer.parseInt(dividendo.substring(x,(x+cadDivisor.length())));
				dividendo1 = (int) (dividendo1 + (residuo*10));
				System.out.println("Cociente "+(x+1)+": "+(dividendo1/divisor));
				residuo=dividendo1%divisor;
				String subC=dividendo.substring(0,x);
				for (int i = x; i < x+cadDivisor.length(); i++) {
					subC+='0';
				}
				subC+=dividendo.substring(x+cadDivisor.length());
				dividendo=subC;
				x+=1;
				cocientes(dividendo,divisor,x,residuo);
			}else {
				System.out.println("Residuo: "+residuo);
			}
		}else {
			System.out.println("No tiene cocientes enteros");
		}
	}
}


public class Ej03_CocientesEnteros {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		Cocientes c = new Cocientes();
		
		System.out.println("Ingresa el dividendo:");
		String dividendo = ent.nextLine();
		System.out.println("Ingresa el divisor:");
		int divisor = ent.nextInt();
		c.cocientes(dividendo, divisor, 0, 0);

		

	}//main

}
