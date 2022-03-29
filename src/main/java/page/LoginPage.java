package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		
	}
	//Element list
	
//	WebElement userNameElement= driver.findElement(By.xpath("//*[@id=\"username\"]"));
//	By userNameFeild =By.xpath("//*[@id=\"username\"]");
	//---WE DO NOT USE BY OR WEBELEMENT TO USE OR CALL THE XPATH FOR THIS FRAMEWORK
	
//	
	@FindBy(how= How.XPATH,using ="//*[@id=\"username\"]") WebElement USERNAME_ELEMENT;
	@FindBy(how= How.XPATH,using ="//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy(how= How.XPATH, using ="/html/body/div/div/div/form/div[3]/button") WebElement SignIN_ELEMENT;
	//TO CALL AND USE THE ELEMENT WE USE THIS KIND OF STATEMENT TO RUN THE XPATH FOR THIS KIND OF THE
	//FRAMEWORK
	
	public void insertUserName(String userName) {
		USERNAME_ELEMENT.sendKeys(userName);
		
	}
	
	
	public void insertPassword(String Password) {
		PASSWORD_ELEMENT.sendKeys(Password);
		
		
	}
 
	public void ckickSignIn() {
	SignIN_ELEMENT.click();

	}
	
}
// WE HAVE EVERYTHING ALL THE ELEMENTS AND ALL THE METHODS REGARDING TO THIS LOGINPAGE