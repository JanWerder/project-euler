import java.math.BigInteger;

public class Problem0015 {

	public static void main(String[] args) {
		int width = 20;
		int height = width;

		Node[][] grid = new Node[width + 1][height + 1];
		for (int y = 0; y <= height; y++) {
			for (int x = 0; x <= width; x++) {
				Node left = null;
				Node above = null;
				if (x > 0) {
					left = grid[x - 1][y];
				}
				if (y > 0) {
					above = grid[x][y - 1];
				}
				grid[x][y] = new Node(x, y, left, above);
			}
		}

		Node start = grid[width][height];
		System.out.println(start.getPathCount());
	}

}

class Node {

	private final int x;
	private final int y;

	private BigInteger pathCount = null;

	private Node left;
	private Node above;

	public Node(int x, int y, Node left, Node above) {
		this.x = x;
		this.y = y;
		this.left = left;
		this.above = above;
	}

	public BigInteger getPathCount() {
		if (pathCount == null) {
			pathCount = new BigInteger("0");

			if (left != null) {
				pathCount = pathCount.add(left.getPathCount());
			}
			if (above != null) {
				pathCount = pathCount.add(above.getPathCount());
			}

			if (pathCount.equals(new BigInteger("0"))) {
				pathCount = new BigInteger("1");
			}
		}
		return pathCount;
	}

	@Override
	public String toString() {
		return "Node [x=" + x + ", y=" + y + ", pathCount=" + pathCount + "]";
	}

}
