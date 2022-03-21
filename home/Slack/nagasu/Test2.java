import java.util.*;
public class Test2 {
	public static void main(String[] args){
		System.out.println("【円の面積を求めよう】");
    System.out.print("円の半径(cm)を入力：");
		double atai = new Scanner(System.in).nextDouble();

		double sisu = 2;
    double kai  = Math.pow(atai, sisu);
    final double pi = Math.PI;
    double kai2  = kai * pi;
    
		System.out.print("円の面積は：" + String.format("%.2f", kai2) + "㎠");
	}
}
