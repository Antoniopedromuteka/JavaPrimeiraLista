
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        int n1,n2,n3;

        System.out.println("Digite tres numeros :");

        n1 = leitor.nextInt();
        n2 = leitor.nextInt();
        n3 = leitor.nextInt();

        System.out.println("A multiplicação dos tres numeros é de :"+(n1*n2*n3));


    }
}
