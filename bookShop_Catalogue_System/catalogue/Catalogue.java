package bookShop_Catalogue_System.catalogue;

import bookShop_Catalogue_System.entity.Book;
import bookShop_Catalogue_System.exceptions.AuthorNotFoundException;
import bookShop_Catalogue_System.exceptions.BookNotFoundException;
import bookShop_Catalogue_System.exceptions.BookStorageFullException;
import bookShop_Catalogue_System.exceptions.PublisherNotFoundException;

public class Catalogue implements BookService {
	private int MAX_BOOKS = 10;
	private Book[] books = new Book[MAX_BOOKS];
	private int count = 0;
	
	
	public void addBook(Book book) throws BookStorageFullException{
		if(count < MAX_BOOKS) books[count++] = book;
		else throw new BookStorageFullException("Storage full!! Cannot add the book to the store");
	}
	
	public Book[] trimArray(Book array[], int size) {
			Book[] trimmed = new Book[size];
			for(int i = 0; i < size; i++) {
				trimmed[i] = array[i];
			}
			return trimmed;
	}
	
	public Book[] searchByAuthor(String authorName) throws AuthorNotFoundException {
		Book[] result =  new Book[MAX_BOOKS];
		int resultCount = 0;
		for(int i = 0; i < count; i++) {
			if(books[i].getAuthor().getName().equalsIgnoreCase(authorName)) {
				result[resultCount++] = books[i];
			}
		}
		
		if(resultCount == 0) throw new AuthorNotFoundException("No books found for this author: " + authorName);
		return trimArray(result, resultCount);
	}
	
	public Book[] searchByTitle(String title) throws BookNotFoundException {
		Book[] result =  new Book[MAX_BOOKS];
		int resultCount = 0;
		for(int i = 0; i < count; i++) {
			if(books[i].getTitle().equalsIgnoreCase(title)) {
				result[resultCount++] = books[i];
			}
		}
		
		if(resultCount == 0) throw new BookNotFoundException("No books found for this title: " + title);
		return trimArray(result, resultCount);
	}
	
	public Book[] searchByCategory(String category)throws BookNotFoundException {
		Book[] result =  new Book[MAX_BOOKS];
		int resultCount = 0;
		for(int i = 0; i < count; i++) {
			if(books[i].getCategory().equalsIgnoreCase(category)) {
				result[resultCount++] = books[i];
			}
		}
		
		if(resultCount == 0) throw new BookNotFoundException("No books found for this category: " + category);
		return trimArray(result, resultCount);
	}
	
	public Book[] searchByPublisher(String publisher) throws PublisherNotFoundException{
		Book[] result =  new Book[MAX_BOOKS];
		int resultCount = 0;
		for(int i = 0; i < count; i++) {
			if(books[i].getPublisher().getName().equalsIgnoreCase(publisher)) {
				result[resultCount++] = books[i];
			}
		}
		
		if(resultCount == 0) throw new PublisherNotFoundException("No books found for this publisher: " + publisher);
		return trimArray(result, resultCount);
	}
	
}
