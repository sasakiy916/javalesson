import java.util.*;
public class PopulationDensity{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("人数>>");
		double a = s.nextDouble();
		System.out.print("広さ㎢>>");
		double b = s.nextDouble();

		double c = density(a,b);
		System.out.printf("1㎡あたりの人数は%.2f人です",c);
		System.out.println(c<1?"(安全)":"(密)");
	}

	//人口密度を計算する　引数に人数と広さを渡すと、1㎡当たりの人口密度を戻り値に返す
	public static double density(double num, double area){
		return num / (area * 1000);
	}
}
