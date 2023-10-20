import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		//Either create a for loop
		for (int i=0;i<4;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		//Else create a while loop
		int a=1;
		while (a<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			a++;
		}
		
		
		Thread.sleep(2000);
		driver.findElement(By.id("btnclosepaxoption")).click();
		driver.close();

	}

}
