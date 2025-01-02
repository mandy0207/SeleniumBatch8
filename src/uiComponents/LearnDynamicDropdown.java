package uiComponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnDynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();   
		driver.manage().window().maximize();     
		
		driver.get("https://selenium.qabible.in/jquery-select.php");
		
		driver.findElement(By.xpath("(//*[@class='selection']/span)[1]")).click();
		
		driver.findElement(By.xpath("//input[contains(@type,'search')]")).sendKeys("new");
		
		List<WebElement> states = driver.findElements(By.xpath("//*[contains(@class,'select2-results__options')]/li"));
		
		
		System.out.println(states.size());
		
		for(WebElement state : states) {
			if(state.getText().equalsIgnoreCase("New Jersey")) {
				state.click();
				break;
			}
		}
		
		driver.quit();

	}

}
