


	import java.util.Scanner; 
	
	
	public class Calculadora {
		
	public static void main(String[] args) {
		
		/*Scanner in = new Scanner (System.in);
		double num1, num2, soma, subtração, multi, divi;
		
		System.out.println("Insira um número:");
		num1 = in.nextDouble();
		
		System.out.println("Insira outro número:");
		num2 = in.nextDouble();
		
		
		soma = num1 + num2;
		System.out.println("O resultado da soma é: " +soma);
		
		subtração = num1 - num2;
		System.out.println("O resultado da subtração é: " +subtração);
		
		multi = num1 * num2;
		System.out.println("O resultado da multiplicação é: " +multi);
		
		divi = num1 / num2;
		System.out.println("O resultado da divisão é: " +divi);*/
		
// CALCULADO 2.0
		
			Scanner in = new Scanner (System.in);
			
			System.out.println("Digite 1 para somar");
			System.out.println("Digite 2 para subtrair");
			System.out.println("Digite 3 para multiplicar");
			System.out.println("Digite 4 para dividir");
			
			
			int i = in.nextInt();
		
			System.out.println("Digite o primeiro número:");
			double num1 = in.nextDouble();
			
			System.out.println("Digite o segundo número:");
	        double num2 = in.nextDouble();
	        
	        if( i == 1) {
	        	System.out.println(num1 + num2);
	        }else {
	        	if(i==2) {
	        		System.out.println(num1-num2);
	        	    }else {
	        			if(i==3) {
	        				System.out.println(num1*num2);
	        			}else {
	        				if(i==4) {
	        					System.out.println(num1/num2);
	        				}else {
	        					System.out.println("Operação invalida");
	        					
	        				}}}}}}
	        			
	        		
	        	
	        
	
	


