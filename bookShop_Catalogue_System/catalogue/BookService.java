package bookShop_Catalogue_System.catalogue;

import bookShop_Catalogue_System.entity.Book;
import bookShop_Catalogue_System.exceptions.AuthorNotFoundException;
import bookShop_Catalogue_System.exceptions.BookNotFoundException;
import bookShop_Catalogue_System.exceptions.PublisherNotFoundException;

public interface BookService  {
	Book[] searchByAuthor(String authorName) throws AuthorNotFoundException;
	Book[] searchByTitle(String title) throws BookNotFoundException;
	Book[] searchByCategory(String category) throws BookNotFoundException;
	Book[] searchByPublisher(String publisher) throws PublisherNotFoundException;
}
