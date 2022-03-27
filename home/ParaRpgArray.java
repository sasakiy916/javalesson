import java.util.*;
public class ParaRpgArray{
	public static void main(String[] args){
		String[] name = {"HP","攻撃力","防御力","敏捷性","ボーナス"};
		int[] status = new int[name.length];
		Random random = new Random();
		while(true){
			int i = 0;
			System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
			for(String str:name){
				switch(str){
					case "HP":
						status[i] = random.nextInt(8)+12;
						break;
					case "攻撃力":
						status[i] = random.nextInt(5)+7;
						break;
					case "防御力":
						status[i] = random.nextInt(5)+7;
						break;
					case "敏捷性":
						status[i] = random.nextInt(5)+7;
						break;
					case "ボーナス":
						status[i] = random.nextInt(4);
						break;
				}
				System.out.println(str +":"+status[i]);
				i++;
			}
			System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
			System.out.print("これでok?(y or n)>>");
			String ans = new Scanner(System.in).next();
			if(ans.equals("y")){
				break;
			}else if(ans.equals("n")){
				continue;
			}else{
				System.out.println("y or n で答えてください。\nこれでok?(y or n)>>");
			}
		}
		while(status[name.length-1]!= 0){
			int i = 0;
			System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
			for(String str:name){
				System.out.println(str +":"+ status[i]);
				i++;
			}
			System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
			System.out.print("ボーナスポイントを振り分けます(ＨＰ:h、攻撃:a、防御:b、敏捷:c)>>");
			String bo = new Scanner(System.in).next();
			switch(bo){
				case "h":
					status[0]++;
					status[name.length-1]--;
					break;
				case "a":
					status[1]++;
					status[name.length-1]--;
					break;
				case "b":
					status[2]++;
					status[name.length-1]--;
					break;
				case "c":
					status[3]++;
					status[name.length-1]--;
					break;
			}
			if(status[name.length-1]==0){
				break;
			}
		}
		System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
		for(int i=0;i<name.length-1;i++){
			System.out.println(name[i] + ":" + status[i]);
		}
		System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
	}
} 
