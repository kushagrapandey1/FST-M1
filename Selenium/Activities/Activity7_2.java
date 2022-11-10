import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println("Title of the page: "+driver.getTitle());
		
		driver.findElement(By.xpath("//input[contains(@class,'-username')]")).sendKeys("Prajkta");
		driver.findElement(By.xpath("//input[contains(@class,'-password')]")).sendKeys("Prajkta@123");
		driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input")).sendKeys("Prajkta@123");
		driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input")).sendKeys("Prajkta@mail.com");
		
        //Click Sign Up
		
        //driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		//Print login message
		String Msg= driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
		
		System.out.println("Login Message: "+Msg);
		
		}

}
