import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Stack;

public class HomePage extends BasePage{

    SearchBox searchBox ;

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
        By cartCountLocator = By.id("cart-items");
        By cartContainerLocator = By.id("cart-items");
        By cartContainerLocator2 = By.id("js-cart");
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isProductCountUp() {

        return getCartCount() > 0;
    }

    public void goToCart() {
        By cartContainerLocator = By.id("cart-items");
        By cartContainerLocator2 = By.id("js-cart");

        click(cartContainerLocator);
        click(cartContainerLocator2);

    }

    private int getCartCount(){

        By cartCountLocator = By.id("cart-items");
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }
}
