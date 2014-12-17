import java.math.BigInteger;


public class Problem0048 {

	public static void main(String[] args) {
		BigInteger sum = BigInteger.ZERO;
		for (int i = 1; i < 1000; i++) {
			sum = sum.add(BigInteger.valueOf(i).pow(i));
		}
		
	System.out.println("Result = " + sum.toString().substring(sum.toString().length()-10));
	}

}
