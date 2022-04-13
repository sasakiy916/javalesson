import java.util.*;
public class MethodDice{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//A~Mまで用意
		String[] suffix = {"A","B","C","D","E","F","G","H","I","J","K","L","M",};
		//人数とサイコロを振る回数確認
		System.out.print("何人>");
		int num = scan.nextInt();
		System.out.print("何回ふる>");
		int numDice = scan.nextInt();

		//サイコロ振った出目と合計を表示
		int[] resultDice = new int[num];//出目の合計を入れる
		String winPeople = "";//勝者の名前
		for(int i=0;i<num;i++){
			int[] dices = dice(numDice);
			int diceSum = diceSum(dices);
			System.out.printf("%sさん:%s 合計:%d%n",suffix[i],Arrays.toString(dices),diceSum);
			resultDice[i] = diceSum;
		}

		//勝敗引き分け表示
		boolean[] Wins = WinDice(resultDice);
		int count = 0;//勝者数カウント
			//勝敗確認
		for(int i=0;i<Wins.length;i++){
			if(Wins[i]){
				if(count!=0){
					winPeople += ",";
				}
				winPeople += suffix[i] + "さん";
				count++;
			}
		}
			//勝敗表示
		if(count == 0 || count == Wins.length){
			System.out.println("引き分け");
		}else{
			System.out.printf("%sの勝ち",winPeople);
		}
	}

	//サイコロを回数分振った出目を配列で返す
	static int[] dice(int numDice){
		Random r = new Random();
		int[] diceNums = new int[numDice];
		for(int i=0;i<numDice;i++){
			diceNums[i] = r.nextInt(6)+1;
			//diceNums[i] = 1;
		}
		return diceNums;
	}

	//サイコロの出目合計を計算
	static int diceSum(int[] diceNums){
		int sum = 0;
		for(int n:diceNums){
			sum += n;
		}
		return sum;
	}

	//出目の一番大きい人が勝ち(trueになる)
	static boolean[] WinDice(int[] diceSums){
		boolean[] WinDices = new boolean[diceSums.length];
		int max = 0;
		for(int i=0;i<diceSums.length;i++){
			if(max < diceSums[i]){
				max = diceSums[i];
			}
		}
		for(int i=0;i<WinDices.length;i++){
			if(max == diceSums[i]){
				WinDices[i] = true;
			}
		}
		return WinDices;
	}
}
