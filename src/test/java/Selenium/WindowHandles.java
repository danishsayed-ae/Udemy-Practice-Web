package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.cssSelector("a.blinkingText")).click();

//        Get all the windows
        Set<String> windows = driver.getWindowHandles();

//        Iterating through all the windows
        Iterator<String> Iterator = windows.iterator();

//        By default iteration is at 0th index and when we do next then it moves to the 1st index.
        String parentID = Iterator.next();
        String childID = Iterator.next();
        driver.switchTo().window(childID);
        System.out.println(driver.findElement(By.cssSelector("p.im-para.red")).getText());
        driver.findElement(By.cssSelector("p.im-para.red"));
        String emailID = driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        System.out.println(emailID);
        driver.switchTo().window(parentID);
        driver.findElement(By.id("username")).sendKeys(emailID);

    }
}
