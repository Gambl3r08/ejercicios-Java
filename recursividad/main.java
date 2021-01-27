public class main {
    public static void main(String[] args){
            int n = sumaNenteros(6);
            System.out.println(n);
    }

    public static int sumaNenteros(int n){
        if(n == 1){
            return 1;
        } else{
            return n + sumaNenteros(n - 1);
        }
    }

}
