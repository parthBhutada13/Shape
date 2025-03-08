// Cube.java
class Cube extends Shape {
	public Cube(double side) {
		super(side, side, side, 12); // A cube has 12 edges
  }

	public double calculateArea() {
		return 6 * dim1 * dim1; // Surface area of a cube
	}

	public double calculatePerimeter() {
		return 12 * dim1; // Sum of all edges
	}

	@Override
	public double calculateVolume() {
		return dim1 * dim1 * dim1; // Volume of a cube
	}
}
