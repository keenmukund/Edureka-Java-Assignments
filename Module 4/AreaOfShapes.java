import java.util.Scanner;
class Shapes{
	float area;
	public float area(float r){
		float radius = r*r;
		area = (float)(3.14*radius);
		return area;
	}
	public float area(int length,int breadth){
		area = length*breadth;
		return area;
	}
	public float area(int side){
		area = side*side;
		return area;
	}
}
public class AreaOfShapes{
	public static void main(String[] args){
		Shapes shapes = new Shapes();
		System.out.println("1-Area of Circle\n2-Area of Rectangle\n3-Area of Square\n");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch(num){
			case 1:
			System.out.println("Enter the radius of the circle:");
			float r = sc.nextFloat();
			System.out.println("Area of Circle is : "+shapes.area(r));
			break;
			case 2:
			System.out.println("Enter the length and breadth of the rectangle:");
			int l = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Area of Rectangle is : "+shapes.area(l,b));
			break;
			case 3:
			System.out.println("Enter the length of the side of square:");
			int s = sc.nextInt();
			System.out.println("Area of Square is : "+shapes.area(s));
			break;
			default :
			System.out.println("Enter the correct number between(1-3)");
		}
	}
}