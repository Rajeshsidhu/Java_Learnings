package fitpeo_Selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reusable {

	public static  WebDriver driver ;
	public WebDriverWait wait;

//	public static WebDriver driver = null;

	public static void Browser() {
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://fitpeo.com");

	}
	//method for explicit wait
	public void waitHandler(WebDriver driver, int timeoutInSeconds) {
//		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
		
	}
	//method for wait until element is clickable
	public WebElement waitForEelemntToBeClickable(By locator) {
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
		
	}
	//method for screenshot
	public String CaptureScreenShot(String fileName) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/"+fileName+"");
		try {
			FileUtils.copyFile(sourceFile, destFile);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		return destFile.getAbsolutePath();
		
	}
	
	public static void takeScreenshot(WebDriver driver, String destination) {
		String timestamp = new SimpleDateFormat("yyyymmdd_hhmmss").format(new Date());
		
		String filePath = destination +"/screenshot_" + timestamp + ".png";
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File(filePath));
			System.out.println("Screenshot saved at: " + filePath);
		}catch(IOException e){
			System.out.println("Error while saving the screenshot: " + e.getMessage());
			
		}
		
	}

	}

