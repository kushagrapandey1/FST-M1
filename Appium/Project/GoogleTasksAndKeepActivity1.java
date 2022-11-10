package AppiumProject1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

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

public class GoogleTasksAndKeepActivity1 { 
	AndroidDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setup() throws MalformedURLException {
		UiAutomator2Options options=new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.google.android.apps.tasks");
		options.setAppActivity(".ui.TaskListsActivity");
		options.noReset();
		
		 //Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");
	
        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(80));
        
	}
  @Test
  public void GoogleTask() {
	  List<String>li=new ArrayList<String>();
	  li.add("Complete Activity with Google Tasks");
	  li.add("Complete Activity with Google Keep");
	  li.add("Complete the second Activity Google Keep");
	  
	  wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.id("tasks_refresh_empty_scrollable")));
	  driver.findElement(AppiumBy.id("tasks_refresh_empty_scrollable")).click();
	  
	  for(int i=0;i<li.size();i++) 
	  {
		  
		  //wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("Tasks")));
		  //driver.findElement(AppiumBy.accessibilityId("Tasks")).click();
		  wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.accessibilityId("Create new task")));
		  driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
		  wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.id("add_task_title")));
		  driver.findElement(AppiumBy.id("add_task_title")).sendKeys(li.get(i));
		  driver.findElement(AppiumBy.id("add_task_done")).click();
		  /*String actual=driver.findElement(AppiumBy.xpath("//android.support.v7.widget.RecyclerView/android.widget.FrameLayout["+i+"]")).getText();
		  String expected=li.get(i);
		  Assert.assertEquals(actual, expected );*/
		  //Assert.assertTrue(driver.findElement(AppiumBy.xpath("//android.support.v7.widget.RecyclerView/android.widget.FrameLayout" + li.get(i) + "]")).isDisplayed());
		
		  //Write an assertion to ensure all three tasks have been added to the list.
	      wait.until(ExpectedConditions.visibilityOf(driver.findElement(AppiumBy.accessibilityId("My Tasks"))));
	      WebElement taskList = driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/tasks_list"));
	      boolean result = taskList.isDisplayed();
	      System.out.println(result);
	      Assert.assertTrue(result); 
		  
	  }
	
  }
  
  //Tear down method
  @AfterClass
  public void tearDown() {
	// Close the app
	  driver.quit();
  }
}
