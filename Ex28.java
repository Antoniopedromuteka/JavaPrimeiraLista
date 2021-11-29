  
     
    
 
import java.util.Scanner;

public class Ex28{
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        int numHoraTrabalhadas, horaTrabalhada;  
        float salarioMinimo, salarioBruto, imposto, salarioReceber;

        System.out.println("Digite o numero de horas trabalhadas e o salario Minimo: ");
        numHoraTrabalhadas = leitor.nextInt();
        salarioMinimo = leitor.nextFloat();

        horaTrabalhada = (int) salarioMinimo / 2;
        salarioBruto = numHoraTrabalhadas * horaTrabalhada;
        imposto = (salarioBruto * 3)/100;
        salarioReceber = salarioBruto - imposto;
    
        System.out.println("Hora trabalhada é = "+horaTrabalhada);
        System.out.println("O salario bruto é = "+salarioBruto);
        System.out.println("O imposto é = "+imposto);
        System.out.println("O salario a Receber é = "+salarioReceber);



    }

}
