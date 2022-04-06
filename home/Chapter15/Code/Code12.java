import java.util.*;
public class Code12{
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		//6つのint値かたDateインスタンスを生成
		c.set(2019,8,22,1,23,45);
		c.set(Calendar.MONTH,9);
		Date d = c.getTime();
		System.out.println(d);
		//Dateインスタンスからint	値を生成
		Date now = new Date();
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");
	}
}
