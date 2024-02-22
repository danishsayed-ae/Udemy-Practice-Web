package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Action {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();
        Actions a = new Actions(driver);
        a.click(driver.findElement(By.id("twotabsearchtextbox"))).keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

        WebElement move = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
        a.moveToElement(move).contextClick().build().perform();
        a.moveToElement(move).build().perform();


    }
}
