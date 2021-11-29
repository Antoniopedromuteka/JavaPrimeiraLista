
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        int n1,n2;

        System.out.println("Digite dois valores: ");
        n1 = leitor.nextInt();
        n2 = leitor.nextInt();

        System.out.println("A subtração do primeiro pelo segundo é de :"+(n1-n2));


    }
}
