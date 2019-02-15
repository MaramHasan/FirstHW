
import org.junit.Assert;
import org.junit.Test;
 
public class ShoppingCartAppTest {
 
	
	@Test
	public void testCreateEmptyShoppingCart() {
		ShoppingCart cart = new ShoppingCart();
		Assert.assertEquals(0, cart.getProductCount());
	}
	
	@Test
	public void testAddSingleProductToShoppingCart() {
		ShoppingCart cart = new ShoppingCart();
		Product product = new Product("Java Book", 1, 127.0);
		cart.addProduct(product);
		Assert.assertEquals(1, cart.getProductCount());
		Assert.assertEquals(127.0, cart.getTotalCartValue(),0.0);
	}
	
	@Test
	public void addDifferentProductsToTheCart(){
		ShoppingCart cart = new ShoppingCart();
		Product java = new Product("java Book", 1, 127.0);
		Product web = new Product("Web design Book", 1, 100.0);
		cart.addProduct(java);
		cart.addProduct(web);
		Assert.assertEquals(2, cart.getProductCount());
		Assert.assertEquals(227.0, cart.getTotalCartValue(),0.0);
	}
}
