package Ecommerce.BlinkitApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.BlinkitApp.entity.Cart;
import Ecommerce.BlinkitApp.repository.CartRepository;

@Service
public class CartService {

	 @Autowired
	    private CartRepository cartRepository;

	    public List<Cart> getAllCartItems() {
	        return cartRepository.findAll();
	    }

	    public Cart addToCart(Cart cart) {
	        return cartRepository.save(cart);
	    }

	    public void deleteCartItem(Long id) {
	        cartRepository.deleteById(id);
	    }	


}
