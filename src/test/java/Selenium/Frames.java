package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Frames {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://jqueryui.com/droppable/");

//        Frame expects a web element
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        driver.findElement(By.id("draggable")).click();


        driver.quit();
    }
}
