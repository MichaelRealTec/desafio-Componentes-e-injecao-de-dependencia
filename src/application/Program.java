package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Order;
import service.OrderService;
import service.ShippingService;

public class Program {

	public static void main(String[] args) {
		// Desafio - git@github.com:MichaelRealTec/desafio-Componentes-e-injecao-de-dependencia.git
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("(dados do pedido: código, valor básico, porcentagem de desconto)");
		Integer code = sc.nextInt();
		Double basic = sc.nextDouble();
		Double discount = sc.nextDouble();
		
		Order order = new Order(code, basic, discount);
		ShippingService shippingService = new ShippingService(order);
		OrderService orderService = new OrderService(order);
		
		System.out.println("Pedido código " + order.getCode());
		System.out.printf("Valor total: R$ %.2f", (orderService.total(order) + shippingService.shipment(order)));
		
		
		sc.close();
	}

}
