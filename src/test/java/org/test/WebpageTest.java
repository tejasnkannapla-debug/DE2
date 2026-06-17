package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class WebpageTest {

    WebDriver driver;

    @BeforeTest
    public void openBrowser() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://example.com");
    }

    @Test
    public void titleValidationTest() {

        String actualTitle = driver.getTitle();

        String expectedTitle = "Example Domain";

        Assert.assertEquals(actualTitle,
                expectedTitle);
    }

    @AfterTest
    public void closeBrowser() {

        driver.quit();
    }
}