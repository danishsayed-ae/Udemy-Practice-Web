package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Checkbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Assert.assertFalse(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
        System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
        System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
        int countCheckbox = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
        System.out.println(countCheckbox);
        driver.close();

    }
}
