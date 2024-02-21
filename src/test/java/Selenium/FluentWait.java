package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import java.util.function.Function;

import static java.util.concurrent.TimeUnit.SECONDS;

public class FluentWait {
    public static void main(String[] args, Object timeout, Object WebDriver) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.cssSelector("div[id='start'] button")).click();

//        Wait wait = new FluentWait(WebDriver driver)
//                .withTimeout(timeout, SECONDS)
//                .pollingEvery(timeout, SECONDS)
//                .ignoring(Exception.class);
//
//        WebElement foo=wait.until(new Function<WebDriver, WebElement>() {
//            public WebElement applyy(WebDriver driver) {
//                return driver.findElement(By.id("foo"));
//            }
//        });

    }
}
