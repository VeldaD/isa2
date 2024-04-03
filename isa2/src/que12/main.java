package que12;

	abstract class Shape {
	    abstract double calculateArea();
	    abstract double calculatePerimeter();
	}

	class Circle extends Shape {
	    private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    double calculateArea() {
	        return Math.PI * radius * radius;
	    }

	    @Override
	    double calculatePerimeter() {
	        return 2 * Math.PI * radius;
	    }
	}

	class Triangle extends Shape {
	    private double side1, side2, side3;

	    public Triangle(double side1, double side2, double side3) {
	        this.side1 = side1;
	        this.side2 = side2;
	        this.side3 = side3;
	    }

	    @Override
	    double calculateArea() {
	        // Using Heron's formula to calculate the area of the triangle
	        double s = (side1 + side2 + side3) / 2;
	        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	    }

	    @Override
	    double calculatePerimeter() {
	        return side1 + side2 + side3;
	    }
	}


public class main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			// Creating objects of Circle and Triangle classes
	        Circle circle = new Circle(5);
	        Triangle triangle = new Triangle(3, 4, 5);

	        // Calculating and printing the area and perimeter of the circle
	        System.out.println("Circle:");
	        System.out.println("Area: " + circle.calculateArea());
	        System.out.println("Perimeter: " + circle.calculatePerimeter());
	        System.out.println();

	        // Calculating and printing the area and perimeter of the triangle
	        System.out.println("Triangle:");
	        System.out.println("Area: " + triangle.calculateArea());
	        System.out.println("Perimeter: " + triangle.calculatePerimeter());
		}
}
