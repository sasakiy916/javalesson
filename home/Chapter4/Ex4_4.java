import java.util.*;
public class Ex4_4{
	public static void main(String[] args){
		int[] numbers = {3,4,9};
		int counts = 0;

		System.out.println("1桁の数字を入力してください");
		int input = new Scanner(System.in).nextInt();

		for(int value: numbers){
			if(value == input){
				System.out.println("アタリ！");
				break;
			}
			counts++;
		}

		if(counts == numbers.length){
			System.out.println("ハズレ！");
		}
	}
}
