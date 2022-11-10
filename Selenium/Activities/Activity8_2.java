import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/tables");
        
		//Get columns
		
        //List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));
		List<WebElement> cols=driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
		
		//Get Rows
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
		
		System.out.println("Number of column: "+cols.size());
		System.out.println("Number of Rows: "+rows.size());
		
		//Find and print the cell value at the second row and second column.
		WebElement cellValueBefore=driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println("2 Row 2 column cell value before sort: "+cellValueBefore.getText());
		
		//Click the header of the first column to sort by name.
		driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[1]")).click();
		
		//Print the value again
		WebElement cellValueAfter=driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println("2 Row 2 column cell value after sort: "+cellValueAfter.getText());
		
		//Print cell value of footer
		WebElement footerValue=driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
		System.out.println("Footer Cells value: "+footerValue.getText());
	
		driver.quit();
		 

	}

}
