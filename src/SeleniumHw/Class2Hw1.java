package SeleniumHw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2Hw1 {
    /*
HW1:
        navigate to
        fill out the form
        click on register
        close the browser */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver_mac64/chromedriver");

        WebDriver driver = new ChromeDriver();


        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.manage().window().maximize();


        driver.findElement(By.id("customer.firstName")).sendKeys("Sarah");

        driver.findElement(By.id("customer.lastName")).sendKeys("Vanover");

        driver.findElement(By.id("customer.address.street")).sendKeys("64 Main Street apt 3");

        driver.findElement(By.id("customer.address.city")).sendKeys("Virginia Beach");

        driver.findElement(By.id("customer.address.state")).sendKeys("VA");

        driver.findElement(By.id("customer.address.zipCode")).sendKeys("43452");

        driver.findElement(By.id("customer.phoneNumber")).sendKeys("(757) 333 - 4543");

        driver.findElement(By.id("customer.ssn")).sendKeys("037-55-8266");


        driver.findElement(By.name("customer.username")).sendKeys("svanover");

        driver.findElement(By.name("customer.password")).sendKeys("#Happy1234");

        driver.findElement(By.id("repeatedPassword")).sendKeys("#Happy1234");

        driver.findElement(By.className("button")).click();

        Thread.sleep(3000);

        driver.close();





    }
}
