import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        float salario_minimo,salario;
        int quantidade;
        
        System.out.println("Digite o valor do sálario minimo e do salario do funcionario: ");
        salario_minimo = leitor.nextFloat();
        salario = leitor.nextFloat();

        quantidade = (int) (salario/salario_minimo);

        System.out.println("A quantidade de salarios minimos que o funcionario recebe é de : "+quantidade);
        
         
    }
}
