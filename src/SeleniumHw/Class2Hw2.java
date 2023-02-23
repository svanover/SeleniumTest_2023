package SeleniumHw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class Class2Hw2 {
    /*HW2
navigate to fb.com
click on create new account
fill up all the text boxes
click on sign up button
close the popup
close the browser */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver_mac64/chromedriver");

        WebDriver driver = new ChromeDriver();


        driver.navigate().to("https://www.facebook.com/");

        driver.manage().window().maximize();

        driver.findElement(By.linkText("Create new account")).click();

        Thread.sleep(3000);


        driver.findElement(By.name("firstname")).sendKeys("Sarah");
        driver.findElement(By.name("lastname")).sendKeys("Johnson");
        driver.findElement(By.name("reg_email__")).sendKeys("sarah.vanover@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sarah.vanover@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("#Daydreaming453");

        driver.findElement(By.id("month")).sendKeys("October");
        driver.findElement(By.id("day")).sendKeys("10");
        driver.findElement(By.id("year")).sendKeys("1988");

        driver.findElement(By.cssSelector("input[type='radio'][value='1']")).click();

        driver.findElement(By.name("websubmit")).click();

        Thread.sleep(3000);

        driver.close();

            }

        }


