import java.math.BigInteger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.leneweit.projecteuler.utils.Utils;

public class Problem0021 {

	public static void main(String[] args) {
		Map<BigInteger, BigInteger> sums = new HashMap<>();

		for (int i = 1; i <= 10000; i++) {
			BigInteger n = BigInteger.valueOf(i);
			Collection<BigInteger> factors = Utils.factorize(n);

			BigInteger sum = BigInteger.ZERO;
			for (BigInteger factor : factors) {
				sum = sum.add(factor);
			}

			sums.put(n, sum);
		}

		BigInteger result = BigInteger.ZERO;

		for (int i = 1; i <= 10000; i++) {
			BigInteger n = BigInteger.valueOf(i);

			BigInteger sum = sums.get(n);

			if (!n.equals(sum)) {
				BigInteger sum2 = sums.get(sum);

				if (sum2 != null && sum2.equals(n)) {
					System.out.println(n);
					result = result.add(n);
				}
			}
		}

		System.out.println("Result = " + result);
	}

}
