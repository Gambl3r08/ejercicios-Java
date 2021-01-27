
package manejodeexcepciones;
import java.util.Scanner;
import java.lang.*;
public class ManejoDeExcepciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        
        System.out.println("Digite el numero n1");
        num1 = entrada.nextInt();
        System.out.println("Digite el numero n2");
        num2 = entrada.nextInt();
        try{
            int resultado = num1 / num2;
        } catch(ArithmeticException ae){
            System.out.println("Excepción algoritmica identificada");
        }
        int resultado = num1 / num2;
        
        System.out.println("El resultado es "+ resultado);
                
        
        
        
        
    }
    
}
