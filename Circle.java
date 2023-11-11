package myPackage;
import java.util.Scanner;
public class Circle {
	//float radius;
	static float PI=3.14f;
	static float area() {
		float radius;
		float area;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your radius");
		radius = s.nextFloat();
		area = PI * radius * radius;
		return area;
	}
	public static void main(String[] args) {
		
		float area=0;
		Circle c = new Circle();
		
		//call the method area
		area = c.area();
		System.out.println("The area is "+area);
		
	}

}
