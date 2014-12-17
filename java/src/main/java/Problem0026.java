import java.util.ArrayList;
import java.util.List;

public class Problem0026 {

	public static int getCycle(int n) {
		List<Integer> remainders = new ArrayList<>();

		int rest = 1;

		boolean found = false;
		while (!found) {
			rest = rest % n;

			if (rest == 0) {
				return 0;
			}

			if (remainders.contains(rest)) {
				found = true;
			} else {
				remainders.add(rest);
				rest *= 10;
			}
		}

		return remainders.size() - remainders.indexOf(rest);
	}

	public static void main(String[] args) {
		int d = 0;
		int longest = 0;

		for (int i = 2; i < 1000; i++) {
			int size = getCycle(i);

			System.out.println(size);

			if (size > longest) {
				longest = size;
				d = i;
			}
		}

		System.out.println("Result = " + d);
	}
}
