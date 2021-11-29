
import java.util.Scanner;

public class Ex13 {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        int anoNascimento, anoActual, idade;

        System.out.println("Digite  o ano actual e o ano de Nascimento : ");
        anoActual = leitor.nextInt();
        anoNascimento = leitor.nextInt();
        idade = anoActual - anoNascimento;
      
        System.out.println("A sua idade é = "+idade);
        System.out.println("Em 2050 teras = "+(2050-anoNascimento));


    

    }

}
