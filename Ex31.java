
import java.util.Scanner;

public class Ex31 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        float salarioMinimo, valorSerPago, valorPagarComDesconto;

        int quantidade, valorDeCadaQuillowtts;

        System.out.println("Digite o Salario Minimo e a quantidade de quilowatts: ");
        salarioMinimo = leitor.nextFloat();
        quantidade = leitor.nextInt();

        valorDeCadaQuillowtts = (int) (salarioMinimo / 5);
        valorSerPago = valorDeCadaQuillowtts * quantidade;
        valorPagarComDesconto = (valorSerPago) - valorSerPago * (15 / 100);

        System.out.println("o valor de cada quilowatt é : " + valorDeCadaQuillowtts);
        System.out.println(" o valor a ser pago por essa residência é : " + valorSerPago);
        System.out.println(" o valor a ser pago com desconto de 15% é : " + valorPagarComDesconto);

    }

}
