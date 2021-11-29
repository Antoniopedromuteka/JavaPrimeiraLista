     
    
 
import java.util.Scanner;

public class Ex24 {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        float salarioBase,salReceber;


        System.out.println("Digite o seu salario base:  ");
        salarioBase = leitor.nextFloat();
         

        salReceber = salarioBase + (50) - ((salarioBase*10)/100);


        System.out.println(" O Novo salario a receber   é  : "+salReceber);
   

         







    

    }

}
