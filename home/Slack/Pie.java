import java.util.*;
public class Pie{
	public static void main(String[] args){
		final double Pie = 3.14;
		System.out.println("【円の面積を求めよう】");
		System.out.print("円の半径(㎝)を入力>>");
		double r = new Scanner(System.in).nextDouble();
		System.out.print("円の面積は ");
    System.out.print(Math.pow(r, 2)*Pie);
		System.out.print("㎠");
	}
}
