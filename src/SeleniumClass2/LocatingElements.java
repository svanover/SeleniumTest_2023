package SeleniumClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver_mac64/chromedriver");

        WebDriver driver = new ChromeDriver();


        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("svanover");

        driver.findElement(By.name("pass")).sendKeys("boom33224");

        driver.findElement(By.linkText("Create new account")).click();

        driver.findElement(By.partialLinkText("password?")).click();




    }
}