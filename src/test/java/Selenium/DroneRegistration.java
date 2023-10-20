import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DroneRegistration {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("WebDriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe"); //if you dont write this then Selenium Manager will auto detect the browser version
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //to ask the browser to wait for a element and then move to the next as soon as it is available
		driver.get("https://dubai.astrautm.com/");
		driver.findElement(By.id("emailid")).sendKeys("admin.astra");
		driver.findElement(By.name("password")).sendKeys("Admin@1234**");
		driver.findElement(By.className("login-btn")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@href='#'])[3]")).click();
		driver.findElement(By.xpath("(//a[@href='/up/drone/:id'])[1]")).click();
		Thread.sleep(2000);		
		WebElement m = driver.findElement(By.xpath ("(//*[name()='svg'][@class='css-8mmkcg'])[1]"));
		Actions a = new Actions(driver);
	    a.moveToElement(m).
	    click().build().perform();
	    WebDriverWait wait= (new WebDriverWait(driver, Duration.ofSeconds(3)));
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[1]")));
	    driver.findElement(By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[1]")).sendKeys("DJI");
		Thread.sleep(2000);
		List <WebElement> manufacturerOptions = driver.findElements(By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[1]"));
		
		for (WebElement option: manufacturerOptions)
		{
			if(option.getText().equalsIgnoreCase("DJI"))
			{
				option.click();
				break;
			}
		}

	}

}
