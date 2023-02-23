package SeleniumClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver_mac64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://www.amazon.com/");

        // print all the links in Amazon.com

        driver.findElements(By.tagName("a"));

        // to be continued in next class



    }
    }
