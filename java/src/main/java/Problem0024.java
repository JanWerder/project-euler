import java.util.ArrayList;
import java.util.List;

public class Problem0024 {

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
		for (int i = 0; i < 10; i++) {
			numbers.add("" + i);
		}

		List<String> permutes = permute("", numbers);

		System.out.println(permutes.get(999999));
	}
}
