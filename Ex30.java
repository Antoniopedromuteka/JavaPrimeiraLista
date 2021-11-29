   
     
    
 
import java.util.Scanner;

public class Ex30{
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        
        float peso,quantidade, resto;

        
        System.out.println("Digite o peso e a quantidade: ");
        peso = leitor.nextFloat();
        quantidade = leitor.nextFloat();

        resto = (peso*1000) - ((quantidade*2)*5);

 

        System.out.println("Em cinco dias restarão "+resto+" de ração");
        




        


        


    }

}
 