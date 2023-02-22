package seleniumClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
        // connect class to webdriver

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver_mac64/chromedriver");

        // initiate the instance of webdriver

        WebDriver driver = new ChromeDriver();

        //open google

        driver.get("https://www.google.com/");

        //slow down
        Thread.sleep(2000);

        //now navigate to facebook.com
        driver.navigate().to("https://www.facebook.com");

        //slow down
        Thread.sleep(2000);

        //go back
        driver.navigate().back();

        //slow down
        Thread.sleep(2000);

        driver.navigate().forward();
        //slow down
        Thread.sleep(2000);

        //refresh page
        driver.navigate().refresh();

        //close the browser
        driver.close();

    }
}
