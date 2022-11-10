import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("Title of the page: "+driver.getTitle());
		
		driver.findElement(By.id("prompt")).click();
		
		Alert promptAlert=driver.switchTo().alert();
		
		Thread.sleep(60);
		
		//Get text in the prompt box and print it
		System.out.println("Alert text is: "+promptAlert.getText());
		
		//Type "Yes, you are!" into the prompt
		promptAlert.sendKeys("Yes, you are!");
		
		//close the alert
		promptAlert.accept();
		
		driver.quit();
		
		
	}

}
