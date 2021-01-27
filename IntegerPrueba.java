import java.math.BigInteger;

public class IntegerPrueba{
	public static void main(String[] args) {
		BigInteger sum = BigInteger.ZERO;
		for (int i = 1; i < 5000; i++) {
			sum = sum.add(BigInteger.valueOf(i)); // Si se usa sin "sum =" no cambia el valor porque es inmutable
		}
		System.out.println(sum);
	}
}