package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EndtoEnd {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

//        For selecting departure and arrival
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='GOI']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='JAI']")).click();
        Thread.sleep(1000);

//        For selecting the current date
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        Thread.sleep(1000);

        if(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("0.5"))
        {
            Assert.assertTrue(true);
            System.out.println("Return date dropdown is disabled.");
        }
        else
        {
            Assert.fail();
            System.out.println("Return date dropdown is enabled.");
        }

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);

//        Create a while loop
        int a = 1;
        while (a < 5) {
            driver.findElement(By.id("hrefIncAdt")).click();
            a++;
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        Thread.sleep(1000);

//        Checkbox
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
        Thread.sleep(1000);

//        Click on search button
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();

//        driver.quit();
    }
}
