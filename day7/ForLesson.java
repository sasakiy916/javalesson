import java.util.*;
public class ForLesson{
	public static void main(String[] args){
		for(int i=0;i<5;i++){
			System.out.println(i);
		}
		int sum = 0;
		for(int i=10;i<=1000;i++){
			sum += i;
		}
		System.out.println(sum);
		for(int i=10;;i--){
			System.out.println(i);
		}

	}
}
