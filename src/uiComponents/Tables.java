package uiComponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();   
		driver.manage().window().maximize();     
		
		driver.get("https://selenium.qabible.in/table-pagination.php");
		
	    List<WebElement> elementsList = driver.findElements(By.xpath("//*[@id='dtBasicExample']/tbody/tr[4]/td"));

	   System.out.println( elementsList.size());
	   
	   for(WebElement element: elementsList) {
		   System.out.println(element.getText());
	   }
	   
	
	    driver.quit();
	    
	}

}
