import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    By updateAmount = By.id("js-cart-update-product");
    By updateReload = new By.ByCssSelector("fa fa-refresh green-icon");

    By checkUpdateNotification = By.id("swal2-title");

    By redIcon = new By.ByCssSelector("fa fa-times red-icon");

    By cartCountLocator = By.id("cart-items");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean CartPage(WebDriver driver) {
        super(driver);
        click(updateAmount);
        WebElement textDemo = driver.findElement(By.xpath("//*[text()='2']"));
        click(updateReload);
        public boolean isOnCartPage () {
            return isDisplayed(checkUpdateNotification);
            click(redIcon);


        }


        public boolean isProductCountUp () {
            return cartCountLocator = 0;


        }

        public boolean checkIfProductAdded () {

        }
    }

    public boolean checkIfProductAdded() {
    }
}
