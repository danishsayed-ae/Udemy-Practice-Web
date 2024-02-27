package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Assignment4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.partialLinkText("Multiple Windows")).click();

        driver.findElement(By.partialLinkText("Click Here")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        String parentID = iterator.next();
        String childID = iterator.next();
        driver.switchTo().window(childID);
        String childWindowText = driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText();
        System.out.println(childWindowText);
        driver.switchTo().window(parentID);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Opening a new window')]")));
        String parentWindowText = driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText();
        System.out.println(parentWindowText);
        driver.quit();

    }
}
