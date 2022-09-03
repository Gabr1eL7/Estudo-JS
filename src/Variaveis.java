

	import java.util.Scanner;
	
	public class Variaveis {
		

	public static void main(String[] args) {

		/*System.out.pritnln("Digite um número:");
		Scanner in = new Scanner (Systen.in);
		System.out.println (in.nextLine());*/
		
		System.out.println("Dihite a idade do seu cachorro:");
        Scanner in = new Scanner(System.in);
        
        int idadeCachorro = in.nextInt();
        idadeCachorro = idadeCachorro * 7;
        
        System.out.println("O seu cachorro tem " +idadeCachorro+ " anos");
	}

}
