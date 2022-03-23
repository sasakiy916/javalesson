import java.util.*;

public class Ques{
	public static void main(String[] args){
		System.out.print("丁か半か(丁:0,半:1)>>");
		int chouhan = new Scanner(System.in).nextInt();
		int dice1 = new Random().nextInt(6)+1;
		int dice2 = new Random().nextInt(6)+1;

		int dice = (dice1 + dice2) % 2;
		System.out.print("出目 " + dice1 + ":" + dice2 + " 結果は ");
		if(dice == 0){
			System.out.println("丁");
		}else{
			System.out.println("半");
		}
		if(dice == chouhan){
			System.out.println("当たり！！");
		}else{
			System.out.println("ハズレ！！");
		}
	}
}
