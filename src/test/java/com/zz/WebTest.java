package com.zz;

import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Collections;

public class WebTest {
    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "/Users/stone/Applications/chromedriver/chromedriver92");

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", false);
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://google.com/");
        driver.manage().window().maximize();

        WebElement q = driver.findElement(By.name("q"));
        q.sendKeys("selenium");
        q.sendKeys(Keys.ENTER);

        driver.get("https://www.selenium.dev/documentation/en/webdriver/");
    }
}
