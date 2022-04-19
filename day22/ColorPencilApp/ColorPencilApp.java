import java.util.*;
public class ColorPencilApp{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//何本
		System.out.print("何本>>");
		int num = scan.nextInt();
		//使う色と長さ
		ColorPencil[] pencils = new ColorPencil[num];
		for(int i=0;i<pencils.length;i++){
			System.out.print("色>>");
			String color = scan.next();
			System.out.print("長さ>>");
			int length = scan.nextInt();
			pencils[i] = new ColorPencil(color,length);
		}
		//どの色で描く?
		while(true){
			System.out.println();
			//選択肢
			for(int i=0;i<pencils.length;i++){
				System.out.printf("%d:%s%n",i,pencils[i].color);
			}
			System.out.printf("%d:描いた長さのtotalを見る%n",pencils.length+1);
			System.out.printf("%d:終了%n",pencils.length+2);
			System.out.print("何で描く>>");
			int select = scan.nextInt();
			//選択結果
			if(select < 0 || select > pencils.length+2){
				System.out.println("その色はありません");
			}else if(select < pencils.length){
					pencils[select].draw();
			}else if(select == pencils.length+1){
				System.out.printf("描いたTOTALは%dです%n",ColorPencil.getTotalDraw());
			}else if(select == pencils.length+2){
				System.out.println("終了");
				return;
			}
		}
	}
}
