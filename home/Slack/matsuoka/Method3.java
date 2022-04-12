import java.util.*;
public class Method3{
	public static void main(String[] args){
		final int STUDENT=3;
		final int SUBJECT=5;
		int sumscores=0;
		Random rndscore=new Random();
		int[][] scores=new int[STUDENT][SUBJECT];
		//各行の先頭に出席番号1～3を格納、末尾には合計点を格納、それ以外に各教科のランダムな点数を格納。
		for(int i=0;i<scores.length;i++){
			scores[i][0]=i+1;
			sumscores=0;
			for(int j=1;j<scores[i].length-1;j++){
				scores[i][j]=rndscore.nextInt(100)+1;
				sumscores+=scores[i][j];
			}
			scores[i][scores[i].length-1]=sumscores;
		}
		/*
		 *ここから適切な処理を入力してください。*/
		System.out.println("ソート前");
		print(scores);

		System.out.printf("%sの点数が高い順に並び替え%n","国語");
		Sort2DArrayDescending(scores,2);
		print(scores);

		System.out.printf("%sの点数が高い順に並び替え%n","数学");
		Sort2DArrayDescending(scores,3);
		print(scores);
		
		System.out.printf("%sの点数が高い順に並び替え%n","英語");
		Sort2DArrayDescending(scores,4);
		print(scores);

		System.out.println("ソート前を表示");
		Sort2DArrayAscending(scores,1);
		print(scores);
		
	}

	//二次元配列を受け取り、表示させる。
	public static void print(int[][] data){
		System.out.println("出席番号|国語|数学|英語|合計|");
		for(int i=0;i<data.length;i++){
			System.out.print("　　");
			for(int j=0;j<data[i].length;j++){
				System.out.printf("%3d |",data[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	//二次元配列と列番号を受け取り、その列の数値を降順でソートする。
	public static void Sort2DArrayDescending(int[][] array,final int columnNumber){
		Arrays.sort(array, new Comparator<int[]>() {
			@Override
			public int compare(int[] first, int[] second) {
				if(first[columnNumber-1] < second[columnNumber-1]) return 1;
				else return -1;
			}
		});
	}

	//二次元配列と列番号を受け取り、その列の数値を昇順でソートする。
	public static void Sort2DArrayAscending(int[][] array,final int columnNumber){
		Arrays.sort(array, new Comparator<int[]>() {
			@Override
			public int compare(int[] first, int[] second) {
				if(first[columnNumber-1] > second[columnNumber-1]) return 1;
				else return -1;
			}
		});
	}
}
