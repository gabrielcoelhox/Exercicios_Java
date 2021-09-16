package entities;

import java.util.Date;

import entities.enums.OrderStatus;
import entities.OrderItem;

public class Order {

	private Date moment;
	private OrderStatus status;
	
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
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

	public void addItem(OrderItem : item) {
		
	}
	
	public void removeItem(OrderItem : item) {
		
	}
	
	public double total() {
	}
}
