abstract class Shape {
	protected double dim1;
	protected double dim2;
	protected double dim3;
	protected int num_sides;

	// Constructor with 0 parameters
	public Shape() {
		dim1 = dim2 = dim3 = 0;
		num_sides = 0;
	}

	// Parameterized constructor
	public Shape(double dim1, double dim2, double dim3, int num_sides) {
		this.dim1 = dim1;
		this.dim2 = dim2;
		this.dim3 = dim3;
		this.num_sides = num_sides;
	}

	abstract public double calculateArea();
	abstract public double calculatePerimeter();

	// Add calculateVolume() with a default implementation
	public double calculateVolume() {
		return 0; // Default implementation for 2D shapes
	}

	public int getNumSides() {
		return num_sides;
	}
}
