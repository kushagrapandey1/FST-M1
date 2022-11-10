import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.WebElement;
public class Activity3 {

	public static void main(String[] args) throws InterruptedException{
	//public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
        //Open the browser
        driver.get("https://training-support.net/selenium/simple-form");
        String title = driver.getTitle();
        System.out.println("Title of the page is " + title);
        driver.findElement(By.id("firstName")).sendKeys("dummyuserfn");
        driver.findElement(By.id("lastName")).sendKeys("dummyuserln");
        driver.findElement(By.id("email")).sendKeys("xyz@email.com");
        driver.findElement(By.id("number")).sendKeys("3277856438");
        driver.findElement(By.xpath("//input[@value = 'submit']")).click();
        //driver.findElement(By.xpath("//input[@value = 'submit']")).submit();
        Thread.sleep(200);
        driver.quit();
        
     
	}

}
