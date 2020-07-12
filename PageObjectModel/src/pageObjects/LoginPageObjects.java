package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {

	@FindBy(name="txtUsername")
	public static WebElement username;
	@FindBy(name="txtPassword")
	public static WebElement password;
	@FindBy(name="Submit")
	public static WebElement loginButton;
	
	/*public static WebElement username(WebDriver driver) { 
		return driver.findElement(By.name("txtUsername"));
	}
	
public static WebElement password(WebDriver driver) {
	return driver.findElement(By.name("txtPassword"));
	}

public static WebElement loginButton(WebDriver driver) {
	return driver.findElement(By.name("Submit"));
	
}
*/
}
