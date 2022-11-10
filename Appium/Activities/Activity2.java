package Android;

import java.net.MalformedURLException;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


	public class Activity2 {
	    // Driver Declaration
	    AndroidDriver driver;
	    WebDriverWait wait;

	    // Set up method
	    @BeforeClass
	    public void setUp() throws MalformedURLException {
	        // Desired Capabilities
	        UiAutomator2Options options = new UiAutomator2Options();
	        options.setPlatformName("android");
	        options.setAutomationName("UiAutomator2");
	        options.setAppPackage("com.android.chrome");
	        options.setAppActivity("com.google.android.apps.chrome.Main");
	        options.noReset();

	        // Server Address
	        URL serverURL = new URL("http://localhost:4723/wd/hub");

	        // Driver Initialization
	        driver = new AndroidDriver(serverURL, options);
	        
	        // Open the page in Chrome
	        driver.get("https://www.training-support.net/");
	    }

	    // Test method
	    @Test
	    public void chromeTest() {
	    	//implicit wait
	    	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	//explicit wait
	    	wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	        // Find heading on the page
	    	
	       /* String pageHeading = driver.findElement(AppiumBy.xpath("//android.view.View[@text()='Training Support']")).getText();
	        
	        // Print to console
	        System.out.println("Heading: " + pageHeading);*/
	    	WebElement headingAvail = driver.findElement(AppiumBy.xpath("//android.view.View[@text='Training Support']"));
	    	wait.until(ExpectedConditions.visibilityOf(headingAvail));


	    	//Locate the heading on the page and print it to console.
	    	String heading = headingAvail.getText();
	    	System.out.println("Page heading is: "+heading);

	        // Find and click the About Us link
	        WebElement aboutlink= driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id='about-link']"));
	        wait.until(ExpectedConditions.visibilityOf(aboutlink)).click();
	        // Find heading of new page and print to console
	        String aboutPageHeading = driver.findElement(AppiumBy.xpath("//android.view.View[@text()='About Us']")).getText();
	        System.out.println(aboutPageHeading);
	    }


	    // Tear down method
	    @AfterClass
	    public void tearDown() {
	        // Close the app
	        driver.quit();
	    }
	}

