package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

	public static void main(String[] args) {
		
		//for imports =ctrl+shift+o;
		
		WebDriver driver = new ChromeDriver();   //Creation of driver instance
		driver.manage().window().maximize();     //maximize window
		
		driver.get("https://www.flipkart.com/"); // opening an URL
		 
		String title=driver.getTitle();          // Grab title
		
		System.out.println(title);          
		
		driver.navigate().back();                //navigating backward direction
		
		driver.navigate().forward();             //navigating forward direction
		
		driver.quit();                           // closing entire browser	

	}
	
	

}
