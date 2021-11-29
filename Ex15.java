  
 
import java.util.Scanner;

public class Ex15 {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        int num1, num2;
        double resultado;

        System.out.println("Digite dois valores: ");
        num1 = leitor.nextInt();
        num2 = leitor.nextInt();

        resultado = Math.pow((double) num1, (double) num2);
        
        System.out.println("O resultado é : "+resultado);




    

    }

}
