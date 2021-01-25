package javaComposicao.model.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javaComposicao.model.enuns.OrderStatus;

public class Order {
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private OrderStatus status;

	private Client client;
	private List<OrderItem> items = new ArrayList<>();

	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
		setMoment(moment);
		setStatus(status);
		setClient(client);
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {
		this.items.add(item);
	}

	public void removeItem(OrderItem item) {
		this.items.remove(item);
	}

	public Double total() {
		Double sum = 0.0;
		for (OrderItem orderItem : items) {
			sum += orderItem.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append("Data Order\n");
		builder.append("---------------------------------\n");
		builder.append("Order date moment: ");
		builder.append("(" + dateFormat.format(moment) + ")\n");
		builder.append("Status - ");
		builder.append(this.status + "\n");
		builder.append(client + "\n");
		for (OrderItem orderItem : items) {
			builder.append(orderItem + "\n");
		}
		builder.append("Total: ");
		builder.append(total() + "\n");
		return builder.toString();
	}
}