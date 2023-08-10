package DesignPattern;

public class BookMain {

	public static void main(String[] args) {
		
		
		
		Book book = new BookBuilder()
				.title("책")
				.author("나")
				.description("좋아요 부탁")
				.build();
				
		System.out.println(book.toString());
		
		
	}

}
