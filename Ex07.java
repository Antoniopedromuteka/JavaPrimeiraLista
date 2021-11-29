
import java.util.Scanner;

public class Ex07 {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        float diag_maior,diag_menor, area;

        System.out.println("Digite o valor da diagonal maior e da diagonal menor: ");
        diag_maior = leitor.nextFloat();
        diag_menor = leitor.nextFloat();

        area = (diag_maior*diag_menor)/2;

        System.out.println("A area do losango é de :"+area);

    }
}
