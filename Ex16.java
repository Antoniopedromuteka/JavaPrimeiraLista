  
 
import java.util.Scanner;

public class Ex16 {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        float pes;

        System.out.println("Digite o valor de pe: ");
        pes = leitor.nextFloat();


        System.out.println(" O valor em polegadas é : "+(pes*12));
        System.out.println(" O valor em jardas é : "+(pes/3));
        System.out.println(" O valor em milhas é : "+((pes/3)/1.760));








    

    }

}
