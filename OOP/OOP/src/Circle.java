
public class Circle {
	float area,circumference,radius;
	void getCircumference() {
		radius=2.3f;
		circumference = 2 * 22 /7.0f * radius;
		circumference = (float) (Math.PI * radius * radius);

	}
	void getArea() {
		area = 22/7.0f * radius * radius;
	}
	void showArea() {
		System.out.println("Area = " + area);
	}
	void showCircumferece() {
		System.out.println("Circumference = " + circumference);
	}
}
