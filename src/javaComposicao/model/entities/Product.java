package javaComposicao.model.entities;

public class Product {
	private String name;
	private Double price;

	public Product() {
	}

	public Product(String productName, Double price) {
		setName(name);
		setPrice(price);
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Data product: \n");
		builder.append("---------------------------------\n");

		builder.append("Name: ");
		builder.append(this.getName() + "\n");

		builder.append("Price: ");
		builder.append(this.getPrice() + "\n");
		return builder.toString();
	}
}