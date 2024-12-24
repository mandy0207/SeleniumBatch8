package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowsers {

	public static void main(String[] args) {
		
		String browser= "chrome";
		WebDriver driver= null;
		
		
		if(browser.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver(); 	
		}
		else if(browser.equalsIgnoreCase("firefox")) {
		driver = new FirefoxDriver(); 
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver(); 
		}
		else {
			System.out.println("Please choose correct diver");
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");	
		driver.quit();

	}

}
