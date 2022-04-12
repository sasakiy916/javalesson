import java.util.*;
public class MethodLesson11{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("消費税は何%ですか？>>");
		int tax = scan.nextInt();
		int price = 0;
		int priceSum = 0;
		do{
			System.out.print("価格を入力(0でお会計)>");
			price = scan.nextInt();
			priceSum += price;
		}while(price != 0);
		int taxPrice = calcTaxPrice(priceSum, tax);
		System.out.printf("お買い物合計金額は%d円(税込み)です",taxPrice);
	}
	static int calcTaxPrice(int price, int tax){
		double taxPrice = (double)price*(1.0 + (double)tax/100);
		return (int)taxPrice;
	}
}
