package seleniumHw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver_mac64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        driver.navigate().to("https://www.amazon.com/");

        String URL = driver.getCurrentUrl();

        System.out.println("This is the current url for the Amazon website: " + URL);

        String title = driver.getTitle();

        System.out.println("This is the current title for the Amazon website: " + title);

        driver.close();

        }

    }

