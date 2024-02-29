package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Assignment5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.partialLinkText("Nested Frames")).click();
        driver.switchTo().frame(0);
//        driver.switchTo().frame(driver.findElement(By.xpath("//frameset[@rows='50%,50%']")));
        driver.switchTo().frame(driver.findElement(By.name("frame-top")));
        driver.switchTo().frame(driver.findElement(By.name("frameset-middle")));
        driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
        String text = driver.findElement(By.xpath("//*[text()='Middle']")).getText();
        System.out.println(text);

    }
}
