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

        
