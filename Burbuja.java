/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;

/**
 *
 * @author gambl3r
 */

public class Burbuja {
    
    public static void burbuja(int[] lista){
        int i, j, aux;
        for(i = 0; i < lista.length -1; i++){
            for(j = 0; j < lista.length - i - 1; j++){
                if(lista[j + 1] < lista[j]){
                    aux = lista[j+1];
                    lista[j+1] = lista[j];
                    lista[j] = aux;
                }
                
            }
        }
}
    
    public static void mostrarLista(int[] lista){
        System.out.println("Inicio de la lista");
        for(int i = 0; i < lista.length; i++){
            System.out.print(lista[i]+" ");
        }
        System.out.println("");
        System.out.println("Fin de la lista.");
        System.out.println("");
                
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] lista = {1, 5, 3, 2, 4};
        burbuja(lista);
        
        mostrarLista(lista);
        
        
    }
    
}
