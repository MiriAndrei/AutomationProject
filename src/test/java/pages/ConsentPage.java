package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConsentPage extends BasePage {
    public ConsentPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".fc-button.fc-cta-consent.fc-primary-button")
    private WebElement consentButton;

    public void dealWithConsent(){
        elementHelper.clickElement(consentButton);
        LoggerUtility.infoLog("The user agreed with the consent");
    }
}
