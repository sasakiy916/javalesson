import java.util.*;
public class MileToKm{
	public static void main(String[] args){
		System.out.print("距離をマイルで入力してください>>");
		int mile = new Scanner(System.in).nextInt();

		double km = mileToKm(mile);
		System.out.printf("%dマイルはおよそ%.4f㎞です",mile,km);
	}

	//マイルをkmに変換するメソッド 引数にマイル、戻り値はkm
	public static double mileToKm(int mile){
		return mile * 1.60934;
	}
}
