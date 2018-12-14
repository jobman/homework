package home.work61;

public class MainClass {

	public static void main(String[] args) {
		Cart cart = new Cart();
		Product product1 = new Product("Bread", 13);
		Product product2 = new Product("Bread", 10);
		Product product3 = new Product("Semki", 10);
		Product product4 = new Product("Milk", 5);
		Product product5 = new Product("Milk", 5);

		cart.getInfo();
		System.out.println();

		cart.addProduct(product1);
		cart.addProduct(product2);
		cart.addProduct(product3);
		cart.addProduct(product4);
		cart.addProduct(product5);
		cart.getInfo();
		System.out.println();

		cart.deleteProductByName("Bread");
		cart.getInfo();

	}

}
