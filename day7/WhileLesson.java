import java.util.*;
public class WhileLesson{
	public static void main(String[] args){
		/*
			 int n = 5;
			 while(n > 0){
			 System.out.println(n);
			 n--;
			 }
			 System.out.println("発射！");
			 */
		int a = 5;
		boolean tf = a == 5;
		/*
			 System.out.println(tf);
			 int count = 0;
			 while(true){
			 count++;
			 int n = new Random().nextInt(10);
			 System.out.println(n);
			 if(n == 7){
			 break;
			 }
			 }
			 System.out.println(count + "回目に7がでました");
			 */

		/*
		 *SSR 1%
		 *SR 3%
		 *r 23%
		 *N 73%
		 */
		int count = 0;
		while(true){
			count++;
			int rmd = new Random().nextInt(100);
			if(rmd < 1){
				System.out.println("SSR!");
				break;
			}else if(rmd < 4){
				System.out.println("SR!");
			}else if(rmd < 27){
				System.out.println("R!");
			}else{
				System.out.println("N");
			}
		}
		System.out.print(count + "回目にSSRがでました");
	}
}
