/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diptongosehiatos;
import java.util.*;

public class DiptongoseHiatos {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        String  n ;
        System.out.println("ingrese una palabra");
        n = entrada.nextLine();
        int dip=0;
        for(int i=0;i<n.length();i++){
            if (n.indexOf("ai")>-1){
                dip ++;}
            else if(n.indexOf("au")>-1){
                dip ++;}
            else if(n.indexOf("ei")>-1){
                dip ++;}     
            else if(n.indexOf("eu")>-1){
                dip ++;}
            else if(n.indexOf("oi")>-1){
                dip ++;}  
            else if(n.indexOf("ou")>-1){
                dip ++;}
            else if(n.indexOf("ia")>-1){
                dip ++;}  
            else if(n.indexOf("ie")>-1){
                dip ++;}
            else if(n.indexOf("io")>-1){
                dip ++;}  
            else if(n.indexOf("iu")>-1){
                dip ++;}
            else if(n.indexOf("ua")>-1){
                dip ++;}  
            else if(n.indexOf("ue")>-1){
                dip ++;}
            else if(n.indexOf("ui")>-1){
                dip ++;}  
            else if(n.indexOf("uo")>-1){
                dip ++;}
            }
        if(dip>0){
                System.out.println("La palabra: "+ n+ " es un diptongo");
        }
        else{
            System.out.println("La palabra: "+n+ " no es un diptongo");
        }
    }
    }
