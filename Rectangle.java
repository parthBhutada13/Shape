// Rectangle.java
class Rectangle extends Shape {
	public Rectangle(double length, double width) {
		super(length, width, 0, 4);
	}

	public double calculateArea() {
		return dim1 * dim2;
	}

	public double calculatePerimeter() {
		return 2 * (dim1 + dim2);
	}
}
