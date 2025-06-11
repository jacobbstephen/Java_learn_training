package bookShop_Catalogue_System.entity;

public class Book {
	private float price;
	private String title;
	private Author author;
	private Publisher publisher;
	private String category;
	public Book(String name, float price, Author author, Publisher publisher, String category) {
		this.price = price;
		this.title = name;
		this.author = author;
		this.publisher = publisher;
		this.category = category;
	}
	public float getPrice() {
		return price;
	}
	public String getTitle() {
		return title;
	}
	public Author getAuthor() {
		return author;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public String getCategory() {
		return category;
	}
	
	@Override
	public String toString() {
		return "Title: " + title + ", Author: " + author.getName() + ", Publisher: " + publisher.getName() + ", Category: " + category + ", Price: " + price; 
	}
	
	
}
