// Triangle.java
class Triangle extends Shape {
	public Triangle(double a, double b, double c) {
		super(a, b, c, 3);
	}

	public double calculateArea() {
		double s = (dim1 + dim2 + dim3) / 2;
		return Math.sqrt(s * (s - dim1) * (s - dim2) * (s - dim3));
	}

	public double calculatePerimeter() {
		return dim1 + dim2 + dim3;
	}
}
