package pageFactoryWithoutAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
@Test
public class LoginWithoutFindBy {
		
	public static WebElement txtUsername;
	public static WebElement txtPassword;
	public static WebElement btnLogin;
	
	public void login() throws InterruptedException {
	System.setProperty("WebDriver.Chrome.Driver", "D:\\drivers\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost:81/orangehrm/symfony/web/index.php/pim/viewEmployeeList");
PageFactory.initElements(driver, LoginWithoutFindBy.class);
Thread.sleep(2000);
	txtUsername.sendKeys("admin");
	txtPassword.sendKeys("admin1");
	btnLogin.click();
	
	
}
	
}
