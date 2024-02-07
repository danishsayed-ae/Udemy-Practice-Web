package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeleniumPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        String[] itemsNeeded = {"Cauliflower", "Brocolli"};
        int j=0;

        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
       /* for (int i = 0; i < products.size(); i++)
        {
            j++;
//            Splitting the text based on "-" and then formatting it to remove white spaces
            String[] productName = products.get(i).getText().split("-");
            String formattedProductName = productName[0].trim();

//            Converting from Array to ArrayList
//            List itemsNeededList = Arrays.asList(itemsNeeded);
//            if (itemsNeededList.contains(formattedProductName))
            {
//                Click on Add to Cart
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                if(j==3)
                {
                    break;
                }
            }
        }*/


        driver.quit();
    }
}
