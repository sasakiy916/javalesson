import java.util.*;
import java.text.*;
public class Ex4{
	public static void main(String[] args){
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int day = c.get(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DAY_OF_MONTH,day+100);
		Date future = c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(fmt.format(future));
	}
}
