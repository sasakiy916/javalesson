import java.util.*;
public class Code6{
	public static void main(String[] args){
		String name = new Scanner(System.in).nextLine();
		if(isValidPlayerName(name)){
			System.out.println(name + "です");
		}else{
			System.out.println("しっかり入力");
		}
	}
	public static boolean isValidPlayerName(String name){
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
}
