package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyInfoPageObjets {
    @FindBy(xpath="//*[@id=\'menu_pim_viewMyDetails\']/b")
	public static WebElement myinfo;
    @FindBy(xpath="//*[@id=\"sidenav\"]/li[5]/a")
	public static WebElement immigrationbutton;
    @FindBy(xpath="//*[@id=\"btnAdd\"]")
	public static WebElement addButton;
    @FindBy(xpath="//*[@id=\"immigration_number\"]")
	public static WebElement numberTextBox;
    @FindBy(xpath="//*[@id=\"btnSave\"]")
	public static WebElement saveButton;

	/*public static WebElement myinfo(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'menu_pim_viewMyDetails\']/b"));
		
	}

	public static WebElement immigrationbutton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'sidenav\']/li[5]/a"));
		
	}

	public static WebElement addButton(WebDriver driver) { 
		return driver.findElement(By.xpath("//*[@id=\'btnAdd\']"));
		
	}

	public static WebElement numberTextBox(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'immigration_number\']"));
	
	}

	public static WebElement saveButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'btnSave\']"));
		

	}*/
}
