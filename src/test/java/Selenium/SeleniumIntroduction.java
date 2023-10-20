import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		
		//System.setProperty("WebDriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://eu.astrautm.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("emailid")).sendKeys("admin.astra");
		driver.findElement(By.id("password")).sendKeys("Admin@1234**");
		driver.findElement(By.id("btnLgnSubmit")).click();
		//driver.close();

	}

}
