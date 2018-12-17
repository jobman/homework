package home.work61;

public class Customer {
	private Cart cart;
	Customer(Cart cart)
	{
		this.cart=cart;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	public void getInfo() {
		if(cart!=null) {
		System.out.println("Customer info: ");
		cart.getInfo();
		} else {
			System.out.println("Customer dont have a cart");
		}
	}
	
	public void addProduct(Product product) {
		if(cart!=null) {
			cart.addProduct(product);
		} else {
			getInfo();
		}
	}
	
	public Cart giveCart() {
		Cart temp = cart;
		cart=null;
		return temp;
	}
	
}
