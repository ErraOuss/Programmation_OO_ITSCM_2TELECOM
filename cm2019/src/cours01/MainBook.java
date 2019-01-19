package cours01;

public class MainBook {

	public static void main(String[] args) {
		Book book1 = new Book("A la recherche du temps perdu","Proust",1800);
		
		//Book book2 = new Book("Le trône de fer", "George R. R. Martin",1900);
		Book book2 = new Book();
		book2.setTitle("Le trône de fer");
		book2.setAuthor("George R. R. Martin");
		book2.setPage(1900);
		
		System.out.println("Title = "+ book2.getTitle()+" Author = "+book2.getAuthor()+" Page = "+book2.getPage());
		System.out.println(book1);
		
	}

}