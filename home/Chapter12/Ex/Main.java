public class Main{
	public static void main(String[] args){
		Y[] obj = new Y[2];
		obj[0] = new A();
		obj[1] = new B();

		for(Y y:obj){
			y.b();
		}
	}
}
