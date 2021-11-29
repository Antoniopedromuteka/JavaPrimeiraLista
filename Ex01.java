

import java.util.Scanner;


public class Ex01{

    public static void main(String[] args){

        Scanner leitor=new Scanner(System.in);

        int n1,n2,n3,n4;

        System.out.println("Digite 4 números: ");

        n1 = leitor.nextInt();
        n2 = leitor.nextInt();
        n3 = leitor.nextInt();
        n4 = leitor.nextInt();

        System.out.println("A soma dos 4 números é ="+(n1+n2+n3+n4));
    }


}
