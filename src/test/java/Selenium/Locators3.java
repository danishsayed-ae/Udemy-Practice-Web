import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		/*There are 2 types of XPath:
		1. Absolute Xpath --> starts from the top of the code and is written like /html/body
		2. Relative Xpath --> starts from the middle of the code and is written like //body/p
		Recommended to use relative Xpath
		
		//header/div/button[1]/following-sibling::button[1] --> To move from parent to child traverse and then sibling
		//header/div/button[1]/parent::div/parent::header  --> To move from child to parent traverse and then again parent
		
		*/
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText()); //parent to child traverse and then sibling
		driver.close();
		
		

	}

}
