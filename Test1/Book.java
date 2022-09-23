package Test1;

public class Book {


	String title = "총균쇠";
	String author = "제러드";
	String publisher = "코스모";


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	Book(){}
		Book(String title, String author, String publisher){
			this.title = title;
			this.author = author;
			this.publisher = publisher;
		}

	

}




