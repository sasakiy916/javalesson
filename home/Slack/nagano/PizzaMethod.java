import java.util.*;
public class PizzaMethod{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Mサイズのピザを注文(1枚または２枚)>");
		int num = scan.nextInt();
		recommend(num);
	}
	static void recommend(int num){
		System.out.printf("Mサイズを%d枚ですね%n",num);
		if(num == 2){
			System.out.printf("Mサイズ１枚1000円314cm,%nLサイズ1枚1500円706cmなのでLサイズをおすすめします%n");
		}
	}
}
