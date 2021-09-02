package array;

public class Book {
	
	private String title;
	private String author;
	
	public Book() {}
	
	public Book(String title, String autor) {
		this.title = title;
		this.author = autor;
	}

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
	public void showBookInfo() {
		System.out.println(title + "," + author);
	}
}
