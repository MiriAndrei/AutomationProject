package tests;

import org.testng.annotations.Test;
import pages.*;
import sharedData.SharedData;

public class RegisterUserTest extends SharedData {

    @Test

    public void testMethod(){
        ConsentPage consentPage = new ConsentPage(getDriver());
        consentPage.dealWithConsent();

        HomePage homePage = new HomePage(getDriver());
        homePage.interactWithSignupLoginMenu();

        LoginPage loginPage = new LoginPage(getDriver());
        String nameValue = "Andrei";
        String emailValue="andrei@yopmail.com" + System.currentTimeMillis();
        loginPage.fillSignupForm(nameValue,emailValue);

        String genderValue = "Mr";
        String passwordValue = "Cucu1234";
        String daysValue = "2";
        String monthsValue = "November";
        String yearsValue = "1993";
        String firstNameValue = "Andrei";
        String lastNameValue = "Miritescu";
        String companyValue = "OOOOOOO";
        String addressValue = "Iancu de Hunedoara nr.8";
        String address1Value = "Sect 1, Bucuresti";
        String countryValue = "Singapore";
        String stateValue = "Sector 1";
        String cityValue = "Bucuresti";
        String zipcodeValue = "100458";
        String mobileNumberValue = "0777777777";

        SignUpPage signUpPage = new SignUpPage(getDriver());
        signUpPage.fillSignUpForm(genderValue, passwordValue, daysValue, monthsValue, yearsValue, firstNameValue,
                lastNameValue, companyValue, addressValue, address1Value, countryValue, stateValue,
                cityValue, zipcodeValue, mobileNumberValue);

        AccountCreatedPage accountCreatedPage = new AccountCreatedPage(getDriver());
        accountCreatedPage.validateAccount();

    }

}
