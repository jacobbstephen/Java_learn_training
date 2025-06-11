package bookShop_Catalogue_System.entity;

public class Author {
	private String name;
	private String address;
	
	public Author(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}

	
}
