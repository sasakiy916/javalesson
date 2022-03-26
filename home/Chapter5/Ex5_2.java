public class Ex5_2{
	public static void main(String[] args){
		email("先日の返事","sasaki3y98521j@gmail.com","昨日はたのしかったです。\nこちらこそありがとうございました。");
	}

	public static void email(String title, String address, String text){
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
}
