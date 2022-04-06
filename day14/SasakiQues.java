import java.util.*;
public class SasakiQues{
	public static void main(String[] args){
		int[] arrA = new int[3];
		int[] arrB = arrA;
		int[] arrC = arrB;
		arrB[0] = 5;
		arrC[0] = 10;
		arrA[2] = 15;

		System.out.println(arrA[0]);
		System.out.println(arrB[0]);
		System.out.println(arrC[0]);
	}
}
