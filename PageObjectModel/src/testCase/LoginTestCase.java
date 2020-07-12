package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;

public class LoginTestCase {

	@Test
	public void login() {
		
		System.setProperty("Webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://localhost:81/orangehrm/symfony/web/index.php/pim/viewEmployeeList");
		
		
		/*LoginPageObjects.username(driver).sendKeys("txtUsername");
		LoginPageObjects.password(driver).sendKeys("txtPassword");
		LoginPageObjects.loginButton(driver).click();
		*/
		PageFactory.initElements(driver, LoginPageObjects.class);
		LoginPageObjects.username.sendKeys("admin");
		LoginPageObjects.password.sendKeys("admin123");
		LoginPageObjects.loginButton.click();
		
		
		
		/*WebElement userName = driver.findElement(By.name("txtUsername"));
		
		userName.sendKeys("admin");
		
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement loginButton =driver.findElement(By.name("Submit"));
		
		loginButton.click();
		
		driver.quit();*/
		
			
	
		
	}

}
