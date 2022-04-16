import java.util.*;
public class MonkeyApp{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int select;
		Monkey monkey = new Monkey();
		System.out.print("おさるの名前を決めてください:>");
		monkey.name = scan.nextLine();
		System.out.print("おさるの歳を決めてください:>");
		monkey.age = scan.nextInt();
		do{
			System.out.print("おさるに何をさせますか？1…挨拶、2…竹馬、3…逆立ち、4…終了>");
			select = scan.nextInt();
			switch(select){
				case 1:
					monkey.hello();
					break;
				case 2:
					monkey.takeuma();
					break;
				case 3:
					monkey.sakadachi();
					break;
			}
		}while(select != 4);
		System.out.println("アプリケーションを終了します。");
	}
}
