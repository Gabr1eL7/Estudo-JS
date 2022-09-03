
import java.util.Scanner;
public class Variaveis_e_constantes {

	public static void main(String[] args) {
		
		
		      //int var       = 10; //declara uma variavel
		//final int constante = 10; //declara uma constante
 
	
	final double vsom = 340.28; // m/s
	System.out.println("Digite o espaço de tempo: ");
	Scanner in = new Scanner(System.in);
	
	int tempo = in.nextInt();
	System.out.println("A distancia seria de: " + tempo * vsom + " metros percorridos");
	}
	

}
