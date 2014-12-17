import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import com.leneweit.projecteuler.utils.Utils;

public class Problem0023 {

	public static void main(String[] args) {
		List<Integer> abundants = new ArrayList<>();

		for (int i = 1; i < 28123; i++) {
			Collection<BigInteger> factors = Utils.factorize(BigInteger
					.valueOf(i));
			int sum = 0;

			for (BigInteger factor : factors) {
				sum += factor.intValue();
			}

			if (sum > i) {
				abundants.add(i);
			}
		}

		HashSet<Integer> sums = new HashSet<>();

		for (int a1 : abundants) {
			for (int a2 : abundants) {
				sums.add(a1 + a2);
			}
		}

		BigInteger result = BigInteger.ZERO;

		for (int i = 1; i <= 28123; i++) {
			if (!sums.contains(i)) {
				result = result.add(BigInteger.valueOf(i));
			}
		}

		System.out.println("Result = " + result);
	}

}
