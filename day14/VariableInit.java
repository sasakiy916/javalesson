import java.util.*;
public class VariableInit{
	public static void main(String[] args){
		//初期化されてないからエラー
		//int n;

		//ifの中で初期化しようとしてる。条件式に変数がある場合は初期化されない可能性があるためエラー
		//int n;
		//int x = 5;
		//if(x>0){
		//	n = 10;
		//}

		//if~else文はどちらか一方を通ることを保証されているのでOK
		//int n;
		//int x =5;
		//if(x>0){
		//	n=10;
		//}else{
		//	n=10;
		//}

		//if~elseifは条件によってはどちらも通らない可能性があるためエラー
		//int n;
		//int x = 5;
		//if(x>0){
		//}else if(x<=0){
		//	n=20;
		//}

		//elseが最後にあるのでどれか一つは絶対通るのでOK
		//int n;
		//int x=5;
		//if(x>0){
		//	n=10;
		//}else if(x<0){
		//	//n=20;
		//	//初期化のための処理が無い場合はエラーが起きる
		//}else{
		//	n=30;
		//}

		//dafaultあればOK、無い場合はどこも通らない場合があるためエラー
		//int n = new Random().nextInt(3);
		//String fortune;
		//switch(n){
		//	case 0:
		//		fortune = "大吉";
		//		break;
		//	case 1:
		//		fortune = "中吉";
		//		break;
		//	case 2:
		//		fortune = "吉";
		//		break;
		//	default:
		//		fortune = "凶";
		//}

		//trueなら絶対通るＯＫ。booleanの変数にした場合はＮＧ
		//int n;
		//if(true){
		//	n=10;
		//}

		//OK
		//int n;
		//do{
		//	n=10;
		//}while(false);

		//OK.条件文が無いため
		//int n;
		//for(;;){
		//	n=3;
		//	break;
		//}

		//NG.条件式に変数を使ってる
		//int n;
		//for(int i=0;i<10;i++){
		//	n=3;
		//}

		//System.out.println(n);
	}
}
