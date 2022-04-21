public class Book{
	int page;
	int price;
	public Book(int page, int price){
		this.page = page;
		this.price = price;
	}
	public void show(){
		System.out.printf("ページ数:%d%n",this.page);
		System.out.printf("価格:%d%n",this.price);
	}
}
class NoteBook extends Book{
	String desc = "";
	public NoteBook(int page,int price){
		super(page,price);
	}
	@Override
	public void show(){
		super.show();
		System.out.printf("内容:%s%n",this.desc);
	}
	public void write(String desc){
		this.desc += desc;
	}
}
