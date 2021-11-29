
import java.util.Scanner;

public class Ex05 {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        float nota1,nota2,nota3;

        System.out.println("Digite tres notas: ");
        nota1 = leitor.nextFloat();
        nota2 = leitor.nextFloat();
        nota3 = leitor.nextFloat();

        System.out.println("A media é igual a "+((nota1+nota2+nota3)/3));



    }
}
