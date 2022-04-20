import java.util.*;
public class SlimeApp{
	public static void main(String[] args){
		ArrayList<Slime> slimes = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("ArrayListを使ってみよう！");
		System.out.println("Listにスライムを追加していってみよう。");
		while(true){
			System.out.print("スライムを追加する？(1…yes,2…no):");
			int select = scan.nextInt();
			if(select == 1){
				System.out.print("追加するスライムの名前を決めてね:");
				String name = scan.next();
				slimes.add(new Slime(name));
			}else if(select == 2){
				break;
			}
		}
		for(Slime slime:slimes){
			slime.attack();
		}
	}
}
class Slime{
	String name;
	Slime(String name){
		this.name = name;
		System.out.printf("%sが現れた！！%n",this.name);
	}
	void attack(){
		System.out.printf("%sの攻撃:5ポイントのダメージを与えた%n",this.name);
	}
}
