package javaComposicao.model.entities;

public class OrderItem {
	private Integer quantity;
	private Product product;

	public OrderItem() {
	}

	public OrderItem(Integer quantity, Product product) {
		setQuantity(quantity);
		setProduct(product);
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double subTotal() {
		return this.quantity * this.product.getPrice();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("---------------------------------\n");
		builder.append("Data Order Item: \n");
		builder.append("---------------------------------\n");
		builder.append("Product name: ");
		builder.append(this.product.getName() + "\n");
		builder.append("Product price: ");
		builder.append(this.product.getPrice() + "\n");
		builder.append("Quantity: ");
		builder.append(this.getQuantity() + "\n");
		builder.append("Subtotal: ");
		builder.append(this.subTotal() + "\n");
		return builder.toString();
	}

}