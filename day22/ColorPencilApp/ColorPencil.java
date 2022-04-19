public class ColorPencil{
	//static field(静的変数 or クラス変数)
	static int totalDraw=0;
	String color;
	int length;
	//コンストラクタ
	ColorPencil(String color){
		this(color,5);
		this.color = color;
	}
	//コンストラクタのオーバーロード
	ColorPencil(String color, int length){
		this.color = color;
		this.length = length;
		showStatus();
	}
	//ステータス表示
	void showStatus(){
		System.out.print(this.color + ":");
		for(int i=0;i<this.length;i++){
			System.out.print("-");
		}
		System.out.println(">");
	}
	//描く
	void draw(){
		if(this.length<=0){
			System.out.println("もう描けません");
			return;
		}
		System.out.printf("%sで描いた%n",this.color);
		this.length--;
		totalDraw++;
		this.showStatus();
	}
	static int getTotalDraw(){
		return totalDraw;
	}
}
