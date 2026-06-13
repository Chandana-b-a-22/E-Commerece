package Ecommerce.BlinkitApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Ecommerce.BlinkitApp.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	


}
