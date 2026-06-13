package Ecommerce.BlinkitApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.BlinkitApp.entity.Order;
import Ecommerce.BlinkitApp.repository.OrderRepository;


@Service
public class OrderService {

	 @Autowired
	    private OrderRepository orderRepository;

	    public List<Order> getAllOrders() {
	        return orderRepository.findAll();
	    }

	    public Order saveOrder(Order order) {
	        return orderRepository.save(order);
	    }
}
