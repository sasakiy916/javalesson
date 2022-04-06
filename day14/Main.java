import java.util.*;
public class Main{
	public static void main(String[] args){
		int a = 10;
		int b = a;
		b++;
		System.out.println(a);
		System.out.println(b);

		int[] arrA = {2,3};
		int[] arrB = arrA;
		arrB[0]++;
		System.out.println(arrA[0]);
		System.out.println(arrB[0]);
	}
}
