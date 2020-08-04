package pattern;

import java.util.Scanner;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Scanner sc = new Scanner(System.in);
		String ans;
		do {
			System.out.print("Enter your shape type : ");
			String type = sc.nextLine();
			
			//shapeFactory.getShape(type);
			Shape shape = shapeFactory.getShape(type);
			shape.draw();
			shape.area();
			shape.perimeter();
			
			System.out.println("Try next shape type!!");
			ans = sc.nextLine();
		}while(ans.equals("yes"));
		
		sc.close();
		
		
	}

}
