import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class TestSample  {
    public static void main(String[] args) {

        // Set the property for webdriver.chrome.driver to be the location to your local              download of chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/mmcga/Downloads/chromedriver.exe");

        // Create new instance of ChromeDriver
        // and uses the package org.openqa.selenium.chrome.ChromeDriver
        WebDriver driver = new ChromeDriver();

        // And now use this to visit Google
        //uses package org.openqa.selenuum.WebDriver
        driver.get("http://www.google.com");

        // Find the text input element by its name
        // uses package org.openqaa.selenium.By - can find an element on the page
        // also uses org.openqa.selenium.WebElement and use to sendKeys
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese!");

        // Now submit the form
        element.submit();

        //Close the browser
        driver.quit();
    }
}


