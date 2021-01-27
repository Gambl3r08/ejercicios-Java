
package ejercicios.individuales;
import java.util.*;
import java.io.*;
public class EjerciciosIndividuales {

   public static void main(String arg[])throws Exception {
      FileOutputStream archdestino = new FileOutputStream("salida1.txt", true);
        Scanner entrada = new Scanner (System.in);
        PrintStream a = new PrintStream(archdestino);
        int Des = 0; int n = 0; int Nidenti = 0; int Nempleado = 0; int sueldo = 0;
        String nombre, apellido, direccion;
        while (Des != 1)
        {
            System.out.println("Ingrese el nombre del empleado: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese el apellido: ");
            apellido = entrada.nextLine();
            System.out.println("Ingrese la direccion: ");
            direccion = entrada.nextLine();
            System.out.println("Ingrese el numero de empleado:");
            Nempleado = entrada.nextInt();
            System.out.println("Ingrese el sueldo ");
            sueldo = entrada.nextInt();
            a.println("Nombre \t " + "Apellido \t" + "Direccion \t " + "N empleado \t" + "Sueldo \t" );
            a.println(nombre+ "\t" + apellido + "\t "+direccion + "\t " + Nempleado + " \t " + sueldo + "\t");
            
            System.out.println(" ¿Desea ingresar otro dato ? pulse 0.si 1.no ");
            Des = entrada.nextInt();
        }
        
        
        
        
    }
    
}
