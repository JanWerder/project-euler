import java.math.BigInteger;

public class Problem0016 {

	public static void main(String[] args) {
		BigInteger summe = new BigInteger("0");
		BigInteger zahl = new BigInteger("2");
		zahl = zahl.pow(1000);
		String string = zahl.toString();
		System.out.println(string);

		for (char c : string.toCharArray()) {
			String s = String.valueOf(c);
			BigInteger cur = new BigInteger(s);
			summe = summe.add(cur);
		}

		System.out.println(summe);
	}
}
