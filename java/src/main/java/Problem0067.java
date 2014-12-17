import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Problem0067 {

	public static void main(String[] args) throws IOException {
		int height = 100;
		int[][] triangle = new int[height][height];

		File file = new File("0067/triangle.txt");
		List<String> lines = FileUtils.readLines(file);

		int y = 0;
		for (String line : lines) {
			String[] numbers = line.split(" ");
			int x = 0;
			for (String number : numbers) {
				triangle[x++][y] = Integer.valueOf(number);
			}
			y++;
		}

		y = height - 1;
		while (y > 0) {
			y -= 1;
			for (int x = 0; x <= y; x++) {
				int value = triangle[x][y];
				triangle[x][y] = value + Math.max(triangle[x][y + 1], triangle[x + 1][y + 1]);
				System.out.println(triangle[x][y]);
			}
		}
	}
}
