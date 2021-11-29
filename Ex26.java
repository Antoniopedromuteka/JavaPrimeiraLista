 
     
    
 
import java.util.Scanner;

public class Ex26{
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        int num;

        System.out.println("Digite um numero: ");
        num = leitor.nextInt();
    

        if(num>0){

        System.out.println(" o número digitado ao quadrado é :"+(Math.pow(num, 2)));
        System.out.println(" o número digitado ao cubo é :"+(Math.pow(num, 3)));
        System.out.println(" a raiz quadrada do número digitado é :"+(Math.sqrt(num)));
        System.out.println(" a raiz cúbica do número digitado é :"+(Math.sqrt(Math.sqrt(num))));

       
    } else  System.out.println("Error");

   

         







    

    }

}
