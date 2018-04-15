package restful_functional_test.restful_booker;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import browserUtility.testBase;

public class Tc_createEntry extends testBase{
	
  WebDriver driver;
  String Url = "http://localhost:3003/#/";
  testBase base = new testBase();
  createEntry_pageObject hotelPage = new createEntry_pageObject(driver);
  
  
  
  @BeforeMethod()
  public void StartApp()
  {
	System.out.println(" ====== browser loading ====");
    base.setBrowser("chrome");
    base.getUrl(Url);
    System.out.println(" ====== Open App url  ====");
  }
	
  @Test
  public void tc_addEntry() {
	  System.out.println(" ====== start test entry  ====");
	  hotelPage.login("admin", "password");
      hotelPage.addEntry("Hilton", "345 Hilton road ", "Sahbzy", "09876542343", "shabzy@gmail.com");
	  // assert entry created 
	  System.out.println(" ====== end test ====");
  }
  
  
  @Test
  public void tc_deleteEntry()
  {
   System.out.println(" ====== start deleteing entry  ===="); 
   hotelPage.deleteEntry("Hilton");
   System.out.println(" ====== start deleteing entry  ====");
  }
  
  
  @Test
  public void tc_multipleEntry()
  {
	  System.out.println(" ====== start start multiple  ====");
	  
	 
	  
  }

  
  @AfterMethod
  public void tearDown()
  {
	 driver.quit();
	 System.out.println(" ====== close broswser ====");
  }
  
}
