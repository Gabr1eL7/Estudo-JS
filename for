//for
import java.util.Scanner;
class Main {  
  public static void main(String args[]) { 

/*for ( 1 ; 2 ; 3 );
*1-iniciação ex: int i=1 
*2-condição  ex: i<10
*3-atualização ex: i++
*/    
Scanner scan= new Scanner(System.in);

//normal
    
    for(int i=1; i<10; i++){
      System.out.println(i);
    }

//Mais que uma variavel

    for(int i = 1, j = 10 ; i<j; i++, j--){
      System.out.println("O valor de i é:" + i +" e o valor de j é: " +j);}

// partes ausentes
int i = 0;
    
    for(;i<10;){
  i++;
     System.out.println(i);
    }
    
  } 
}
