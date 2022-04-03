import java.util.*;
public class Ex2{
	public static void main(String[] args){
		String folder = "c:¥javadev¥";
		String file = "readme.txt";
		String[] ff = folder.split("[¥¥]");
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<ff.length;i++){
			sb.append(ff[i]).append("¥");
		}
		String s = sb.append(file).toString();
		System.out.println(s);
	}

}
