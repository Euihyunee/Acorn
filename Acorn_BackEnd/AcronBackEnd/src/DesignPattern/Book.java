package DesignPattern;

public class Book {

	// 필드
	private String title;
	private String author; 
	private String description;
	
	
	// 생성자 
	public Book() {}
	
	public Book(String title, String author, String description) {
		super();
		this.title = title;
		this.author = author;
		this.description = description;
	}



	// toString Override
	@Override
	public String toString() {
		return String.format("Book(title=%s, author=%s, description=%s"
				, this.title, this.author, this.description);
	}
	public static class BookBuilder{
		
		private String title; 
		private String author; 
		private String description;
		
		public BookBuilder(){}
		public BookBuilder title(String title){
			this.title = title;
			return this;
		}
		public BookBuilder author(String author){
			this.author = author;
			return this;
		}
		public BookBuilder description(String description){
			this.description = description;
			return this;
		}
		public Book build() {
			return new Book(title, author, description);
		}
	}
	public static BookBuilder builder() {
		return new BookBuilder();
	}


}
