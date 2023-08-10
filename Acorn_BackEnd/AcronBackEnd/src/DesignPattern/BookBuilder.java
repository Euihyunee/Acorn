package DesignPattern;



public  class BookBuilder{

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