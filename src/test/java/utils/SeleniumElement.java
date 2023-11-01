package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SeleniumElement {

    private WebDriver driver;

    public SeleniumElement(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findElement(String selector) {
        return driver.findElement(By.cssSelector(selector));
    }

    public List<WebElement> findElements(String selector) {
        return driver.findElements(By.cssSelector(selector));
    }

    public void enterText(String selector, String text) {
        WebElement element = findElement(selector);
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
        element.sendKeys(text);
    }

    public void selectOption(String selector, String value) {
        Select dropdown = new Select(findElement(selector));
        dropdown.selectByValue(value);
    }

    public void selectOptionText(String selector, String value) {
        Select dropdown = new Select(findElement(selector));
        dropdown.selectByVisibleText(value);
    }

    public void selectRadio(String selector) {
        findElement(selector).click();
    }

    public String findElementText(String selector) {
        return findElement(selector).getText();
    }

    public void clickElement(String selector) {
        findElement(selector).click();
    }
}