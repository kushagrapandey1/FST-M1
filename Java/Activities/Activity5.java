package activities;

abstract class Book{
	String title;
	abstract void setTitle(String str);
	String getTitle() {
		return title;
	}
}	
class MyBook extends Book{
	void setTitle(String str) {
		title = str;
	}
}	
public class Activity5 {
	public static void main(String[] args) {
		String title = "'Leader Without a Title'";
		MyBook newNovel = new MyBook();
		newNovel.setTitle(title);
		System.out.println("Title of Novel is "+ newNovel.getTitle());

	}

}
