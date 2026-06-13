package Ecommerce.BlinkitApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "orders")
public class Order {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String productName;
	    private int quantity;
	    private double totalAmount;

	    public Order() {
	    }

	    public Order(String productName, int quantity, double totalAmount) {
	        this.productName = productName;
	        this.quantity = quantity;
	        this.totalAmount = totalAmount;
	    }

	    public Long getId() {
	        return id;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public double getTotalAmount() {
	        return totalAmount;
	    }

	    public void setProductName(String productName) {
	        this.productName = productName;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

	    public void setTotalAmount(double totalAmount) {
	        this.totalAmount = totalAmount;
	    }	

}
