
package individual_dos;
import java.util.Scanner;
public class Individual_dos {

    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       int cond = 0; double a, b , P; String palabra;
        System.out.println("Ingrese una palabra: ");
        System.out.println("---------------------");
        palabra = entrada.nextLine();
        
        for (int i = 0; i < palabra.length(); i++)
        {
            if ( (palabra.charAt(i) == 'a') || (palabra.charAt(i) == 'e' ) || (palabra.charAt(i) == 'i' ) || (palabra.charAt(i) == 'o' ) || (palabra.charAt(i) == 'u' )  )
            {
                cond++;
            }
            
            a = palabra.length()*1.0;
            b = cond*1.0;
            P = (b / a)*100;
            
            System.out.println("La palabra tiene " + palabra.length()+ " letras " + " y " + cond + " vocales " );
            System.out.println("El porcentaje de vocales es " + P + "%");
        }
       
       
        
        
    }
    
}
