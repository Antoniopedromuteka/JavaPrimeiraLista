     
    
 
import java.util.Scanner;

public class Ex23 {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        float peso,engordar,emagrecer;
        

        System.out.println("Digite o peso:  ");
        peso = leitor.nextFloat();
        
        engordar = peso + ((peso*15)/100);
        emagrecer = peso - ((peso*20)/100);


         
        System.out.println(" o novo peso, se a pessoa engordar 15% sobre o peso digitado  é  : "+engordar);
        System.out.println(" o novo peso, se a pessoa emagrecer 20% sobre o peso digitado  é  : "+emagrecer);
        

         







    

    }

}
