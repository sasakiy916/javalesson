import java.util.*;
public class Enter{
	public static void main(String[] args){
		System.out.println("Enterだけ押すと「Enter押した」と表示してループ継続");
		System.out.println("q + Enterを押すと「終了します」と画面に表示してループ終了");

		//q + Enterするまでループする
		while(true){
			String sc = new Scanner(System.in).nextLine();
			//キーボードでq + Enter　を押したらbreak;
			if(sc.equals("q")){
				System.out.println("終了します");
				break;
			}
			System.out.print("Enter押した");
		}
	}
}
