package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("WebDriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://scnsdev.astrautm.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElement(By.id("emailid")).sendKeys("admin.astra");
		driver.findElement(By.id("password")).sendKeys("Admin@1234**");
		driver.findElement(By.id("btnLgnSubmit")).click();
		driver.close();
		//Did you change something?
	}

}
