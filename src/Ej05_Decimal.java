import java.util.Scanner;

class Decimal{
	
	public void decimalABinario (int numero, String res) {
		if(numero>1) {
			if(numero%2==1) {
				res="1"+res;
			}else {
				res="0"+res;
			}
			numero/=2;
			decimalABinario(numero,res);
		}else {
			System.out.println("1"+res);
		}
		
		
	}
	
}

public class Ej05_Decimal {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		Decimal d = new Decimal();
		
		System.out.println("Ingresa un numero en decimal para convertirlo a binario:");
		int numero = ent.nextInt();
		d.decimalABinario(numero, "");
				
		
		

	}

}
