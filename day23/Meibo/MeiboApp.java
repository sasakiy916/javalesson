import java.io.*;
import java.util.*;
public class MeiboApp{
	public static void main(String[] args) throws Exception{
		ArrayList<Meibo> meibo = new ArrayList<>();
		//csvファイルを読み込む
		FileInputStream fis = new FileInputStream("dummy.csv");
		InputStreamReader isr = new InputStreamReader(fis,"sjis");
		BufferedReader br = new BufferedReader(isr);
		//csvファイルからMeiboインスタンス生成
		String labels = br.readLine();//一行目の見出し取得
		String line;
		while((line = br.readLine()) != null){
			String[] params = line.split(",");
			meibo.add(new Meibo(params[0],params[1],Integer.parseInt(params[2])));
		}
		br.close();//ファイルを閉じる
		//名簿表示
		System.out.println(labels);
		showList(meibo);
		System.out.println();
		sortList(meibo);
	}
	static void showList(ArrayList<Meibo> list){
		for(Meibo m:list){
			m.showInfo();
		}
	}
	static void sortList(ArrayList<Meibo> list){
		//年齢で降順ソート
		for(int i=0;i<list.size()-1;i++){
			for(int j=i+1;j<list.size();j++){
				if(list.get(i).age < list.get(j).age){
					Meibo temp = list.get(i);
					list.set(i,list.get(j));
					list.set(j,temp);
				}
			}
		}
		showList(list);
	}
}
class Meibo{
	String name;
	String email;
	int age;
	Meibo(String name,String email,int age){
		this.name = name;
		this.email = email;
		this.age = age;
	}
	void showInfo(){
		System.out.printf("%s[%s](%d)%n",this.name,this.email,this.age);
	}
}
