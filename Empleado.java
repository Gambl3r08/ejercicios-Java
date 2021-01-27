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
public class Empleado {
    
    private int id;
    private String nombre;
    private String apellido;
    private double sueldo;

    

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Empleado() {
        this.id = 0;
        this.nombre = "null";
        this.apellido = "null";
        this.sueldo = 0;
    }

    
    
    
    
    
}
