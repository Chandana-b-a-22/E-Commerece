package Ecommerce.BlinkitApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Ecommerce.BlinkitApp.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long>  {

	List<Cart> findAll();

	Cart save(Cart cart);

	void deleteById(Long id);

}
