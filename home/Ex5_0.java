public class Ex5_0{
	public static void main(String[] args){
		int sum;
		sum = add(100, 32);
		System.out.println(sum);

		int[] array = {1,2,3};
		System.out.println(array[0]);
		arrayMethod(array);
		System.out.println(array[0]);
	}

	public static int add(int x, int y){
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
		return ans;
	}

	public static void arrayMethod(int[] a){
		a[0] = 33;
	}
}
