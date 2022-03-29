package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.BasePage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	
	WebDriver driver;
	
	String userName = "demo@techfios.com" ;
	String password = "abc123";
	
	
	
	
	@Test
	public void validUserShouldBeAbleToCreateAccount() {
		
		
		driver=BrowserFactory.init();
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertUserName(userName);
		loginpage.insertPassword(password);
		loginpage.ckickSignIn();
		
		DashBoardPage dashboardpage = PageFactory.initElements(driver, DashBoardPage.class);
		dashboardpage.varifyDashboardHeader();
		dashboardpage.clickCustomerButton();
		dashboardpage.clickAddCustomerButton();
		
		AddCustomerPage addcustomerpage = PageFactory.initElements(driver, AddCustomerPage.class);
		 addcustomerpage.insertFullName("Manjusha");
		 addcustomerpage.insertCompany("Techfios");
		 addcustomerpage.insertEmail("abc@techfios.com");		
		 addcustomerpage.insertPhone("454676688");
		 addcustomerpage.insertCity("Plano");
		 addcustomerpage.insertAddress("PlanoCity");
		 addcustomerpage.insertState("Texas");
		 addcustomerpage.insertZip("75083");
		 addcustomerpage.insertSubmitButton();
		 
	
		BrowserFactory.tearDown();	
	
	}	
	
}
//HERE IN TEST PAGE WE HAVE ALL THE ELEMENTS WITH THE METHODS WE CALL FROM DIFFERENT PAGES TO USE 
//FOR OUR TESTING (LIKE HERE WE MAKE OBJECT OF DIFFERENT CLASS PAGES LIKE LOGINPAGE, DASHBOARDPAGE,ADDCUSTOMERPAGE)
//LASTLY WE CALL TEARDOWN FROM BROWSERFACTORY TO CLOSE ALL THE TABS AND QUIT TEST PAGE)