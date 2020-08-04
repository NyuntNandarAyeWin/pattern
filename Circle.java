package pattern;

public class Circle implements Shape{
	private double radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Circle::draw() method.");
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Circle area is "+  (Math.PI * radius * radius));
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("Circle perimeter is "+ (2 * radius * Math.PI));
	}

}
