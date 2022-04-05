import java.util.*;
import java.text.*;
public class Main{
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
		String s;
		for(int i=1;i<=100;i++){
			sb.append(i);
			sb.append(",");
		}
		s = sb.toString();
		System.out.println(s);
		String[] a = s.split(",");
		System.out.println(Arrays.toString(a));

		String folder = "c¥javadev";
		String file = "readme.txt";
		System.out.println(concatPath(folder,file));
	}
	public static String concatPath(String folder,String file){
		if(folder.endsWith("¥")){
			return folder + file;
		}
		return folder + "¥" + file;
	}
}
