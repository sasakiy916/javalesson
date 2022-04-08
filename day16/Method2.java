import java.util.*;
public class Method2{
	public static void main(String[] args){
		int[] data = {2,3,4};
		int total = sumOf(data);
		System.out.println(Arrays.toString(data));
		System.out.println("合計は:" + total);
		total = sumOf(new int[]{10,20,30});
		System.out.println("合計は:" + total);
		System.out.println("一番大きいのは:" + maxOf(4,7,1));
		hello();
		hello("佐々木");
		arrTwice(data);
		System.out.println(Arrays.toString(data));
		int[] arr = {1,2,3,4,5};
		arrShuffle(arr);
		System.out.println(Arrays.toString(arr));
	}

	//配列内の整数の合計値を出す
	public static int sumOf(int[] arr){
		int sum = 0;
		for(int n:arr){
			sum += n;
		}
		return sum;
	}

	//3つの値で一番大きい値を返す
	public static int maxOf(int a, int b, int c){
		return Math.max(a,Math.max(b,c));
	}

	//helloと画面に出力
	public static void hello(){
		System.out.println("Hello");
	}
	//helloメソッドのオーバーロード
	public static void hello(String name){
		hello();
		System.out.println(name);
	}
	public static void arrTwice(int[] arr){
		for(int i=0;i<arr.length;i++){
			arr[i] = arr[i]*2;
		}
	}
	//配列の中身をシャッフル
	public static void arrShuffle(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int idx = new Random().nextInt(arr.length-i)+i;
			int temp = arr[idx];
			arr[idx] = arr[i];
			arr[i] = temp;
		}
	}
}
