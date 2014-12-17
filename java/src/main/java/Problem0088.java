
public class Problem0088 {

	public static void main(String[] args) {

		// Set<Integer> set = new HashSet<>();

		System.out.println(new SPSet(10, true).getResult());

		// for (int i = 2; i < 13; i++) {
		// System.out.println("" + i + " - " + new SPSet(i).getResult());
		// }
	}

}

class SPSet {

	private final boolean debug;

	private final int[] numbers;

	private int addResult;

	private int addTwoIndex = 1;
	private int increaseIndex = 0;
	private boolean increaseAndDecrease = false;

	public SPSet(int size) {
		this(size, false);
	}

	public SPSet(int size, boolean debug) {
		this.debug = debug;
		numbers = new int[size];

		numbers[0] = 2;
		for (int i = 1; i < size; i++) {
			numbers[i] = 1;
		}

		addResult = size + 1;
	}

	public int getResult() {
		int multiplyResult = 2;
		do {
			if (multiplyResult < addResult) {
				increase();
			} else {
				decrease();
			}

			multiplyResult = 1;
			for (int i = 0; i <= addTwoIndex; i++) {
				int number = numbers[i];
				log("" + number + "x");
				multiplyResult *= number;
			}

			logln("");
			logln("" + addResult + " - " + multiplyResult);
			// try {
			// Thread.sleep(1000);
			// } catch (InterruptedException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
		} while (multiplyResult != addResult && multiplyResult < 100);

		return addResult;
	}

	private void increase() {
		if (increaseAndDecrease) {
			increaseIndex--;
			numbers[increaseIndex++] += 1;
			numbers[addTwoIndex++] -= 1;
			increaseAndDecrease = false;
		} else {
			numbers[addTwoIndex++] = 2;
			addResult++;
		}
	}

	private void decrease() {
		// if (addTwoIndex == increaseIndex) {
		// increaseIndex -= 2;
		// addTwoIndex--;
		// numbers[increaseIndex++] += 1;
		// numbers[addTwoIndex++] -= 1;
		// } else {
		numbers[--addTwoIndex] -= 1;
		if (increaseIndex < addTwoIndex) {
			numbers[increaseIndex++] += 1;
		} else {
			numbers[--increaseIndex - 1] += 1;
			numbers[addTwoIndex - 1] -= 1;
			addResult--;
		}
		// }
	}

	private void log(String s) {
		if (debug) {
			System.out.print(s);
		}
	}

	private void logln(String s) {
		if (debug) {
			System.out.println(s);
		}
	}

}
