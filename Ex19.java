    
    
 
import java.util.Scanner;

public class Ex19 {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        float salario,SalComAumento;
        int aumento;

        System.out.println("Digite o seu salario e percentual do aumento:  ");
        salario = leitor.nextFloat();
        aumento = leitor.nextInt();

        SalComAumento = salario +((salario*aumento)/100);


        System.out.println(" O Novo salario  é  : "+SalComAumento);
        System.out.println(" O Percentual do aumento  é  : "+aumento);

         







    

    }

}
