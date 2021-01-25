package javaComposicao.model.entities;

public class OrderItem {
	private Integer quantity;
	private Product product;

	public OrderItem() {
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
}