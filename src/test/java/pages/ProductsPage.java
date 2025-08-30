package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends BasePage{
    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath =  "//h2[text()='All Products']")
    private WebElement allProductsElement;

    @FindBy (xpath =  "//h2[text()='Category']")
    private WebElement categoryElement;
    @FindBy (css = "span.badge.pull-right > i.fa.fa-plus")
    private List<WebElement> categoryElementList;
    @FindBy (xpath = "//div[@class='panel-body']//ul/li/a")
    private List<WebElement> menSubCategoryElementList;

    public void validateProductPageTitle(){
        elementHelper.validateElementEqualsText(allProductsElement, allProductsElement.getText());
        LoggerUtility.infoLog("All Products page title is displayed");
    }
    public void selectCategory (String categoryValue,String menSubCategoryValue){
        elementHelper.validateElementEqualsText(categoryElement, categoryElement.getText());
        LoggerUtility.infoLog("Category is displayed on the Products page");
        switch (categoryValue.trim()) {
            case "Women":
                elementHelper.clickJSElement(categoryElementList.get(0));
                break;
            case "Men":
                elementHelper.clickJSElement(categoryElementList.get(1));
                break;
            case "Kids":
                elementHelper.clickJSElement(categoryElementList.get(2));
                break;
        }
        LoggerUtility.infoLog("The user choose the category: " + categoryValue);

        List<WebElement> menSubCategoryElementList = driver.findElements(By.xpath("//div[@class='panel-body']//ul/li/a"));
        switch (menSubCategoryValue.trim()) {
            case "Tshirts":
                elementHelper.clickJSElement(menSubCategoryElementList.get(3));
                break;
            case "Jeans":
                elementHelper.clickJSElement(menSubCategoryElementList.get(4));
                break;
        }
        LoggerUtility.infoLog("The user choose the sub-category " + menSubCategoryValue);
    }
}
