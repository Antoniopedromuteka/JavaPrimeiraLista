
import java.util.Scanner;

public class Ex09 {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        float peso_gramas, peso_kilos;

        System.out.println("digite peso em kilos");
        peso_kilos = leitor.nextFloat();

        peso_gramas = (peso_kilos*1000);

        System.out.println("O peso em gramas é de :"+peso_gramas);

    }
}
