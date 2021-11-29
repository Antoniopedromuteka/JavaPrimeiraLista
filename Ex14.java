 
 
import java.util.Scanner;

public class Ex14 {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        int anoNascimento, anoActual, idade,idadeEmDias,idadeEmMeses,idadeEmSemanas;

        System.out.println("Digite  o ano actual e o ano de Nascimento : ");
        anoActual = leitor.nextInt();
        anoNascimento = leitor.nextInt();
        idade = anoActual - anoNascimento;
        idadeEmDias = idade * 365;
        idadeEmMeses = idade * 12;
        idadeEmSemanas = idade * 46;

        System.out.println("A sua idade em anos é = "+idade);
        System.out.println("A sua idade em dias é = "+idadeEmDias);
        System.out.println("A sua idade em Meses é = "+idadeEmMeses);
        System.out.println("A sua idade em Semanas é = "+idadeEmSemanas);

        




    

    }

}
