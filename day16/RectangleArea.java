import java.util.*;
public class RectangleArea{
	public static void main(String[] args){
		System.out.print("縦>>");
		double height = new Scanner(System.in).nextDouble();
		System.out.print("横>>");
		double width = new Scanner(System.in).nextDouble();
		System.out.printf("長方形の面積は%.1fです", rectangleArea(height,width));
	}

	//長方形の面積を求める
	public static double rectangleArea(double height, double width){
		return height * width;
	}
}
