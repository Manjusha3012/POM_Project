package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashBoardPage {

	WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;

	}

	// Element List
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")
	WebElement DashBoard_Header_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a/span[1]") WebElement CUSTOMER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") WebElement ADD_CUSTOMER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a") WebElement LIST_CUSTOMER_ELEMENT;
	

	public void varifyDashboardHeader() {

		Assert.assertEquals("Wrong Page!!", "Dashboard", DashBoard_Header_Element.getText());
	}

	public void clickCustomerButton() {
		CUSTOMER_ELEMENT.click();
	}
	
	public void clickAddCustomerButton() {
		ADD_CUSTOMER_ELEMENT.click();
	}

}

//HERE IN DASHBORAD WE HAVE ALL THE ELEMENTS AND METHODS OF THE DASHBOARDPAGE TO USE IN TESTING PURPOSE FOR 
//DASHBOARDPAGE