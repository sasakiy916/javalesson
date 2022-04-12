import java.util.*;
public class MethodLesson9{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("体重を入力してください(kg)>>");
		double weight = scan.nextDouble();
		System.out.print("身長を入力してください(cm)>>");
		double height = scan.nextDouble();
		System.out.printf("体重:%.1fkg,身長:%.1fcmのBMIは%.1fです。",weight,height,calcBMI(weight,height));
		scan.close();
	}

	static double calcBMI(double weightKg, double heightCm){
		return weightKg/(heightCm/100*heightCm/100);
	}
}
