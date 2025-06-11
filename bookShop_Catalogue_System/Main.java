package bookShop_Catalogue_System;

import bookShop_Catalogue_System.catalogue.Catalogue;
import bookShop_Catalogue_System.entity.Author;
import bookShop_Catalogue_System.entity.Book;
import bookShop_Catalogue_System.entity.Publisher;
import bookShop_Catalogue_System.exceptions.BookShopException;

public class Main {

	public static void main(String[] args) {
		Author a1 = new Author("Jacob", "Trivandrum");
		Publisher p1 = new Publisher("XYZ publisher", "Kerala");
		Book b1 =  new Book("Thinking Habits", 150, a1, p1, "Motivational"); 
		
		Author a2 = new Author("Jeev", "Kollam");
		Publisher p2 = new Publisher("j4jeev publisher", "Kerala");
		Book b2 = new Book("Atomic Habits", 200, a2, p2, "Life changing books");
		
		
		Book b3 =  new Book("ReWork ", 170, a1, p1, "Life changing books"); 
		
		Book b4 = new Book("Do it today", 145, a2, p2, "Motivational");
		
		
		try {
			Catalogue catalogue = new Catalogue();
			catalogue.addBook(b1);
			catalogue.addBook(b2);
			catalogue.addBook(b3);
			catalogue.addBook(b4);
			System.out.println("Search by Author");
			for(Book b: catalogue.searchByAuthor("jacob")) {
				System.out.println(b);
			}
			
		}catch(BookShopException e) {
			System.err.println(e.getMessage());
		}

	}

}
