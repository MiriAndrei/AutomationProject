package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CategoryProducts extends BasePage{
    public CategoryProducts(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a.btn.add-to-cart")
    private List<WebElement> addToCartButtonElementList;
    @FindBy(css = "div.product-item")
    private List<WebElement> productItemsElementList;
    @FindBy(xpath = "//button[text()='Continue Shopping']")
    private WebElement continueShoppingButton;

    public void addProduct(int index) {
        if(index < addToCartButtonElementList.size()) {
            elementHelper.clickElement(addToCartButtonElementList.get(index));
            LoggerUtility.infoLog("Added product at index " + index + " to cart");
        }
    }

    public void dealWithAddPopUp(){
        elementHelper.clickJSElement(continueShoppingButton);
    }
}
