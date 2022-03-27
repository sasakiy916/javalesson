public class BreakContinue{
	public static void main(String[] args){
		int i;
		for(i=0;i<5;i++){
			if(i!=0){//２回目以降のループでbreak;
				break;//i++ しないでfor文を抜ける
			}
			System.out.println("１回だけループ");
		}
		System.out.println("breakした場合："+i+"\n");

		for(i=0;i<5;i++){
			if(i!=0){//２回目以降のループでcontinue;
				continue;//i++ をしてfor文の最初に戻ってループ再開
			}
			System.out.println("一回だけ表示して後は無視される文章");
		}
		System.out.println("continueした場合"+i+"\n");
		System.out.println("両方とも一回だけ普通にループさせてます");
	}
}
