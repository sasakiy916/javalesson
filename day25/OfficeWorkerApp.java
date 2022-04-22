import java.util.*;
public class OfficeWorkerApp{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		//配属人数
		int num = 3;
		System.out.println("あなたの部下に" + num + "人配属されました");
		OfficeWorker[] workers = new OfficeWorker[num];
		//名前決めとインスタンス生成
		for(int i=0;i<num;i++){
			System.out.println((i+1) + "人目の名前を入力してください>");
			String name = scan.next();
			int rndWorker = rnd.nextInt(num);
			switch(rndWorker){
				case 0:
					workers[i] = new OrdinaryOfficeWorker(name);
					break;
				case 1:
					workers[i] = new EliteOfficeWorker(name);
					break;
				case 2:
					workers[i] = new LazyOfficeWorker(name);
					break;
			}
			workers[i].introduce();
		}

		//働きぶり
		while(true){
			System.out.printf("誰の働きぶりを見に行きますか?%n");
			for(int i=0;i<workers.length;i++){
				System.out.println(i + "・・・" + workers[i].name);
			}
			System.out.println(workers.length + "・・・終了");
			System.out.print("番号を入力してください>");
			int select = scan.nextInt();
			switch(select){
				case 0:
				case 1:
				case 2:
					workers[select].work();
					break;
				case 3:
					System.out.println("アプリケーションを終了します。");
					return;
			}
		}
	}
}

abstract class OfficeWorker{
	String name;
	OfficeWorker(String name){
		this.name = name;
	}
	public void introduce(){
		System.out.println("初めまして、私は" + this.name + "です。");
	}
	public abstract void work();
}

class OrdinaryOfficeWorker extends OfficeWorker{
	OrdinaryOfficeWorker(String name){
		super(name);
	}
	@Override
	public void work(){
		System.out.println(this.name + "Johnは仕事がはやい！しかも正確だ。");
	}
}

class EliteOfficeWorker extends OfficeWorker{
	EliteOfficeWorker(String name){
		super(name);
	}
	@Override
	public void work(){
		System.out.println(this.name + "は９時から５時まで働いている。遅刻や欠勤はない");
	}
}

class LazyOfficeWorker extends OfficeWorker{
	LazyOfficeWorker(String name){
		super(name);
	}
	@Override
	public void work(){
		System.out.println(this.name + "GeorgeはPCの画面を即座に切り替えた。何をしていたのだろう。");
	}
}
