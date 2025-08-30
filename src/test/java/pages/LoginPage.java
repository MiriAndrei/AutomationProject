package pages;

import helperMethods.ElementHelper;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[data-qa='login-email']")
    private WebElement emailLoginElement;
    @FindBy(css = "input[data-qa='login-password']")
    private WebElement passwordLoginElement;
    @FindBy(css = "button[data-qa='login-button']")
    private WebElement loginButtonElement;
    @FindBy(css = "input[placeholder='Name']")
    private WebElement nameElement;
    @FindBy(css = "input[data-qa='signup-email']")
    private WebElement emailElement;
    @FindBy(css = "button[data-qa='signup-button']")
    private WebElement signupButtonElement;
    @FindBy(css = "div[class='login-form'] h2")
    private WebElement loginToYourAccountElement;
    @FindBy(css = "div[class='signup-form'] h2")
    private WebElement newUserSignupElement;


    public void fillLoginForm(String emailValue, String passwordLoginValue) {
        elementHelper.fillElement(emailLoginElement, emailValue);
        LoggerUtility.infoLog("The user enters the email value: " + emailValue);
        elementHelper.fillElement(passwordLoginElement, passwordLoginValue);
        LoggerUtility.infoLog("The user enters the password value: " + passwordLoginValue);
        elementHelper.clickJSElement(loginButtonElement);
        LoggerUtility.infoLog("The user presses the Login button");
    }


    public void fillSignupForm(String nameValue, String emailValue) {
        elementHelper.fillElement(nameElement, nameValue);
        LoggerUtility.infoLog("The user fills name field with value: " + nameValue);
        elementHelper.fillElement(emailElement, emailValue);
        LoggerUtility.infoLog("The user fills email address field with value: " + emailValue);
        elementHelper.clickElement(signupButtonElement);
        LoggerUtility.infoLog("The user press the SingUp button");
    }
}
