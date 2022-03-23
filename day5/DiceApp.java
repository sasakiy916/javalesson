import java.util.*;

public class DiceApp{
	public static void main(String[] args){
		/*
		 * サイコロ降ってそれが偶数か奇数かを判定する
		 * (実行結果)
		 * 4は偶数です
		 * 1は奇数です*/
		int r = new Random().nextInt(6)+1;
		if(r % 2 = 0){
			System.out.println(r + "は偶数です");
		}else {
			System.out.println(r + "は奇数です");
		}
	}
}
