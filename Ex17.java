   
 
import java.util.Scanner;

public class Ex17 {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        float salario,SalComAumento;

        System.out.println("Digite o seu salario:  ");
        salario = leitor.nextFloat();

        SalComAumento = salario +((salario*25)/100);


        System.out.println(" O Novo salario  é  : "+SalComAumento);
         







    

    }

}
