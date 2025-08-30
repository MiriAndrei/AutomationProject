package tests;

import org.testng.annotations.Test;
import pages.ConsentPage;
import pages.HomePage;
import pages.LoginPage;
import sharedData.SharedData;

public class SuccesfulLoginTest extends SharedData {

    @Test

    public void testMethod(){

        ConsentPage consentPage = new ConsentPage(getDriver());
        consentPage.dealWithConsent();

        HomePage homePage = new HomePage(getDriver());
        homePage.interactWithSignupLoginMenu();

        LoginPage loginPage = new LoginPage(getDriver());
        String emailValue = "andrei@yopmail.com";
        String passwordLoginValue = "Cucu1234";
        loginPage.fillLoginForm( emailValue,passwordLoginValue);
        String expectedUserValue="Andrei";
        homePage.validateLogin(expectedUserValue);


    }
}
