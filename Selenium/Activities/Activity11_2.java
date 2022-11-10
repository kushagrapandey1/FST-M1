import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("Title of the page: "+driver.getTitle());
		
		driver.findElement(By.cssSelector("#confirm")).click();
		
		Alert confirmAlert=driver.switchTo().alert();
		
		System.out.println(confirmAlert.getText());
		
		//Close the alert with OK
		//confirmAlert.accept();
		
		//confirmAlert.dismiss();
		confirmAlert.dismiss();
		
		driver.quit();
				
	}

}
