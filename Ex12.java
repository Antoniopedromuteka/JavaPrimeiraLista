import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        float area,base,altura;
        
        System.out.println("Digite o valor da base:");
         base = leitor.nextFloat();
        
        System.out.println("Digite o valor da altura:");
        altura = leitor.nextFloat();





        
        area = (base*altura)/2;
        
        System.out.println("A area do Triangulo  é : "+area);
    }
}
