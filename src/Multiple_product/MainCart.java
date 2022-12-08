package Multiple_product;

public class MainCart {
    public static void main(String args []) {
    	Product mobile = new Product("samsung", 2, 15000);
    	Product laptop =new Product("hp",1,20000);
    	Product smartWatch = new Product("Boat",2, 1500);
    	Product headPhone = new Product("Boat", 3, 1500);
    	Product powerBank = new Product("mi", 1, 1000);
    	Product cable = new Product("samsung", 3, 150);
    	
    	
    	ShoppingCart sp = new ShoppingCart();
    	sp.addProduct(mobile);
    	sp.addProduct(powerBank);
    	sp.addProduct(cable);
    	sp.addProduct(laptop);
    	sp.addProduct(headPhone);
    	sp.addProduct(smartWatch);
    	
    	System.out.println( "Total price is "+sp.calculateTotalPrice());
    }
}

