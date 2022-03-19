public class Code4_15{
	public static void main(String[] args){
		int[] arrayA = {1,2,3};
		int[] arrayB;
		int a = 0;
		int b;

		arrayB = arrayA;
		arrayB[0] = 100;
		arrayA[2] = 300;
		System.out.println(arrayA[0]);
		System.out.println(arrayB[2]);

		b = a;
		b = 20;
		System.out.println(a);
		System.out.println(b);
	}
}
