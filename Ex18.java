   
 
import java.util.Scanner;

public class Ex18 {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        float preco,novoPreco;

        System.out.println("Digite o preço:  ");
        preco = leitor.nextFloat();

        novoPreco = preco - ((preco*10)/100);


        System.out.println(" O Novo preço  é  : "+novoPreco);
         







    

    }

}
 