public class Monkey{
	String name;
	int age;
	//挨拶
	public void hello(){
		System.out.printf("こんにちは%s(%d才)です。よろしく！%n",this.name,this.age);
	}
	//竹馬
	public void takeuma(){
		System.out.printf("%sは上手に竹馬にのった！%n",this.name);
	}
	//逆立ち
	public void sakadachi(){
		System.out.printf("%sはひょいと逆立ちをした！%n",this.name);
	}
}
