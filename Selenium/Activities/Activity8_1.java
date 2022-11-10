import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/tables");
		List<WebElement> cols=driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[1]/td"));
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr"));
		
		System.out.println("Number of column: "+cols.size());
		System.out.println("Number of Rows: "+rows.size());
		
		//Find and print the all the cell values of the third row of the table.
		List<WebElement> thirdRow=driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[3]/td"));
		for(WebElement cellValue : thirdRow) {
			System.out.println("Cell Value: "+cellValue.getText());
		}
		
		//Find and print the cell value at the second row and second column.
		List<WebElement> secRow2Col = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[2]/td[2]"));
		
		for(WebElement cell:secRow2Col){
			System.out.println("Value at the second row and second column: "+cell.getText());
		}
		driver.quit();
		
	}

}
