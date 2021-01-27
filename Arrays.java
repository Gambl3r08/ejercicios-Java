
package arrays;

public class Arrays {
    public static void main(String[] args) {
        
       int[] n = new int[10];
       
       for (int i = 0; i < n.length; i++){
           n[i] = (int)(Math.random() * 200) + 1;
       }
       
       for (int i = 0; i < n.length; i++){
           System.out.println(n[i]);
       }
       
       // Bucle for each
        System.out.println("Bucle for each");
       for(int i:n){
           System.out.println(i);
       }
        
        
    }
    
}
