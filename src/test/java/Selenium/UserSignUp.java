import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class UserSignUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String EmailID = "johndoe23.eu@yopmail.com";
		String Password = "Test@1234";
		driver.getWindowHandle();
		String originalWindow = driver.getWindowHandle();
		driver.get("https://eu.astrautm.com/");
		driver.findElement(By.xpath("(//b[normalize-space()='Register now'])[1]")).click();
		driver.findElement(By.id("firstName")).sendKeys("John");
		driver.findElement(By.id("lastName")).sendKeys("Doe");
		driver.findElement(By.id("emailId")).sendKeys(EmailID);
		driver.findElement(By.id("mobileNo")).sendKeys("+971569441478");
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.id("cpassword")).sendKeys(Password);
		Thread.sleep(2000);
		
		/*
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript ("document.getElementById('checkbox').setAttribute('value', 'true')");
		
		driver.findElement(By.id("checkbox")).sendKeys(args));
		//WebElement check = driver.findElement(By.id("checkbox"));
		//check.click();
		 */
		//driver.findElement(By.id("checkbox")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		//WebElement Checkbox = wait.until (ExpectedConditions.elementToBeClickable (By.id("checkbox")));
		//Checkbox.click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//To get the OTP
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://yopmail.com/");
		driver.findElement(By.id("login")).sendKeys(EmailID);
		driver.findElement(By.xpath("//button[@title='Check Inbox @yopmail.com']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='refresh']")).click();
		driver.switchTo().frame(driver.findElement(By.id("ifmail")));
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='lmfd'][1] //span[@class='lmf'][1]")).click();
		//System.out.println(driver.findElement(By.xpath("//div[@id='mail']/div/p[3]/b")).getText());
		String OTP = driver.findElement(By.xpath("//div[@id='mail']/div/p[3]/b")).getText();
		driver.switchTo().defaultContent();
		driver.switchTo().window(originalWindow);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Please enter verification code. Character 1']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Please enter verification code. Character 1']")).sendKeys(OTP);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("emailid")).sendKeys(EmailID);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.id("btnLgnSubmit")).click();	
		
		
		
		
	}

}
