    
    
 
import java.util.Scanner;

public class Ex21 {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        float salarioBase,salReceber;


        System.out.println("Digite o seu salario base:  ");
        salarioBase = leitor.nextFloat();
         

        salReceber = salarioBase + ((salarioBase*5)/100) - ((salarioBase*7)/100);


        System.out.println(" O Novo salario a receber   é  : "+salReceber);
   

         







    

    }

}
