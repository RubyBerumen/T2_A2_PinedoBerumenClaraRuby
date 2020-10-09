import java.util.Scanner;

class CadenaInversa{
	
	public void invertirCadena(String cadena,int i,String res) {
		
		if(i<cadena.length()) {
			res = cadena.charAt(i)+res;
			i+=1;
			invertirCadena(cadena,i,res);
		}else {
			System.out.println("Cadena inversa: "+res);
		}
		
	}
	
}//class CadenaInversa


public class Ej07_CadenaInversa {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		CadenaInversa c = new CadenaInversa();
		
		System.out.println("Ingresa una cadena de caracteres para mostrarla invertida: ");
		String cadena = ent.nextLine();
		c.invertirCadena(cadena, 0, "");
				
		

	}//main

}
