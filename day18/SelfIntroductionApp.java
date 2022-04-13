import java.util.*;
public class SelfIntroductionApp{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String name;
		String[] statusName = {
			"体力",
			"魔力",
			"パワー",
			"きようさ",
			"すばやさ"
		};
		int[] status = new int[statusName.length];
		final int[] MAXSTATUS = {100,100,50,50,50};

		//名前を入力
		System.out.print("名前を入力してください>");
		name = scan.nextLine();
		//初期ステータス決定
		int seed = seed(name);
		status = decideStatus(seed,MAXSTATUS);
		System.out.println("初期ステータスが決定しました");
		printStatus(statusName,status);

		//種族を選択
		System.out.print("種族を選んでください 0…人間,1…ハイエルフ,2…トロル,3…ノーム>");
		int select = scan.nextInt();
		String race = raceBonus(status,select);
		printStatus(statusName,status);

		//職業を選択
		System.out.print("職業を選んでください 0…戦士,1…盗賊,2…僧侶,3…魔術師>");
		select = scan.nextInt();
		String job = jobBonus(status,select);
		printStatus(statusName,status);

		//自己紹介開始
		System.out.println("***作成成功!***");
		System.out.printf("私は%sの%s、%sです。",job,race,name);
		System.out.printf("能力値(%d)を高い順に並べると%n",calsStatusSum(status));
		sortStatus(statusName,status);
		for(int i=0;i<status.length;i++){
			System.out.printf("%s:%s%n",statusName[i],status[i]);
		}

		System.out.println("です。今後ともよろしく…。");
	}

	//ステータスの画面表示
	static void printStatus(String[] statusName,int[] status){
		String[] names = new String[statusName.length];
		for(int i=0;i<statusName.length;i++){
			names[i] = statusName[i] + ":" + status[i];
		}
		System.out.println(Arrays.toString(names));
	}

	//ステータスの合計値計算
	static int calsStatusSum(int[] status){
		int sum = 0;
		for(int s:status){
			sum += s;
		}
		return sum;
	}

	//能力値の並び替え
	static void sortStatus(String[] statusName,int[] status){
		for(int i=0;i<status.length-1;i++){
			for(int j=i+1;j<status.length;j++){
				if(status[i]<status[j]){
					int temp = status[i];
					status[i] = status[j];
					status[j] = temp;
					String tempSt = statusName[i];
					statusName[i] = statusName[j];
					statusName[j] = tempSt;
				}
			}
		}
	}
	//シード値決定
	static int seed(String name){
		int seed = 0;
		for(int i=0;i<name.length();i++){
			seed += name.charAt(i);
		}
		return seed;
	}

	//初期ステータス決定
	static int[] decideStatus(int seed, int[] MAXSTATUS){
		Random rnd = new Random(seed);
		int[] status = new int[MAXSTATUS.length];
		for(int i=0;i<status.length;i++){
			status[i] = rnd.nextInt(MAXSTATUS[i])+1;
		}
		return status;
	}

	//種族ボーナス加算
	static String raceBonus(int[] status, int select){
		String[] race = {"人間","ハイエルフ","トロル","ノーム"};
		int[][] bonus = {
			{10,10,10,10,10},
			{0, 20, 0,10,20},
			{30, 0,20, 0, 0},
			{10, 0, 0,25,20},
		};
		for(int i=0;i<bonus[select].length;i++){
			status[i] += bonus[select][i];
		}
		System.out.printf("%sのボーナスが適用されました!%n",race[select]);
		return race[select];
	}

	//職業ボーナス適用
	static String jobBonus(int[] status, int select){
		double[][] bonus = {
			{1.6,1  ,1.4,1  ,1  },
			{1.1,1  ,1.2,1.3,1.3},
			{1.3,1.5,1.1,1  ,1  },
			{1  ,1.9,1  ,1  ,1.1},
		};
		String[] jobs = {
			"戦士",
			"盗賊",
			"僧侶",
			"魔術師",
		};
		for(int i=0;i<bonus[select].length;i++){
			status[i] = (int)((double)status[i] * bonus[select][i]);
		}
		System.out.printf("%sのボーナスが適用されました!%n",jobs[select]);
		return jobs[select];
	}
}
