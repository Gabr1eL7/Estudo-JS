
import java.util.Scanner;
public class Operadores_lógicos {

	public static void main(String[] args) {
		 
		final int iJ, iI;
		iJ = 17;
		iI = 60;
		
		//mais 17 e menos 60;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite uma idade: ");
		int idade = in.nextInt();
		
		if (idade <= iJ) { System.out.println("A idade da pessoa informada é de um jovem");} 
		else{
			    if(idade >= iI) { System.out.println("A idade da pessoa informada é de um idoso");}
		    else {
		    	if( (idade > iJ) && ( idade< iI))
		    		    	 {
		    	}System.out.println("É uma pessoa de meia idade");
		    	}
		    }
		
	  		}
	}
	


