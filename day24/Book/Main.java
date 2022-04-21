import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("本のページ数を入力>>");
		int page = scan.nextInt();
		System.out.print("本の価格を入力>>");
		int price = scan.nextInt();
		Book b = new Book(page,price);
		System.out.print("ノートのページ数を入力>>");
		page = scan.nextInt();
		System.out.print("ノートの価格を入力>>");
		price = scan.nextInt();
		NoteBook nb = new NoteBook(page,price);

		//機能の選択
		while(true){
			System.out.print("1. 本の情報表示 / 2. ノートの情報表示 / 3. ノートに追加書込 / 4.   終了>");
			int select = scan.nextInt();
			switch(select){
				case 1:
					b.show();
					break;
				case 2:
					nb.show();
					break;
				case 3:
					System.out.print("書き込む内容を入力して下さい >");
					String desc = scan.next();
					nb.write(desc);
					break;
				case 4:
					System.out.println("アプリケーションを終了します。");
					return;
				default:
					System.out.println("上記の番号から選んでください");
					break;
			}
		}
	}
}
