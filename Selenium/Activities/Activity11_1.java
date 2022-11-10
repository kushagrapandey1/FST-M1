import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("Title of the page: "+driver.getTitle());
		
		//Click the button to open a simple alert
		driver.findElement(By.cssSelector("button#simple")).click();
		
		//switch to alert window
		Alert simpleAlert=driver.switchTo().alert();
		
		//get alert msg and print it out
		String alertText=simpleAlert.getText();
		System.out.println("Alert msg: "+alertText);
		
		//accept the alert
		simpleAlert.accept();
		
	}

}
