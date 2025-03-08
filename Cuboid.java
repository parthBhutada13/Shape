// Cuboid.java
class Cuboid extends Shape {
	public Cuboid(double length, double breadth, double height) {
		super(length, breadth, height, 12); // A cuboid has 12 edges
	}

	public double calculateArea() {
		return 2 * (dim1 * dim2 + dim2 * dim3 + dim3 * dim1); // Surface area of a cuboid
	}

	public double calculatePerimeter() {
		return 4 * (dim1 + dim2 + dim3); // Sum of all edges
	}

	@Override
	public double calculateVolume() {
		return dim1 * dim2 * dim3; // Volume of a cuboid
	}
}
