import java.time.*;
import java.time.format.*;
public class Ex5{
	public static void main(String[] args){
		LocalDate l = LocalDate.now();
		int day = l.getDayOfMonth();
		LocalDate ldatep = l.plusDays(100);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(ldatep.format(fmt));
	}
}
