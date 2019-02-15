
import java.util.ArrayList;
import java.util.List;
 
public class ShoppingCart {
 
	private List<Product> productList = new ArrayList<>();
	private double totalCartValue;
	
	public int getProductCount() {
		return productList.size();
	}
 
	public void addProduct(Product product) {
		productList.add(product);
	}
	public double getTotalCartValue() {
		if (productList.size() > 0) {
			for (Product product : productList) {
				totalCartValue = totalCartValue + product.getTotalPrice();
			}
		}
		return totalCartValue;
}
}