import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem0032 {

	public static List<String> permute(String start, List<String> rest) {
		List<String> result = new ArrayList<>();

		for (String append : rest) {
			String tempString = start + append;

			if (rest.size() > 1) {
				List<String> tempList = new ArrayList<>(rest);
				tempList.remove(append);

				result.addAll(permute(tempString, tempList));
			} else {
				result.add(tempString);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		List<String> numbers = new ArrayList<>();
		for (int i = 1; i < 10; i++) {
			numbers.add("" + i);
		}

		Set<Integer> products = new HashSet<>();

		List<String> pandigitals = permute("", numbers);

		for (String pandigital : pandigitals) {
			for (int i = pandigital.length() - 4; i > 3; i--) {
				int sum = Integer.valueOf(pandigital.substring(i));
				for (int j = i - 1; j > 0; j--) {
					int x = Integer.valueOf(pandigital.substring(0, j));
					int y = Integer.valueOf(pandigital.substring(j, i));

					if (x * y == sum) {
						System.out.println("" + x + " * " + y + " = " + sum);
						products.add(sum);
					}
				}
			}
		}

		int sum = 0;

		for (int product : products) {
			sum += product;
		}

		System.out.println("Result = " + sum);
	}
}
