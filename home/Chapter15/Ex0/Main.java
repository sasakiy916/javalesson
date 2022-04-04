import java.util.*;
import java.text.*;
import java.time.*;
import java.time.format.*;
public class Main{
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=100;i++){
			sb.append(i).append(",");
		}
		String s = sb.toString();
		String[] a = s.split(",");
		System.out.println(Arrays.toString(a));

		String folder = "c:¥javadev¥";
		String file = "readme.txt";
		System.out.println(concatPath(folder,file));
		Ex4();
		Ex5();
	}
	public static String concatPath(String folder,String file){
		if(!folder.endsWith("¥")){
			folder += "¥";
		}
		return folder + file;
	}

	public static void Ex4(){
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		c.set(Calendar.DAY_OF_MONTH,day+100);
		Date future = c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(fmt.format(future));
	}

	public static void Ex5(){
		LocalDate l = LocalDate.now();
		LocalDate ldatep = l.plusDays(100);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(ldatep.format(fmt));
	}
}
