package home.work61;

public class MainClass {

	public static void main(String[] args) {
		Cart cart = new Cart();
		Customer customer = new Customer(cart);
		
		Product product1 = new Product("Bread", 13);
		Product product2 = new Product("Bread", 10);
		Product product3 = new Product("Semki", 10);
		Product product4 = new Product("Milk", 5);
		Product product5 = new Product("Milk", 5);

		if(customer.getCart()!=null) {
		customer.getCart().getInfo();
		System.out.println();

		customer.addProduct(product1);
		customer.addProduct(product2);
		customer.addProduct(product3);
		customer.addProduct(product4);
		customer.addProduct(product5);
		customer.getInfo();
		System.out.println();

		customer.getCart().deleteProductByName("Bread");
		customer.getInfo();
		} else {
			System.out.println("Customer dont have cart");
		}
	}

}
