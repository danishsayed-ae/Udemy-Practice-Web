package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.cssSelector("input[id*='Trip_1']")).click();
        System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
        driver.findElement(By.cssSelector("input[id*='Trip_0']")).click();
        System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style"));

        if(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("1"))
        {
            Assert.assertTrue(true);
        }
        else
        {
            Assert.assertTrue(false);
        }

    }
}
