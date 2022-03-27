import java.util.*;
public class RpgWhile{
	public static void main(String[] args){
		String name = "勇者";
		int hp = 100;
		int attack = 30;
		String eName = "スライム";
		int eHp = 50;
		int eAttack = 10;
		while(true){
			System.out.println("------------------------------------");
			System.out.println("現在のHP:" + hp);
			System.out.println("行動を決めて下さい");
			System.out.print("攻撃:a, 防御:b, 逃げる:c >>");
			switch(new Scanner(System.in).next()){
				case "a":
					System.out.println(name + "の攻撃！");
					System.out.println(eName + "に" + attack + "のダメージ");
					eHp -= attack;
					System.out.println(eName + "の攻撃！");
					System.out.println(name + "に" + eAttack + "のダメージ");
					hp -= eAttack;
					break;
				case "b":
					System.out.println(name + "は防御した！");
					System.out.println(eName + "の攻撃！");
					System.out.println(name + "に" + eAttack/2 + "のダメージ");
					hp -= eAttack / 2;
					break;
				case "c":
					System.out.println(name + "は逃げようとした！");
					System.out.println("しかし先回りされて逃げられなかった");
					System.out.println(eName + "の攻撃！");
					System.out.println(name + "に" + eAttack + "のダメージ");
					hp -= eAttack;
					break;
				default:
					System.out.println("行動を選択してください");
			}
			try{
				Thread.sleep(1*1000); 
			}catch(InterruptedException e){
			}
			if(hp<0){
				System.out.println(name + "はやられてしまった\nGameOver...");
				break;
			}else if(eHp<0){
				System.out.println(eName + "を倒した！\nClear!!");
				break;
			}
		}
	}
}
