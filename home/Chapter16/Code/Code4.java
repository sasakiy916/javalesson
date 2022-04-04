import java.util.*;
public class Code4{
	public static void main(String[] args){
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		for(String s:colors){
			System.out.print(s+"→");
		}
	}
}
