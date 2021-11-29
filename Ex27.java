      
    
 
import java.util.Scanner;

public class Ex27{
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        int percentualDeLucros, percentualDeImpostos; 
        float precoDeFabrica, precoFinal;



        System.out.println("Digite o preco de Fabrica, percentual de lucros e percentual de Impostos:  ");
        precoDeFabrica= leitor.nextFloat();
        percentualDeLucros = leitor.nextInt();
        percentualDeImpostos = leitor.nextInt();
         

        precoFinal = precoDeFabrica + ((precoDeFabrica * percentualDeLucros)/100) - ((precoDeFabrica * percentualDeImpostos)/100);


        System.out.println("o valor correspondente ao lucro do distribuidor "+(((precoDeFabrica * percentualDeLucros)/100)));
        System.out.println("o valor correspondente ao imposto do distribuidor "+(((precoDeFabrica * percentualDeImpostos)/100)));
        System.out.println("o preço final é de "+(precoFinal));
    } 

}
