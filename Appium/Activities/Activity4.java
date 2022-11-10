package Android;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity4 {
	AndroidDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setup() throws MalformedURLException {
        //Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.contacts");
        options.setAppActivity(".activities.PeopleActivity");
        options.noReset();
        
        //Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");
	
        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
  
  @Test
  public void contactsTest() {
      // Find and click the add button
	  wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.id("floating_action_button_container")));
      driver.findElement(AppiumBy.id("floating_action_button_container")).click();
	
      // Wait for elements to load
      wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.EditText[@text='Name']")));
	
      // Enter the details
      driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Name']")).sendKeys("AadityaAppium");
      //driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Last name']")).sendKeys("Varma");
	  driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Phone']")).sendKeys("999148292");
	
      // Click Save
      driver.findElement(AppiumBy.id("com.android.contacts:id/menu_save")).click();
	
      // Wait for contact to save
      wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.android.contacts:id/large_title")));
	
      // Assertion
      String contactName = driver.findElement(AppiumBy.id("com.android.contacts:id/large_title")).getText();
      System.out.println("Contact Name: " +contactName);
      Assert.assertEquals(contactName, "AadityaAppium");
  }
	
  // Tear down method
  @AfterClass
  public void tearDown() {
      // Close the app
      driver.quit();
  }
}
