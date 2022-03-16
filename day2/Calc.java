public class Calc{
	public static void main(String[] args){
		//""は文字列を作る
		System.out.println("3 + 3");
		System.out.println(3 + 3);//足し算
		System.out.println(3 - 3);//引き算
		System.out.println(4 * 3);//掛け算
		System.out.println(4 / 3);//商を求める
		System.out.println(4 % 3);//余りを求める
		System.out.println(7*(3+2)/3);//11
		System.out.println(7*3+5/3);//22
		System.out.println("hello" + "world");//文字列連結
		System.out.println("hello" + 3);//hello3
		System.out.println(2 + "hello" + 3);//2hello3
		//System.out.println(2 - "hello" + 3);//Javaでは文字列に使える演算子は+だけ
		System.out.println("hello" + 3 + 2 + "です");//答えは32です
		System.out.println(2.0 + 3.4);//5.4
		System.out.println(5.0 / 2);//2.5
		System.out.println(5.0 + "hello");//5.0hello
	}
}
