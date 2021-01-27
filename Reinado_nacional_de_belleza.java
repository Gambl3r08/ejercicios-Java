
package reinado_nacional_de_belleza;
import java.util.*;
import java.io.*;
public class Reinado_nacional_de_belleza {

    public static void main(String arg[])throws Exception {
        Scanner entrada = new Scanner (System.in);
        FileOutputStream archdestino = new FileOutputStream("candidatas.txt", true);
        PrintStream a = new PrintStream(archdestino);
        int n = 0; int i = 0;
        System.out.println("Ingrese el numero de candidatas ");
        n = entrada.nextInt();
        String [] candidatas = new String [n];
        int busto = 0, cintura = 0, cadera = 0;
        int estado_civil = 0; double estatura = 0;
        
        for (i = 0; i < n; i++)
        {
            System.out.println("ingrese el nombre de la candidata:");
            candidatas[n] = entrada.nextLine();
            System.out.println("Ingrese la medida de busto de la candidata " + (n + 1));
            busto = entrada.nextInt();
            System.out.println("Ingrese la medida de cintura de la candidata " + ( n + 1 ) );
            cintura = entrada.nextInt();
            System.out.println("Ingrese la medida de cadera de la candidata " + (n + 1));
            cadera = entrada.nextInt();
            System.out.println("Ingrese 1. soltera 2. casada 3.divorciada ");
            estado_civil = entrada.nextInt();
            System.out.println("Ingrese la estatura de la candidata N "+(n + 1)+ " ejemplo 1.52 1.85");
            estatura = entrada.nextDouble();
            
            if (busto >= 85 || busto  <= 92 || cintura >= 50 || cintura <= 65 || cadera >= 85 || cadera <= 92 || estado_civil == 1 || estatura > 1.70 )
            {
                a.println(candidatas[n] + " \t " + busto + "\t " + cintura + " \t " + cadera + " \t " + "Soltera " + "\t " + estatura );
            } 
            
            
            
            
            
        }
        
        
        
    }
    
}
