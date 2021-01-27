import java.util.Scanner;
import java.lang.Math;


public class Gastosdelhospital {

   public static void main (String[] arg){
   	
   Double pd, gn, tg, cd, ot, pv, p;
   
   Scanner entrada= new Scanner(System.in);
   
   System.out.println ("Digite el presupuesto ");
   p=entrada.nextDouble();
   
   pd=p*0.25;
   System.out.println ("El presupuesto para Pediatria es: "+pd);
   
   gn=p*0.25;
   
  System.out.println ("El presupuesto para Ginecologia es: "+gn);
    
  tg=p*0.20;
  	
  	System.out.println ("El presupuesto para Traumatologia es"+tg);
  		
  	cd=p*0.15;
  		
  		System.out.println ("El presupuesto para Cardiologia es: "+cd);	
  			
  			ot=p*0.10;
  			
  			System.out.println ("El presupuesto para Oftalmologia es: "+ot);
  			
  			pv=p*0.5;
  			
  			System.out.println ("El presupuesto para Prevencion es: "+pv);
  				
   
   
    
   	
   	
   	
   	
   	
   }
    
    
}