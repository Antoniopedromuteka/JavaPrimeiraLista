
import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        float area;
        System.out.println("Digite o valor do lado: ");
        float lado = leitor.nextFloat();
        
        area = (float) (Math.pow(lado, 2));
        
        System.out.println("A area do quadrado é : "+area);
    }
}
