package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.name("name")).sendKeys("Danish Sayed");
        driver.findElement(By.name("email")).sendKeys("danishsayed.ae@gmail.com");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Test@1234");
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select genderDropdown = new Select(dropdown);
        Thread.sleep(2000);
        genderDropdown.selectByVisibleText("Female");
        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.name("bday")).sendKeys("21081996");
        driver.findElement(By.className("btn-success")).click();
        System.out.println(driver.findElement(By.cssSelector("div[class*='alert-success']")).getText());
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class*='alert-success']")).getText(), "Success! The Form has been submitted successfully!.");
    }
}
