    
    
 
import java.util.Scanner;

public class Ex20 {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        float custo,valorDoConvite;
        int quantidadeDeConvites;

        System.out.println("Digite o custo e o valor do convite:  ");
        custo = leitor.nextFloat();
        valorDoConvite = leitor.nextFloat();

         quantidadeDeConvites = (int) (custo/valorDoConvite);


        
        System.out.println(" A quantidade de convites necessárias para que o custo seja alcançado é de : "+quantidadeDeConvites);

         







    

    }

}
