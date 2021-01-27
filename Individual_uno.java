
package individual_uno;
import java.util.Scanner;
public class Individual_uno {
 public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       String cadena, cadenasin = " "; 
       String codigo, nombre, numero;
        
        System.out.println("Ingrese sus datos: ");
        System.out.println("Recuerde que el codigo debe tener solo 4 numeros ");
        System.out.println("Recuerde que su nombre debe ser igual a 15 caracteres ");
        System.out.println("Recuerde que su numero no puede tener mas de 6 digitos ");
        
        System.out.println("Ingrese sus datos acontinuacion: ");
        System.out.println("--------------------------------");
        cadena = entrada.nextLine();
        
        for(int i = 0; i < cadena.length(); i ++)
        {
            if ( cadena.charAt(i) != ' ' )
            {
                cadenasin += cadena.charAt(i);
            }
            
        }
        
        codigo =  cadenasin.substring(0, 4);
        nombre =  cadenasin.substring(5, 19);
        numero =  cadenasin.substring(20, 26);
        System.out.println("Su codigo es: "+codigo);
        System.out.println("su nombre es: "+nombre);
        System.out.println("su numero es: "+numero);
     
}
    
}
