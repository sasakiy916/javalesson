import java.util.*;
public class ArcherApp{
	public static void main(String[] args){
		int castleHp = 500;
		Random r = new Random();
		char[] suffix = {
			'A',
			'B',
			'C',
			'D',
			'E',
			'F',
			'G',
			'H',
			'I',
			'J',
		};
		Archer[] archers = new Archer[suffix.length];
		//攻略開始
		for(int i=0;i<suffix.length;i++){
			archers[i] = new Archer(suffix[i],r.nextInt(90)+10);
			castleHp = castleHp - archers[i].attack();
			System.out.printf(":城の耐久(%d)%n",castleHp);
			if(castleHp <= 0)break;
		}
		//攻略結果
		System.out.print("城の攻略に");
		if(castleHp <= 0){
			System.out.println("成功した！");
		}else{
			System.out.println("失敗した！");
		}
	}
}
