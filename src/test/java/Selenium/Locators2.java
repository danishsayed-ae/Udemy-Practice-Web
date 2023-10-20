import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		String username = "rahul";
		System.setProperty("WebDriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe"); //if you dont write this then Selenium Manager will auto detect the browser version
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //to ask the browser to wait for a element and then move to the next as soon as it is available
		String Password = getPassword (driver);//No need to create a object of this class if we declare driver
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(username);
		driver.findElement(By.name("inputPassword")).sendKeys(Password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		//Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in."); //If assertion is correct it will not print anything.
		driver.findElement(By.xpath("//*[text()=\"Log Out\"]")).click();
		Thread.sleep(2000);
		driver.close();
		
		

	}

	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Reset Login']")).click();
		String PasswordText = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String PasswordArray [] = PasswordText.split("'");
		//0th index will be splitted as "Please use temporary password "
		//1st index will be splitted as "rahulshettyacademy' to Login."
		
		//1st way of saving the password in a string value
		String TempPassword [] = PasswordArray [1].split("'");
		String FinalPassword = TempPassword [0];
		
		//2nd way of storing the password and directly calling it on the run
		String Password = PasswordArray [1].split("'")[0];
		return Password;

		
	}

}
