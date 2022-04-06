import java.io.*;
import java.net.*;
public class Code3{
	public static void main(String[] args)throws Exception{
		URL u = new URL("http://book.impress.co.jp/");
		InputStream is = u.openStream();
		int i = is.read();
		while(i != -1){
			char c = (char)i;
			System.out.print(c);
			i = is.read();
		}
	}
}
