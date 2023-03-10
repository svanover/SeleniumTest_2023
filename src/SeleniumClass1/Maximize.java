package SeleniumClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver_mac64/chromedriver");

        //create instance of webdriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        // maximize the window

        driver.manage().window().maximize();

        // full screen

        driver.manage().window().fullscreen();
    }
}
