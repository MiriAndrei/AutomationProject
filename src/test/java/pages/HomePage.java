package pages;

import helperMethods.ElementHelper;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()=' Signup / Login']")
    private WebElement signupLoginElement;

    @FindBy(xpath = "//a[contains(text(),'Logged in as')]/b")
    private WebElement loggedElement;

    @FindBy(xpath = "//a[@href='/products']")
    private WebElement productElement;

    public void interactWithSignupLoginMenu() {
        elementHelper.clickJSElement(signupLoginElement);
        LoggerUtility.infoLog("The user press on the SingUp/Login menu");
    }

    public void validateLogin(String expectedUserValue){
            elementHelper.validateElementEqualsText(loggedElement, expectedUserValue);
    }

    public void interactWithProductsPage (){
        elementHelper.clickJSElement(productElement);
        LoggerUtility.infoLog("The user press on the Products menu");
    }

}
