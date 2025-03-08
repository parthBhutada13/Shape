import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter length:- ");
        double length = Double.parseDouble(scan.nextLine());

        System.out.println("Enter width:- ");
        double width = Double.parseDouble(scan.nextLine());

        Shape rectangle = new Rectangle(length, width);
        printShapeDetails(rectangle, "Rectangle");

        System.out.println("Enter radius:- ");
        double radius = Double.parseDouble(scan.nextLine());

        Shape circle = new Circle(radius);
        printShapeDetails(circle, "Circle");

        System.out.println("Enter side:- ");
        double side = Double.parseDouble(scan.nextLine());

        Shape square = new Square(side);
        printShapeDetails(square, "Square");

        System.out.println("Enter side 1:- ");
        double a = Double.parseDouble(scan.nextLine());

        System.out.println("Enter side 2:- ");
        double b = Double.parseDouble(scan.nextLine());

        System.out.println("Enter side 3:- ");
        double c = Double.parseDouble(scan.nextLine());

        Shape triangle = new Triangle(a, b, c);
        printShapeDetails(triangle, "Triangle");

        System.out.println("Enter length:- ");
        double l = Double.parseDouble(scan.nextLine());

        System.out.println("Enter breadth:- ");
        double br = Double.parseDouble(scan.nextLine());

        System.out.println("Enter height:- ");
        double h = Double.parseDouble(scan.nextLine());

        Shape cuboid = new Cuboid(l, br, h);
        printShapeDetails(cuboid, "Cuboid");

	System.out.println("Enter side length:- ");
	double sideLength = Double.parseDouble(scan.nextLine());

	Shape cube = new Cube(sideLength);
	printShapeDetails(cube, "Cube");
	}

	// Helper method to print shape details
	private static void printShapeDetails(Shape shape, String shapeName) {
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("Area of " + shapeName + ":- " + shape.calculateArea());
	System.out.println("Perimeter of " + shapeName + ":- " + shape.calculatePerimeter());
	if (shape instanceof Cube || shape instanceof Cuboid) {
		System.out.println("Volume of " + shapeName + ":- " + shape.calculateVolume());
	}
	System.out.println("Sides of " + shapeName + ":- " + shape.getNumSides());
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
