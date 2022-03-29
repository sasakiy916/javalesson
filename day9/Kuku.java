import java.util.*;
public class Kuku{
	public static void main(String[] args){
		System.out.print("START>>");
		int start = new Scanner(System.in).nextInt();
		System.out.print("END>>");
		int end = new Scanner(System.in).nextInt();
		for(int i=start;i<=end;i++){
			for(int j=1;j<=9;j++){
				System.out.printf("%d*%d=%2d ",i,j,i*j);
			}
			System.out.println();
		}
	}
}
