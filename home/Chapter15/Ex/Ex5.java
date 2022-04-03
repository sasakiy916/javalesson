import java.util.*;
import java.time.*;
import java.time.format.*;
public class Ex5{
	public static void main(String[] args){
		LocalDate i = LocalDate.now();
		//LocalDate ldate = i.getDayOfMonth();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		LocalDate ldatep = i.plusDays(100);
		String s = ldatep.format(fmt);
		System.out.println(s);
	}
}
