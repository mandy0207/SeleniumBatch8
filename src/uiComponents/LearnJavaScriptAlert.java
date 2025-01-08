package uiComponents;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnJavaScriptAlert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.findElement(By.xpath("//*[@class='card-body']/button")).click();
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		//grab text of alert
		String alertText=alert.getText();
		System.out.println(alertText);
		
		//accept alert
		alert.accept();
		
		driver.findElement(By.className("btn-warning")).click();
		//to dismiss or cancel alert
		alert.dismiss();
		
		driver.findElement(By.className("btn-danger")).click();
		
		//use sendkeys to send text
		alert.sendKeys("Hello Bindu How are you !");
		
		alert.accept();
		

	}

}
