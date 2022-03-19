import java.util.*;

public class Ex5_4{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("底辺の長さは：");
		double bottom = scanner.nextDouble();
		System.out.print("高さは：");
		double height = scanner.nextDouble();
		double triangleArea = calcTriangleArea(bottom, height);
		System.out.println("三角形の底辺の長さが" + bottom + "cm、高さが" + height+ "cmの場合、面積は" + triangleArea + "㎠");

		System.out.print("半径は：");
		double radius = scanner.nextDouble();
		double circleArea = calcCircleArea(radius);
		System.out.println("円の半径が" + radius + "cmの場合、" + circleArea+ "㎠");
	}

	public static double calcTriangleArea(double bottom, double height){
		return bottom * height / 2;
	}

	public static double calcCircleArea(double radius){
		return Math.pow(radius, 2) * 3.14; 
	}
}
