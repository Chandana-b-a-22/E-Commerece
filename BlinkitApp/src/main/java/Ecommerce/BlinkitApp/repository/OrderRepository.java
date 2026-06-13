package Ecommerce.BlinkitApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Ecommerce.BlinkitApp.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
