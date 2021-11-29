     
    
 
import java.util.Scanner;

public class Ex25{
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        float valorDeposito,valorTaxa,valorRendimento, valorTotal;


        System.out.println("Digite o valor do Deposito e valor da Taxa: ");
        valorDeposito = leitor.nextFloat();
        valorTaxa = leitor.nextFloat();

         
        
        valorRendimento = ((valorDeposito*valorTaxa)/100);
        valorTotal =  valorDeposito + valorRendimento;



        System.out.println(" O valor do rendimento é  : "+valorRendimento);
        System.out.println(" O valor total é  : "+valorTotal);

   

         







    

    }

}
