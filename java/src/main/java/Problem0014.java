public class Problem0014 {

	public static void main(String[] args) {
		long maxLength = 1;
		long result = 2;

		for (long i = 2; i < 1000000L; i++) {
			long length = new Chain(i).loop();
			if (length > maxLength) {
				maxLength = length;
				result = i;
			}
		}

		System.out.println(result);
	}

}

class Chain {

	private long n;
	private long length = 1;

	public Chain(long n) {
		this.n = n;
	}

	public long loop() {
		while (n > 2L) {
			operation();
			length++;
		}

		return length;
	}

	private void operation() {
		if ((n & 1L) == 0L) {
			n = n / 2L;
		} else {
			n = 3L * n + 1L;
		}
	}

}
