
package individual_seis;
import java.util.Scanner;
public class Individual_seis {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       String cadena, cadena_invertida = "";
       int i = 0;
       
        System.out.println("Ingrese una cadena ");
        cadena = entrada.nextLine();
        for (i = cadena.length()-1; i >= 0; i-- )
        {
            
            cadena_invertida = cadena_invertida + cadena.charAt(i);
            
        }       
        
        System.out.println("la cadena invertida es: "+cadena_invertida);
        
        
    }
    
}
