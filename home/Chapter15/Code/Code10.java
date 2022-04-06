import java.util.*;
public class Code10{
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		//ここで何らかの時間がかかる処理
		while(true){
			String sc = new Scanner(System.in).nextLine();
			if(sc.equals("q")){
				break;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は・・・" + (end - start) + "ミリ秒でした");
	}
}
