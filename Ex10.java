import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        float area,base_maior,base_menor,altura;
        
        System.out.println("Digite o valor da base maior e da base menor:");
         base_maior = leitor.nextFloat();
         base_menor = leitor.nextFloat();
        System.out.println("Digite o valor da altura:");
        altura = leitor.nextFloat();





        
        area = ((base_maior+base_menor)*altura)/2;
        
        System.out.println("A area do Trapezio é : "+area);
    }
}
