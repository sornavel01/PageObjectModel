package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import pageObjects.MyInfoPageObjets;

public class MyInfoTestCase {
	@Test
	public void immigration() throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:81/orangehrm/symfony/web/index.php/pim/viewEmployeeList");

		/*LoginPageObjects.username(driver).sendKeys("txtUsername");
		LoginPageObjects.password(driver).sendKeys("txtPassword");
		LoginPageObjects.loginButton(driver).click();*/
       
		PageFactory.initElements(driver, LoginPageObjects.class);
		LoginPageObjects.username.sendKeys("admin");
        LoginPageObjects.password.sendKeys("admin123");
        LoginPageObjects.loginButton.click();
      
        Thread.sleep(5000);
        PageFactory.initElements(driver, MyInfoPageObjets.class); 
        MyInfoPageObjets.myinfo.click();
        MyInfoPageObjets.immigrationbutton.click();
        Thread.sleep(2000);
        MyInfoPageObjets.addButton.click();
        MyInfoPageObjets.numberTextBox.sendKeys("7892");
        MyInfoPageObjets.saveButton.click();
        
        /*MyInfoPageObjets.myinfo(driver).click();
		MyInfoPageObjets.immigrationbutton(driver).click();
		MyInfoPageObjets.addButton(driver).click();
		MyInfoPageObjets.numberTextBox(driver).sendKeys("5674");
		MyInfoPageObjets.saveButton(driver).click();*/

		/*
		 * WebElement myInfo
		 * =driver.findElement(By.xpath("//*[@id=\'menu_pim_viewMyDetails\']/b"));
		 * myInfo.click();
		 * 
		 * WebElement immigrationbutton =
		 * driver.findElement(By.xpath("//*[@id=\'sidenav\']/li[5]/a"));
		 * immigrationbutton.click();
		 * 
		 * WebElement addButton = driver.findElement(By.xpath("//*[@id=\'btnAdd\']"));
		 * addButton.click();
		 * 
		 * 
		 * 
		 * WebElement numberTextBox =
		 * driver.findElement(By.xpath("//*[@id=\'immigration_number\']"));
		 * numberTextBox.sendKeys("1234");
		 * 
		 * 
		 * WebElement saveButton = driver.findElement(By.xpath("//*[@id=\'btnSave\']"));
		 * 
		 * saveButton.click();
		 */

	}
}
