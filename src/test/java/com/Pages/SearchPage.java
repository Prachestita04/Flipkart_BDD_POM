package com.Pages;

import com.BaseClass.Library;
import com.ReusableFunctions.SeleniumReusable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage extends Library {
    SeleniumReusable se;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//input[@name='q'])[1]")
    WebElement SearchText;
    @FindBy(xpath = "//html[@lang='en-IN']")
    WebElement HomePage;
    @FindBy(xpath = "//html[@lang='en']")
    WebElement SearchResult;
    @FindBy(xpath = "//span[contains(text(),'✕')]")
    WebElement Popup;
    @FindBy(xpath = "//div[contains(@class,'row')]//child::div[1][contains(@class,'col')]")
    List<WebElement> EntireResult;
    @FindBy(xpath = "(//div[contains(@class,'row')]//child::div[1][contains(@class,'col')])[3]")
    WebElement ThirdResult;

    public void handlePopup() {
        se = new SeleniumReusable(driver);
        se.click(Popup);
    }

    public void search(String text) {

        se.enterValue(SearchText, text);
    }

    public void clickSearch() {
        SearchText.sendKeys(Keys.ENTER);
    }

    public void homeScreen() {
        System.out.println(HomePage.isDisplayed());
    }

    public void result() {
        System.out.println(SearchResult.isDisplayed());
        System.out.println(driver.getTitle());
    }

    public void printEntireResult() {
        se.multipleGettext(EntireResult);
    }

    public void print3rdResult() {
        se.getValue(ThirdResult);
    }

}
