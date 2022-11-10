//Goal: Use the Google Keep app to add a note.
package AppiumProject1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class GoogleKeepAppActivity2 {
	AndroidDriver driver;
	WebDriverWait wait;
	
	@BeforeClass()
	public void setup() throws MalformedURLException {
		UiAutomator2Options options=new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.google.android.keep");
		options.setAppActivity(".activities.BrowseActivity");
		options.noReset();
		
		//Server Address
		URL ServerURL=new URL("http://localhost:4723/wd/hub");
		
		//Driver Initialization
		
		driver=new AndroidDriver(ServerURL,options);
		wait=new WebDriverWait(driver,Duration.ofSeconds(70));
	}
	
	@Test
	public void googleKeepTask() {
		//Click the Create New Note button to add a new Note.
		wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("New text note")));
		driver.findElement(AppiumBy.accessibilityId("New text note")).click();
		
		//Add a title for the note and add a small description.
		driver.findElement(AppiumBy.id("com.google.android.keep:id/backdrop")).click();
		driver.findElement(AppiumBy.id("com.google.android.keep:id/editable_title")).sendKeys("This is Title of Note");
		
		driver.findElement(AppiumBy.id("com.google.android.keep:id/edit_note_text")).sendKeys("trying to add description");
		//Press the back button and make an assertion to ensure that the note was added.
		
		driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(AppiumBy.id("com.google.android.keep:id/open_search_bar_text_view"))));

        WebElement note = driver.findElement(AppiumBy.id("com.google.android.keep:id/browse_note_interior_content"));
        Assert.assertTrue(note.isDisplayed());
		
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}

}
