
package individual_siete;
import java.util.*;
public class Individual_siete {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palabra;
        String palabra_invertida = "";
        
        int i = 0;
        System.out.println("Ingrese una palabra: ");
        palabra = entrada.nextLine();
        palabra.replace(" ", "");
        // metodo para invertir 
        for (i = palabra.length()-1; i >=0; i--)
        {
          palabra_invertida = palabra_invertida + palabra.charAt(i);
            
        }
        
        palabra_invertida.replace(" ", "");
        
        
        
        // metodo para comparar 
      if (palabra_invertida.equals(palabra))
      {
          System.out.println("Esta cadena es palindrome");
      }
      else {
          System.out.println("no es palindrome");
      }
        
       
    
       
    }
    
}
