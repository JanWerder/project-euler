package com.leneweit.projecteuler.utils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;

public class Utils {

	public static BigInteger quersumme(BigInteger n) {
		BigInteger sum = BigInteger.ZERO;

		for (char c : n.toString().toCharArray()) {
			sum = sum.add(new BigInteger("" + c));
		}

		return sum;
	}

	public static BigInteger factorial(BigInteger n) {
		if (BigInteger.ONE.equals(n)) {
			return BigInteger.ONE;
		} else {
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
		}
	}

	public static Collection<BigInteger> factorize(BigInteger n) {
		Collection<BigInteger> factors = new ArrayList<>();
		factors.add(BigInteger.ONE);

		BigInteger test = BigInteger.valueOf(2);

		boolean resume = true;
		do {
			switch (test.multiply(test).compareTo(n)) {
			case 0:
				factors.add(test);
				break;
			case -1:
				if (n.mod(test).equals(BigInteger.ZERO)) {
					factors.add(test);
					factors.add(n.divide(test));
				}
				break;
			default:
				resume = false;
				break;
			}

			test = test.add(BigInteger.ONE);
		} while (resume);

		return factors;
	}

}
