public class AnimalApp{
	public static void main(String[] args){
		Animal[] animals = {
			new Dog("タロ"),
			new Pig("ジロ"),
			new Cat("タマ"),
		};
		for(Animal a:animals){
			a.makeNoise();
			if(a instanceof Cat){
				((Cat)a).sleep();
			}
		}
	}
}

abstract class Animal{
	String name;
	Animal(String name){
		this.name = name;
	}
	abstract void makeNoise();
}

class Dog extends Animal{
	Dog(String name){
		super(name);
	}
	@Override
	void makeNoise(){
		System.out.println(this.name + "は吠えたワン！");
	}
}

class Pig extends Animal{
	Pig(String name){
		super(name);
	}
	@Override
	void makeNoise(){
		System.out.println(this.name + "は鳴いたブー！");
	}
}

class Cat extends Animal{
	Cat(String name){
		super(name);
	}
	@Override
	void makeNoise(){
		System.out.println(this.name + "は鳴いたニャー！");
	}
	void sleep(){
		System.out.println(this.name + "は眠った");
	}
}
