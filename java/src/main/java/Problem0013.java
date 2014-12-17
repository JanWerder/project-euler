import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Problem0013 {

	public static void main(String[] args) {
		BigInteger result = new BigInteger("0");

		File file = new File("C:/Users/milenew/Downloads/Test.txt");

		try {
			List<String> lines = FileUtils.readLines(file);
			for (String line : lines) {
				BigInteger number = new BigInteger(line);
				result = result.add(number);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(result.toString().substring(0, 10));
	}

}
