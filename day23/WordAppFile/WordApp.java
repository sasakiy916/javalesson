import java.util.*;
import java.io.*;
public class WordApp{
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		//問題用意
		ArrayList<Word> list = new ArrayList<>();//問題インスタンス用のList
		//問題用テキストファイル読み込み
		FileInputStream fis = new FileInputStream("words.txt");
		InputStreamReader isr = new InputStreamReader(fis,"utf-8");
		BufferedReader br = new BufferedReader(isr);
		String line;//読み込み行を格納変数
		while((line = br.readLine()) != null){
			String[] params = line.split(",");//問題と答えを分ける
			list.add(new Word(params[0],params[1]));//問題のインスタンス作成
		}
		//出題
		for(int i=0;i<Word.total;i++){
			System.out.printf("%s>>",list.get(i).ja);
			String ans = scan.next();
			System.out.printf(list.get(i).check(ans)?"正解!%n":"不正解!%sの英単語は%s%n",list.get(i).ja,list.get(i).en);
		}
		System.out.printf("全%d問中%d問正解%n",Word.total,Word.correct);
	}
}
