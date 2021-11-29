
import java.util.Scanner;


public class Ex06 {
    public static void main(String[] args){
        
        Scanner leitor=new Scanner(System.in);

        float nota1,nota2,nota3,mediaPonderada;
        float peso1,peso2,peso3;

        System.out.println("Digite tres notas: ");
        nota1 = leitor.nextFloat();
        nota2 = leitor.nextFloat();
        nota3 = leitor.nextFloat();
        System.out.println("Digite tres pesos: ");
        peso1 = leitor.nextFloat();
        peso2 = leitor.nextFloat();
        peso3 = leitor.nextFloat();
        

        mediaPonderada = ((nota1*peso1)+(nota2*peso2)+(nota3*peso3)/3);

        System.out.println("A média ponderada é de :"+mediaPonderada);



    }    
}
