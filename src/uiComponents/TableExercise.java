package uiComponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExercise {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();   
		driver.manage().window().maximize();     
		
		driver.get("https://selenium.qabible.in/table-pagination.php");
		
	    List<WebElement> rows = driver.findElements(By.xpath("//*[@id='dtBasicExample']/tbody/tr"));
	    
	    for(int i =0;i<rows.size();i++) {
	    	System.out.println(rows.get(i).getText());
//	    	List<WebElement> rowData = rows.get(i).findElements(By.xpath("td"));
//	    	rowData.forEach(element->{
//	    		System.out.print(element.getText());
//	    	});
//	    	
//	    	System.out.println();
	    }
	    
	    driver.quit();

	}
	
	

}
