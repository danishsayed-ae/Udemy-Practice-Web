package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeleniumPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        Implicit wait is applied globally
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//        Explicit wait can be achieved using WebDriverWait or Fluent wait
//        It is used to target a spcific element
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

//        Start
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        String[] itemsNeeded = {"Cucumber", "Brocolli", "Tomato", "Beans","Brinjal"};

//        Calling the method
        itemNeeded(driver, itemsNeeded);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
//        targeting this element
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Enter promo code']")));
        driver.findElement(By.cssSelector("input[placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
//        targeting this element
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='promoInfo']")));
        System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());

//        To close the entire browser
        driver.quit();

    }

    public static void itemNeeded(WebDriver driver, String[] itemsNeeded)
    {
        int j=0;
        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
        for (int i = 0; i < products.size(); i++)
        {

//            Splitting the text based on "-" and then formatting it to remove white spaces
            String[] productName = products.get(i).getText().split("-");
            String formattedProductName = productName[0].trim();

//            Converting from Array to ArrayList so that we can use "contains" method
            List itemsNeededList = Arrays.asList(itemsNeeded);
            if (itemsNeededList.contains(formattedProductName))
            {
                j++;
//                Click on Add to Cart
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
//                length method for Array and size method for ArrayList
                if(j== itemsNeeded.length)
                {
                    break;
                }
            }
        }
    }
}
