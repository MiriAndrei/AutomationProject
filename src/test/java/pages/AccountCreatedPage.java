package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends BasePage{
    public AccountCreatedPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[data-qa='continue-button']")
    private WebElement continueButton;

    public void validateAccount(){
    elementHelper.clickElement(continueButton);
    LoggerUtility.infoLog("The user presses on the Continue button");
    }
}
