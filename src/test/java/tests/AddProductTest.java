package tests;

import org.testng.annotations.Test;
import pages.*;
import sharedData.SharedData;

public class AddProductTest extends SharedData {

    @Test

    public void testMethod(){
        ConsentPage consentPage = new ConsentPage(getDriver());
        consentPage.dealWithConsent();

        HomePage homePage = new HomePage(getDriver());
        homePage.interactWithSignupLoginMenu();

        String emailValue = "andrei@yopmail.com";
        String passwordLoginValue = "Cucu1234";
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.fillLoginForm(emailValue,passwordLoginValue);

        homePage.interactWithProductsPage();

        String categoryValue = "Men";
        String menSubCategoryValue ="Tshirts";
        ProductsPage productsPage = new ProductsPage(getDriver());
        productsPage.validateProductPageTitle();
        productsPage.selectCategory(categoryValue,menSubCategoryValue);

        CategoryProducts categoryProducts = new CategoryProducts(getDriver());
        categoryProducts.addProduct(0);
        categoryProducts.dealWithAddPopUp();
    }
}
