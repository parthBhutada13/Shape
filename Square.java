// Square.java
class Square extends Shape {
	public Square(double side) {
		super(side, 0, 0, 4);
	}

	public double calculateArea() {
		return dim1 * dim1;
	}

	public double calculatePerimeter() {
		return 4 * dim1;
	}
}
