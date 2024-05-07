package entities;

public class Product {
	private String name;
	private Double price;
	
	public Product() {
		
	}
	
	public Product(String n, Double p) {
		name = n;
		price = p;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static boolean staticPredicate(Product p) {
		return p.getPrice() >= 100.00;
	}
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
}
