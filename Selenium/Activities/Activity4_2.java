import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity4_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		String title = driver.getTitle();
		System.out.println("Title of the page is " + title);
		driver.findElement(By.xpath("//input[@id = 'firstName']")).sendKeys("peter");
		driver.findElement(By.xpath("//input[@id = 'lastName']")).sendKeys("lawrence");
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("petelawrence@email.com");
		driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("9878676543");
		driver.findElement(By.xpath("//input[@value = 'submit']")).click();
		driver.quit();
	}

}
