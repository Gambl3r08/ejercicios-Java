
package individual_cuatro;
import java.util.Scanner;
public class Individual_cuatro {

    public static void main(String[] args) {
      Scanner entrada = new Scanner (System.in);
     String P; int n; String nuevo;   
      System.out.println("Ingrese una palabra: ");
        System.out.println("----------------------");
        
        P = entrada.nextLine();
        
        System.out.println("Ingrese la canditad de caracteres a eliminar ");
        n = entrada.nextInt();
        nuevo = P.substring(n);
        
        System.out.println("El resultado despues de eliminar es: "+nuevo);
        
        
    }
    
}
