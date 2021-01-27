/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author gambl3r
 */
public class ArrayBidimencional {
    
    public static void main(String[] args){
        
        int [][] n = new int[5][5];
        
        for (int i = 0; i < n.length; i++){
            for(int j = 0; j < n.length; j++){
                n[i][j] = (int)(Math.random() * 9) + 1;
            }
        }
        for (int i = 0; i < n.length; i++){
            System.out.println();
            for(int j = 0; j < n.length; j++){
                System.out.print(n[i][j] + " ");
                
            }
        }
        System.out.println();
        
    }
    
}
