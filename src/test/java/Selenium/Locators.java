import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe"); //if you dont write this then Selenium Manager will auto detect the browser version
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //to ask the browser to wait for a element and then move to the next as soon as it is available
		driver.get("https://eu.astrautm.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		/*
		 
		 -->Type of Locators:
		 1. id --> attribute name will be "id"
		 2. name --> attribute name will be "name"
		 3. class name --> attribute name will be "class" //if there is a space between value then give any 1 value
		 4. tag name --> attribute name will be "id"
		 5. link text
		 6. partial link text
		 7. css selector --> we can build this locator
		 8. xpath --> we can build this locator
		 
		 <input id="emailid" type="text" class="form-control" name="UserName" autocomplete="off" readonly="" onfocus="this.removeAttribute('readonly')">
		
		 -->In the above HTML code 
		 1. input --> is the tag name
		 2. id --> is the attribute
		 3. emailid --> is the attribute value
		 
		 -->CSS Selector
		 1. class name --> tagname.classname    			input.form-control
		 2. id --> tagname#id                   			input#emailid
		 3. cssSelector --> tagname[attribute='value']		input[type='text']
		 4. Traverse --> parenttagname childtagname[1]  --> ul li[1]
		 5. RegularExpression --> tagname[attribute*='value'] --> input[type*='text']
		 6. Tagname --> input
		 
		 -->XPath
		 1. //tagname[@attribute='value'] -->  //input[@autocomplete='off']
		 2. Traverse --> //parenttagname/childtagname[1]  --> //ul/li[1]
		 3. RegularExpression --> tagname[contains(@type,'text')]
		 4. Tagname --> //input
		
	 	 -->To check the uniqueness of the attribute
		 1. SelectorsHub
		 2. Chropath
		 3. Manually via Console for cssSelector
			3.1 $('cssSelector') -->	$('div#loginerror')
			3.2 $('cssSelector') -->	$('div#loginerror':nth-child(1))		//by using indexing method

		 4. Manually via console for XPath
			4.1 $x('XPath') -->  $x('//input[@type="email"]')       //cannot enter single quote inside single quote so make it double quotes
			4.2 $x('XPath') -->  $x('//input[@type="email"][1]')	//by using indexing method
			
			
			
		*/
		
		driver.findElement(By.id("emailid")).sendKeys("hungarocontrol.admin");
		driver.findElement(By.name("password")).sendKeys("Admin@1234*");
		driver.findElement(By.className("view-icon")).click();
		driver.findElement(By.id("btnLgnSubmit")).click();
		System.out.println(driver.findElement(By.cssSelector("div#loginerror")).getText()); //to get the text and display in the console
		driver.findElement(By.name("password")).clear();
		//driver.findElement(By.cssSelector("a[href='/up/forgot-password']")).click();
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("scott@yopmail.com");
		//driver.findElement(By.linkText("/up/forgot-password")).click(); //not working
		driver.findElement(By.name("password")).sendKeys("G!1j@2A#3d$4");
		driver.findElement(By.className("login-btn")).click();
		//driver.findElement(By.xpath("(//span[normalize-space()='Drone Flight Requests'])[1]")).click();
		//driver.findElement(By.xpath("(//div/ul/li[3]/a/span[2]")).click();
		//driver.findElement(By.linkText("/up/flight-list/fa265f7f-fe6b-408b-ac6c-fce4a4a81bc6")).click();
		//driver.close();

	}

}
