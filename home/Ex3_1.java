public class Ex3_1{
	public static void main(String[] arg){
		int weight = 60;
		if(weight == 60){
			System.out.println("変数weightの値が60に等しい。");
		}

		int age1 = 10;
		int age2 = 7;
		if(age1 * age2 > 60){
			System.out.println("変数age1とage2の合計を2倍したものが60を超えている。");
		}

		int age = 1;
		if(age % 2 == 1){
			System.out.println("変数ageが奇数である。");
		}
		
		String name = "湊";
		if (name.equals("湊")){
			System.out.println("変数nameの中身の文字列が「湊」と等しい。");
		}
	}
}
