/**
 * @author Christopher Lara-Betancourt Point class- Holds two integer that
 *         represent a point ICS 372 Dathan Brahma
 *
 */
public class Point {
	private int x;
	private int y;
	private int id;
	private static int idCounter = 0;

	/**
	 * Takes in two integers and set them equal to x and y integer values. It also
	 * creates a unique ID value.
	 * 
	 * @param x
	 * @param y
	 */

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		this.id = idCounter++;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object == null) {
			return false;
		}
		if (getClass() != object.getClass()) {
			return false;
		}
		Point other = (Point) object;
		if (id != other.id) {
			return false;
		}
		return true;
	}

}
