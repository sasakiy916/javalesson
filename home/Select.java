import java.util.*;
public class Select{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//選択肢用意
		String[] menus = {"頑張れ","頑張る","頑張った","終わった"};
		while(true){
			//選択肢表示
			for(int i=0;i<menus.length;i++){
				System.out.printf("%s:%d%n",menus[i],i);
			}
			System.out.print("選択肢を数字で選ぶ>>");
			int select = scan.nextInt();
			switch(select){
				case 0:
					System.out.println("頑張れ");
					break;
				case 1:
					System.out.println("頑張る");
					break;
				case 2:
					System.out.println("頑張った");
					break;
				case 3:
					System.out.println("終わった");
					return;
			}
			System.out.println();
		}
	}
}
