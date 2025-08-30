package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SignUpPage extends BasePage{
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name='title']")
    private List<WebElement> genderElementList;
    @FindBy(id = "password")
    private WebElement passwordElement;
    @FindBy(id = "days")
    private WebElement daysElement;
    @FindBy(id = "months")
    private WebElement monthsElement;
    @FindBy(id = "years")
    private WebElement yearsElement;
    @FindBy(id = "newsletter")
    private WebElement newsletterElement;
    @FindBy(id = "optin")
    private WebElement offersElement;


    @FindBy(css = "input[data-qa='first_name']")
    private WebElement firstNameElement;
    @FindBy(css = "input[data-qa='last_name']")
    private WebElement lastNameElement;
    @FindBy(css = "input[data-qa='company']")
    private WebElement companyElement;
    @FindBy(css = "input[data-qa='address']")
    private WebElement addressElement;
    @FindBy(css = "input[data-qa='address2']")
    private WebElement address1Element;
    @FindBy(id = "country")
    private WebElement countryElement;
    @FindBy(css = "select[data-qa='country']")
    private WebElement countryInputElement;
    @FindBy(css = "input[data-qa='state']")
    private WebElement stateElement;
    @FindBy(css = "input[data-qa='city")
    private WebElement cityElement;
    @FindBy(css = "input[data-qa='zipcode']")
    private WebElement zipcodeElement;
    @FindBy(css = "input[data-qa='mobile_number']")
    private WebElement mobileNumberElement;
    @FindBy(css = "button[data-qa='create-account']")
    private WebElement createAccountElement;
    @FindBy(css = "[data-qa='account-created']")
    private WebElement accountCreatedElement;
    @FindBy(xpath = "//a[@data-qa='continue-button']")
    private WebElement continueButtonElement;
    @FindBy(xpath = "//li/a[contains(text(), 'Logged in as')]")
    private WebElement loggedUserNameElement;

    public void fillSignUpForm (String genderValue, String passwordValue,String daysValue, String monthsValue, String yearsValue,
                                String firstNameValue, String lastNameValue, String companyValue, String addressValue,  String address1Value ,
                                String countryValue, String stateValue ,String cityValue ,String zipcodeValue,
                                String mobileNumberValue){
        switch (genderValue) {
            case "Mr":
                elementHelper.clickElement(genderElementList.get(0));
                break;
            case "Mrs":
                elementHelper.clickElement(genderElementList.get(1));
                break;
        }
        LoggerUtility.infoLog("The user checks gender field the value: " + genderValue);
        elementHelper.fillElement(passwordElement, passwordValue);
        LoggerUtility.infoLog("The user fills the password field with value: " + passwordValue);
        elementHelper.clickJSElement(daysElement);
        elementHelper.selectElement(daysElement, daysValue);
        LoggerUtility.infoLog("The user selects the day field with value: " + daysValue);
        elementHelper.clickJSElement(monthsElement);
        elementHelper.selectElement(monthsElement, monthsValue);
        LoggerUtility.infoLog("The user selects the months field with value: " + monthsValue);
        elementHelper.clickJSElement(yearsElement);
        elementHelper.selectElement(yearsElement, yearsValue);
        LoggerUtility.infoLog("The user selects the months field with value: " + yearsValue);
        elementHelper.clickJSElement(newsletterElement);
        LoggerUtility.infoLog("The user checks the newsletter box");
        elementHelper.clickJSElement(offersElement);
        LoggerUtility.infoLog("The user checks the special offers box");

        elementHelper.fillElement(firstNameElement, firstNameValue);
        LoggerUtility.infoLog("The user fills the first name field with value: " + firstNameValue);
        elementHelper.fillElement(lastNameElement, lastNameValue);
        LoggerUtility.infoLog("The user fills the last name field with value: " + lastNameValue);
        elementHelper.fillElement(companyElement, companyValue);
        LoggerUtility.infoLog("The user fills the company field with value: " + companyValue);
        elementHelper.fillElement(addressElement, addressValue);
        LoggerUtility.infoLog("The user fills the addreess field with value: " + addressValue);
        elementHelper.fillElement(address1Element, address1Value);
        LoggerUtility.infoLog("The user fills the addreess 2 field with value: " + address1Value);
        elementHelper.clickJSElement(countryElement);
        elementHelper.fillElement(countryInputElement, countryValue);
        elementHelper.pressElement(countryInputElement, Keys.ENTER);
        LoggerUtility.infoLog("The user selects the country field with value: " + countryValue);
        elementHelper.fillElement(stateElement, stateValue);
        LoggerUtility.infoLog("The user fills the State field with value: " + stateValue);
        elementHelper.fillElement(cityElement, cityValue);
        LoggerUtility.infoLog("The user fills the city field with value: " + cityValue);
        elementHelper.fillElement(zipcodeElement, zipcodeValue);
        LoggerUtility.infoLog("The user fills the zipcode field with value: " + zipcodeValue);
        elementHelper.fillElement(mobileNumberElement, mobileNumberValue);
        LoggerUtility.infoLog("The user fills the mobile number field with value: " + mobileNumberValue);
        elementHelper.clickJSElement(createAccountElement);
        LoggerUtility.infoLog("The user clicks on the create account button" );
    }

}

