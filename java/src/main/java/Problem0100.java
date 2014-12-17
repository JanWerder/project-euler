public class Problem0100 {

	public static void main(String[] args) {
		long blue = 15;
		long all = 21;
		long target = 1000000000000l;

		while (all < target) {
			long blueTemp = 3 * blue + 2 * all - 2;
			all = 4 * blue + 3 * all - 3;

			blue = blueTemp;
		}

		System.out.println("Blue = " + blue);
		System.out.println("All = " + all);
	}
}
