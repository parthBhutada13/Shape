// Circle.java
class Circle extends Shape {
	public Circle(double radius) {
		super(radius, 0, 0, 0); // A circle has no sides
	}

	public double calculateArea() {
		return Math.PI * dim1 * dim1;
	}

	public double calculatePerimeter() {
		return 2 * Math.PI * dim1;
	}
}
