/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydeobjetos;

/**
 *
 * @author gambl3r
 */
public class ArrayDeObjetos {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        
        Empleado ArrayEmpleado[] = new Empleado[10];
        
        for(int i = 0; i < 10; i++){
            Empleado Nemp = new Empleado();
            ArrayEmpleado[i] = Nemp;
            
            
        }
        
        
        int _id = 0;
        int _nombre = 0;
        int _apellido = 0;
        double _sueldo = 23;
       
        for(int i = 0; i < 10; i++){
         ArrayEmpleado[i].setId(_id);
         ArrayEmpleado[i].setNombre("persona "+_nombre);
         ArrayEmpleado[i].setApellido("Ap Persona "+ _apellido);
         ArrayEmpleado[i].setSueldo(_sueldo);
        
        _id += 1;
        _nombre += 1;
        _apellido += 1;
        
        _sueldo *= 2.5;
        
        }
        
        for(int i = 0; i < 10; i++){
            System.out.println("ID : " + ArrayEmpleado[i].getId());
            System.out.println("Nombre: "+ ArrayEmpleado[i].getNombre());
            System.out.println("Apellido: "+ ArrayEmpleado[i].getApellido());
            System.out.println("Sueldo: "+ ArrayEmpleado[i].getSueldo());
        }
        
        
        
    }
    
}
