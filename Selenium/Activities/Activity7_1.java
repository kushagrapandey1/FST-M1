import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println("Title of the page: "+driver.getTitle());
		
		//Find the username and password input fields
		WebElement UserName=driver.findElement(By.xpath("//input[starts-with(@class, 'username')]"));
		WebElement Password= driver.findElement(By.xpath("//input[starts-with(@class, 'password')]"));
		
		//Type credentials
		UserName.sendKeys("admin");
		Password.sendKeys("password");
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		String LoginMsg=driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
		System.out.println("Login Message: "+LoginMsg);
	
		

	}

}
