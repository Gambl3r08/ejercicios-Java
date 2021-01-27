
package individual_cinco;
import java.util.Scanner;
public class Individual_cinco {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       String Puno, Pdos;
       
        System.out.println("INGRESE LA PRIMERA PALABRA:");
        Puno = entrada.nextLine();
        System.out.println("INGRESE LA SEGUNDA PALABRA:");
        Pdos = entrada.nextLine();
        
        for (int i = 0; i < Puno.length(); i++)
            
        {
            if (Puno.charAt(i) == Pdos.charAt(i))
            {
                System.out.println("La letra "+ " | "+Puno.charAt(i)+ " | " + " de la cadena 1 es igual a la letra "+ " | " + Pdos.charAt(i) + " | " + " de la cadena 2 "  );
            }
            
        }
        
        
        
        
    }
    
}
