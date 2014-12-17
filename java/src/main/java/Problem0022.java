import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Problem0022 {

	public static void main(String[] args) throws IOException {
		List<String> names = FileUtils.readLines(new File("0022/names.txt"));

		Collections.sort(names);

		BigInteger result = BigInteger.ZERO;

		for (int i = 0; i < names.size(); i++) {
			String name = names.get(i);

			int sum = 0;
			for (char c : name.toCharArray()) {
				sum += c - 'A' + 1;
			}

			result = result.add(BigInteger.valueOf((i + 1) * sum));
		}

		System.out.println("Result = " + result);
	}

}
