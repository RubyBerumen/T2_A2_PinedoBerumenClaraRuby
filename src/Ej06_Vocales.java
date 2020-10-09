import java.util.Scanner;

class Vocales{
	
	public void contarVocales(String cadena, int i, int numeroV) {
		if(i<cadena.length()) {
			char c = cadena.charAt(i);
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				numeroV+=1;
			}
			i+=1;
			contarVocales(cadena,i,numeroV);
		}else {
			System.out.println("Número de vocales: "+numeroV);
		}
	}
	
}// class Vocales

public class Ej06_Vocales {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		
		Vocales v = new Vocales();

		System.out.println("Ingresa una cadena de caracteres para contar la vocales:");
		String cadena = ent.nextLine();
		v.contarVocales(cadena, 0, 0);
				

	}

}
