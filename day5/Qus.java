import java.util.*;

public class Ques{
	public static void main(String[] args){
		System.out.println("丁か半か(丁:0,半:1)");
		int chouhan = new Scanner(System.in).nextInt();
		int dice1 = new Random().nextInt(6)+1;
		int dice2 = new Random().nextInt(6)+1;

		int dice = (dice1 + dice2) % 2;
		if(){
		}else{
		}
		if(dice == chouhan){
			System.out.println("勝ち");
		}else{
			System.out.println("負け");
		}
	}
}
