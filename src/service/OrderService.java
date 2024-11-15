package service;

import entities.Order;

public class OrderService {
	// Atributo
	private Order order;
	
	// Método Construtor
	public OrderService(Order order) {
		this.order = order;
	}
	
	// Método
	public double total(Order order) {
		return order.getBasic() - order.getBasic() * (order.getDiscount() / 100);
	}
	
}
