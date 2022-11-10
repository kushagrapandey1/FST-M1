package FST_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		driver=new FirefoxDriver();
		
		//open browser
		driver.get("https://www.training-support.net/selenium/login-form");  
	}
    @Test
    public void loginTest() throws InterruptedException {
	
        //Find the username and password fields
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
	
        //Enter credentials
        username.sendKeys("admin");
        password.sendKeys("password");
	
        //Click login
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Thread.sleep(20);
        //Read login message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals("Welcome Back, admin", loginMessage);
	
    }
    @AfterClass
  	public void afterclass() {
	  driver.quit();
    }
}
