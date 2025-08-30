package helperMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class ElementHelper {
    private WebDriver driver;

    public ElementHelper(WebDriver driver) {
        this.driver = driver;
    }
    public void clickJSElement(WebElement element){
        waitVisibleElement(element);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void clickElement(WebElement element){
        waitVisibleElement(element);
        element.click();
    }

    public void fillElement(WebElement element,String value){
        waitVisibleElement(element);
        element.sendKeys(value);
    }

    public void pressElement(WebElement element, Keys value){
        waitVisibleElement(element);
        element.sendKeys(value);
    }

    public void selectElement(WebElement element, String value){
        waitVisibleElement(element);
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public void validateElementEqualsText(WebElement element, String expectedtext) {
        waitVisibleElement(element);
        Assert.assertEquals(element.getText(), expectedtext, "Actual element text: " + element.getText() + "is different then " + expectedtext);
    }


    public void waitVisibleElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
