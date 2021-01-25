package javaComposicao.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import javaComposicao.model.enuns.OrderStatus;

public class Order {
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private OrderStatus status;

	private Client client;

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

}