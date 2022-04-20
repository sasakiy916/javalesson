import java.util.*;
import java.io.*;
public class FileLesson{
	public static void main(String[] args) throws Exception{
		//ファイルを読み込み
		FileInputStream fis = new FileInputStream("sample.txt");
		InputStreamReader isr = new InputStreamReader(fis,"utf-8");
		BufferedReader br = new BufferedReader(isr);

		//指定(もしくは新規)ファイルへ書き込み
		FileOutputStream fos = new FileOutputStream("newsample.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
		BufferedWriter bw = new BufferedWriter(osw);
	
		String line;
		//全部の行を読み込んで表示
		while((line = br.readLine()) != null){
			System.out.println(line);
			bw.write("★"+ line +"★");//装飾して書き込む
			bw.newLine();//新しい行に移動
		}
		br.close();//ファイルを閉じる
		bw.close();
	}
}
