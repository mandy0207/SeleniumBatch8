package uiComponents;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWaits {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();   
		driver.manage().window().maximize();     
		driver.get("https://selenium.qabible.in/dynamic-load.php");
		driver.findElement(By.id("save")).click();
		/**
		 * Implicit Wait
		 * 1. Global Wait - we are declaring it once and automatically applied to each and every element.
		 * 2. Even if element is shown before implicit wait timing it will resume execution.
		 * 
		 */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));  
		String name=driver.findElement(By.xpath("//*[@class='card-title']")).getText(); 
		
		System.out.println(name);
	
		driver.findElement(By.id("progress-bars")).click();
		driver.findElement(By.id("downloadButton")).click();
		
		
		//Explicit Wait - explicit to behavior of webelement
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@class='progress-label']"), "Complete!"));
		
		driver.findElement(By.xpath("//*[@class='ui-dialog-buttonset']/button")).click();
		driver.quit();
		

	}

}
