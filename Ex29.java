   
     
    
 
import java.util.Scanner;

public class Ex29{
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        
        float valorDoDeposito, valorDoPrimeiroSaque, ValorDoSegundoSaque;

        double saldo = 0; 
        System.out.println("Digite o valor do deposito: ");
        valorDoDeposito = leitor.nextFloat();
         
        System.out.println("Digite o valor do 1 º e 2º saque: ");
        valorDoPrimeiroSaque = leitor.nextFloat();
        ValorDoSegundoSaque =  leitor.nextFloat();

        saldo =  (valorDoDeposito - (valorDoPrimeiroSaque) - ((ValorDoSegundoSaque)))*((0.38*2));

        System.out.println("O seu saldo é de "+saldo);
        




        


        


    }

}
