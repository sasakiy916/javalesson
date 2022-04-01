import java.util.*;
public class StringEnglish{
	public static void main(String[] args){
		System.out.print("英文>>");
		String english = new Scanner(System.in).nextLine();
		for(int i=0;i<english.length();i+=5){
			String str = english.substring(i,Math.min(i+5,english.length()));
			System.out.println(str);
		}
	}
}
