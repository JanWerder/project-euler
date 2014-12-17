import java.math.BigInteger;

public class Problem0027 {

	public static void main(String[] args) {
		int longest = 0;
		int aFinal = 0;
		int bFinal = 0;

		for (int a = -999; a < 1000; a++) {
			System.out.println("A = " + a);
			for (int b = -999; b < 1000; b++) {
				int n = 0;
				boolean prime = true;

				while (prime) {
					BigInteger temp = BigInteger.valueOf(n * n + a * n + b);
					if (temp.isProbablePrime(temp.abs().intValue())) {
						n++;
					} else {
						prime = false;
					}
				}

				if (n > longest) {
					longest = n;
					aFinal = a;
					bFinal = b;
				}
			}
		}

		System.out.println("Result = " + aFinal * bFinal);
		System.out.println("Longest = " + longest);
		System.out.println("A = " + aFinal);
		System.out.println("B = " + bFinal);
	}
}
