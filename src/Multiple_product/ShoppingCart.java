package Multiple_product;

public class ShoppingCart {
      private Product[] cart;
      private double totalPrice;
      private int storedProduct;
      
    public ShoppingCart() {
    	cart = new Product[5];
    }
    public ShoppingCart(int cartSize) {
    	cart = new Product[cartSize];
    }
    public void addProduct(Product input) {
    	if(storedProduct < cart.length) {
    		cart [storedProduct] = input;
    		storedProduct++;
    	}else {
    		System.out.println("cart size is 5");
    	}
    }
    public double calculateTotalPrice() {
    	for(int i=0;i<cart.length;i++) {
    		totalPrice += cart[i].getTotalPrice();
    	}
    	return totalPrice;
    }
	}
	

