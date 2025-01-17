package uiComponents;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
	
		File destFile = new File(System.getProperty("user.dir")+"\\Screenshots\\"+"screenshot"+getCurrentDateTime()+".png");
		
		FileUtils.moveFile(srcFile, destFile);
		
		driver.quit();
	
	}
	
	public static String getCurrentDateTime() {
		 String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
		 System.out.println(date);
	      return date.replaceAll(":", "");   
	}
	
	

}
