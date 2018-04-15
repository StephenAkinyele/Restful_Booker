/**
 * 
 */
package restful_functional_test.restful_booker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author stephenakinyele
 *
 */
public class createEntry_pageObject {

	   WebDriver driver;
	// ===== login link text elements 
		@FindBy( how=How.LINK_TEXT, using="loginlink")
		WebElement loginlink;
		
		// modal webelemt here 
		@FindBy(how=How.ID, using="loginModal")
		WebElement modal;
		// ==== where login modal element start ========
		@FindBy( how=How.ID, using="username")
		WebElement eUsername;
		
		// this find element password input field
		@FindBy( how=How.ID, using="password")
		WebElement ePassword;
		
		// this find create button
		@FindBy( how=How.ID, using="login")
		WebElement loginButton;
		
		//====== where the elements for hotel entry start ====//
		@FindBy( how=How.ID, using="hotelname")
		WebElement enterHotel;
		
		@FindBy( how=How.ID, using="address")
		WebElement enterAddress;
		
		@FindBy( how=How.ID, using="owner")
		WebElement enterOnwner;
		
		@FindBy( how=How.ID, using="phone")
		WebElement enterPhone;
		
		@FindBy( how=How.ID, using="email")
		WebElement enterEmail;
		
		@FindBy( how=How.ID, using="create")
		WebElement createButton;
		//======= end the elements =====
		
		@FindBy( how=How.CLASS_NAME, using="hotelDelete")
		WebElement hotelDelete;
		
		@FindBy(how=How.ID, using="search")
		WebElement search;

	
		// ===== constructor class for using pageFactory ========
	public createEntry_pageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void login(String username, String password )
    {
    	   // click on login button
    	   this.loginlink.click();// clicks on the login link 
    	   driver.switchTo().frame(modal); // switch window to the frame 
    	   this.eUsername.sendKeys(username);// enter username 
    	   this.ePassword.sendKeys("password"); //enter passsword
    	   this.loginButton.click(); //  click on login button 
    	   // assert user login 
    }
    
    public void addEntry(String hotelname, String address, String owner, String phone, String email)
    {
    	//Create Entry
    	   this.enterHotel.sendKeys(hotelname);
    	   this.enterAddress.sendKeys(address);
    	   this.enterOnwner.sendKeys(owner);
    	   this.enterPhone.sendKeys(phone);
    	   this.enterEmail.sendKeys(email);
    	   this.createButton.click();
    	   // assert the an entry was made 
    }
    
    public void deleteEntry(String searchByname) {
    	  // on the home page 
    	 
     	this.search.sendKeys(searchByname);
    	    this.hotelDelete.click();
    	    //assert that entry is deleted e.g hotelname
    	   
    }

   
	
	
	
	
	
	
	
	
	
	
	

}
