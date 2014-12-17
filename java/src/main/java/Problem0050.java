import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Problem0050 {

	public static void main(String[] args) throws IOException {
		File file = new File("0050/primes.txt");
		List<String> lines = FileUtils.readLines(file);
		List<Integer> primes = new ArrayList<>();
		for (String line : lines) {
			primes.add(Integer.valueOf(line));
		}

		int maxLength = 0;
		int maxSum = 0;
		for (int start = 0; start < primes.size(); start++) {
			int length = 0;
			int sum = 0;
			int i = start;
			while (sum < 1000000 && i < primes.size()) {
				int prime = primes.get(i++);
				sum += prime;
				length++;
			}

			boolean isPrime = false;
			while (!isPrime) {
				int prime = primes.get(--i);
				sum -= prime;
				length--;
				isPrime = new BigInteger("" + sum).isProbablePrime(1000000);
			}

			if (length > maxLength) {
				maxLength = length;
				maxSum = sum;
			}
		}

		System.out.println(maxSum);
	}
}
