import java.math.BigInteger;

import com.leneweit.projecteuler.utils.Utils;

public class Problem0020 {

	public static void main(String[] args) {
		BigInteger factorial = Utils.factorial(BigInteger.valueOf(100));

		System.out.println("Factorial = " + factorial);
		System.out.println("Quersumme = " + Utils.quersumme(factorial));
	}

}
