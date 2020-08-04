package pattern;

import java.util.Scanner;

public class ShapeFactory {
	Scanner sc = new Scanner(System.in);
	
	public Shape getShape(String shapeType) {
		if(shapeType==null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			System.out.print("Enter radius value :");
			double radius = sc.nextDouble();
			return new Circle(radius);
		}
		else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			System.out.print("Enter length value :");
			double length = sc.nextDouble();
			System.out.print("Enter width value :");
			double width = sc.nextDouble();
			return new Rectangle(length,width);
		}
		else if(shapeType.equalsIgnoreCase("SQUARE")) {
			System.out.print("Enter side value :");
			double side = sc.nextDouble();
			return new Square(side);
		}
		return null;
	}
}
