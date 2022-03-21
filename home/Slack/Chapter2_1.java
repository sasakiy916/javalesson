import java.util.*;

public class Chapter2_1{
	public static void main(String[] args){
		System.out.println("【円の面積を求めよう】");
		System.out.print("円の半径(cm)を入力：");
		Scanner scanner = new Scanner(System.in);
		double radius = scanner.nextDouble();
		double circleArea = Math.pow(radius, 2) * 3.14;

		System.out.println("円の面積は " + circleArea + "㎠");
	}
}
