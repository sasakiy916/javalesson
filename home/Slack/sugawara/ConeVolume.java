import java.util.*;
public class ConeVolume{
	public static void main(String[] args){
		System.out.print("円の直径cm>>");
		double a = new Scanner(System.in).nextDouble();
		System.out.print("円錐の高さ>>");
		double b = new Scanner(System.in).nextDouble();
		double volume = coneVolume(a,b);
		System.out.printf("この円錐の体積は%.0f㎤です",volume);
	}

	//円錐の直径と高さを引数に渡すと、体積を計算するメソッド。戻り値は体積
	public static double coneVolume(double diameter, double height){
		double coneArea = Math.pow(diameter/2,2) * Math.PI;
		return coneArea * height / 3; 
	}
}
