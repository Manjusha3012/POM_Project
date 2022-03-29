package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	
//login data
	String userName= "demo@techfios.com";
	String password= "abc123";
	
@Test
	public void validUserShouldBeLogin() {
		
		driver = BrowserFactory.init();
		
		
		LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.ckickSignIn();
			
		
		DashBoardPage dashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
		dashBoardPage.varifyDashboardHeader();
		
		
		BrowserFactory.tearDown();		
		
		
	}
		
//HERE IN TEST PAGE WE HAVE ALL THE ELEMENTS WITH THE METHODS WE CALL FROM DIFFERENT PAGES TO USE 
//FOR OUR TESTING (LIKE HERE WE MAKE OBJECT OF DIFFERENT CLASS PAGES LIKE LOGINPAGE, DASHBOARDPAGE ASSERTION)
//LASTLY WE CALL TEARDOWN FROM BROWSERFACTORY TO CLOSE ALL THE TABS AND QUIT TEST PAGE)
		
		
		
		
		
		
		
		
	

}
