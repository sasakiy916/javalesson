import java.util.*;
public class Question{
	public static void main(String[] args){
		/*
		 *好きな数字を選んでください(1~3)
		 */

		System.out.print("好きな数字を選んでください(1~10)>>");
		int number = new Scanner(System.in).nextInt();
		System.out.println();
		
		String yoku;
		if(number > 10){
			yoku = "あなたは欲張りな人間です。";
		}else if(number > 0){
			yoku = "あなたはとても良い人間です";
		}else{
			yoku = "あなたは欲がなさすぎます。";
		}

		System.out.println(yoku);
		System.out.println("\nこれはあなたの欲深さを占うモノです。\n適度な欲は心を豊かにしますが、多すぎても少なすぎてもダメです。");
	}
}
