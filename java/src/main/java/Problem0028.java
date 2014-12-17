public class Problem0028 {

	public static void printSpiral(int[][] spiral) {
		for (int y = 0; y < spiral.length; y++) {
			for (int x = 0; x < spiral.length; x++) {
				int value = spiral[x][y];
				String start = "";
				if (value < 100) {
					start += " ";
				}
				if (value < 10) {
					start += " ";
				}

				System.out.print(start + value + " ");
			}
			System.out.println();
		}
	}

	public static long buildSum(int[][] spiral) {
		int size = spiral.length;
		long sum = 0;

		for (int x = 0; x < size; x++) {
			sum += spiral[x][x];
		}
		for (int x = 0; x < size; x++) {
			sum += spiral[x][size - x - 1];
		}

		return --sum;
	}

	public static void main(String[] args) {
		int size = 1001;

		int[][] spiral = new int[size][size];

		int i = 1;
		int middleX = size / 2;
		int middleY = middleX;

		int x = middleX;
		int y = middleY;

		spiral[x][y] = i++;

		int border = 1;

		while (border <= middleX) {
			// Einen nach unten
			spiral[x][++y] = i++;

			// Nach links
			while (x > middleX - border) {
				spiral[--x][y] = i++;
			}

			// Nach oben
			while (y > middleY - border) {
				spiral[x][--y] = i++;
			}

			// Nach rechts
			while (x < middleX + border) {
				spiral[++x][y] = i++;
			}

			// Nach unten
			while (y < middleY + border) {
				spiral[x][++y] = i++;
			}

			border++;
		}

		System.out.println("Result = " + buildSum(spiral));
	}
}
