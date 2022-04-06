import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		System.out.println("プログラムが起動しました");
		throw new IOException();

		//try{
		//	String s = null;
		//	System.out.println(s.length());
		//}catch(NullPointerException e){
		//	System.out.println("NullPointerException 例外をcatchしました");
		//	System.out.println("--スタックトレース(ここから)--");
		//	e.printStackTrace();
		//	System.out.println("--スタックトレース(ここまで)--");
		//}
		//
		//try{
		//	String san = "3";
		//	int a = Integer.parseInt(san);
		//	System.out.println(san);
		//}catch(NumberFormatException e){
		//	System.out.println("NumberFormatException例外をcatchしました"); 
		//	e.printStackTrace();
		//}
	}
}
