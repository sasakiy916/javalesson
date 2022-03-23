import java.util.*;

public class Gacha{
	public static void main(String[] args){
		/*SSR 5%
		 * SR 10%
		 * R 20%
		 * N 65%*/
		System.out.println("エンターキーを押してね");
		int seed = '佐' + '々' + '木' + '勇' + '二';
		new Scanner(System.in).nextLine();
		int r = new Random(seed).nextInt(100);

		if(r < 5){
			System.out.println("SSR!");
		}else if(r < 15){
			System.out.println("SR!");
		}else if(r <35){
			System.out.println("R");
		}else{
			System.out.println("N");
		}
	}
}
