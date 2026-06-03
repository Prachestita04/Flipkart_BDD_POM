package com.ReusableFunctions;

import com.BaseClass.Library;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class SeleniumReusable extends Library {
    public SeleniumReusable(WebDriver driver) {
        this.driver = driver;
    }

    public void enterValue(WebElement element, String text) {
        try {
            element.sendKeys(text);
        } catch (Exception e) {
            System.out.println("No such element exception");
        }
    }

    public void click(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            System.out.println("Nosuchelement Exception");
        }
    }

    public void gettitle() {
        try {
            System.out.println(driver.getTitle());
        } catch (Exception e) {
            System.out.println("Couldn't get the title");
        }
    }

    public void screenshot(String path) {
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(source, new File(path));
        } catch (IOException e) {
            System.out.println("Screenshot not found");
        }
    }
}
