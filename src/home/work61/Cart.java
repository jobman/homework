package home.work61;


public class Cart {

	private Product[] setOfProducts = new Product[10];
	private int countOfProducts;

	public void addProduct(Product product) {
		if (countOfProducts < 10) {
			for (int i = 0; i < setOfProducts.length; i++) {
				if (setOfProducts[i] == null) {
					setOfProducts[i] = product;
					countOfProducts++;
					break;
				}
			}
		} else {
			System.out.println("Error");
		}
	}

	public void getInfo() {
		int total = 0;
		if(countOfProducts>0) {
			for (int i = 0; i < setOfProducts.length; i++) {
				if (setOfProducts[i] != null) {
					setOfProducts[i].getInfo();
					//System.out.println(setOfProducts[i].getName());
					total+=setOfProducts[i].getPrice();
				}
			}
		} else {
			System.out.println("Empty cart");
		}
		System.out.println("Total: "+total);
	}

	public void deleteProductByName(String name) {
		for (int i = 0; i < setOfProducts.length; i++) {
			if ((setOfProducts[i] != null) && (setOfProducts[i].getName().contains(name))) {
				setOfProducts[i] = null;
				countOfProducts--;
			}
		}
	}
}
