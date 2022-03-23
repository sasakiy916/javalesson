import java.util.*;

public class Marry2{
	public static void main(String[] args){
		/*
		 * 女性16,男性18
		 * 32歳で女性のあなたは結婚できます
		 * 17歳で男性のあなたは結婚できません
		 */
		/*
		 * DRYの原則*/
		System.out.print("性別は(男性,女性)>>");
		String gender = new Scanner(System.in).next();
		System.out.print("年齢>>");
		int age = new Scanner(System.in).nextInt();

		boolean ok = true;
		boolean ok2 = true;
		if(gender.equals("男性")){
			if(age >= 18){
				ok = true;
			}else{
				ok = false;
			}
		}else if(gender.equals("女性")){
			if(age >= 16){
				ok = true;
			}else{
				ok = false;
			}
		}else{
			ok2 = false;
		}

		if(ok&&ok2){
			System.out.println(age + "歳で"+ gender +"のあなたは結婚できます");
		}else if(ok2){
			System.out.println(age + "歳で" + gender +"のあなたは結婚できません");
		}else{
			System.out.println("男性か女性かで入力してくだい");
		}
	}
}
