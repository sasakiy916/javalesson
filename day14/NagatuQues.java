import java.util.*;
public class NagatuQues{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		char[] words = {'A','B','C','D','E',};
		System.out.print("行数");
		int num = scan.nextInt();
		for(int i=0;i<num;i++){
			System.out.printf("%d:",i+1);
			int width = rnd.nextInt(10)+1;
			for(int j=0;j<width;j++){
				int index = rnd.nextInt(5);
				System.out.print(words[index]);
			}
			System.out.println();
		}
	}
}
