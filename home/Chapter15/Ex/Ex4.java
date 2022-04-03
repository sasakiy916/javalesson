import java.util.*;
import java.text.*;
public class Ex4{
	public static void main(String[] args){
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		int day = c.get(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DAY_OF_MONTH,day+100);
		Date future = c.getTime();
		SimpleDateFormat f = new SimpleDateFormat("西暦YYYY年MM月dd日");
		String s = f.format(future);
		System.out.println(s);
	}
}
