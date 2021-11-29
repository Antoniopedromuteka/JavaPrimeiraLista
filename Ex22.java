     
    
 
import java.util.Scanner;

public class Ex22 {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        float salarioFixo,valorComissaoDasVendas, salarioFinal;
        

        System.out.println("Digite o salario e valor da comissão das vendas:  ");
        salarioFixo = leitor.nextFloat();
        valorComissaoDasVendas = leitor.nextInt();

        salarioFinal = salarioFixo +((valorComissaoDasVendas*4)/100);


        System.out.println(" O  salario final  é  : "+salarioFinal);
         

         







    

    }

}
