package fitpeo_Selenium;

import java.awt.Desktop;
import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/* IDE used - "Eclipse"
 * Wed Browser used - "Ms Edge".
 * Automation tool used - "Selenium-Java".
 * Tool used to show result files - "ExtentReports".
 * to increase code reuability "Reusable functions" are used.
 * ------Steps to Execute this script-------
 * -> Use any IDE i.e Eclipse or IntelliJ 
 * -> import the Source file to IDE
 * -> make sure POM consists of all the dependencies
 * -> Maven install clean and build the project
 * -> run the main class "Test_Reimbursement.java"
 * -> Make sure device is connected with proper internet connection to avoid connection socket exception */

//------------Alternative methods to impliment this script----------//
/*This script can be implemented using TestNG frame work for better functinal based testing.
 * BDD framework can be implemented for better understanding of Testcases and Scenarios for clients and end users by using "Cucumber". */

public class Test_Reimbursement extends Reusable {

	public static void main(String[] args) throws Exception {
		Reusable reuse = new Reusable();
		 ExtentReports extentReports = new ExtentReports();
			File file = new File("reports.html");
			ExtentSparkReporter sparkReportes = new ExtentSparkReporter(file);
			extentReports.attachReporter(sparkReportes);
		
		try {
		// opening browser and navigating to Fitpeo homepage
			
			Reusable.Browser();
			sparkReportes.config().setTheme(Theme.DARK);
			sparkReportes.config().setReportName("Fitpeo_Reimbursement_functinality_reports");
			System.out.println("Browser opened successfully");
			extentReports
			.createTest("Homepage", "Browser opened successfully")
			.pass("This test is passed")
			.addScreenCaptureFromPath(reuse.CaptureScreenShot("Homepage.jpg"),"Screenshot after Browser navigated to Homepage");
			
		// navigating to revenue calculator button.
			WebElement Revenue_Calculator = driver.findElement(By.xpath("//div[contains(text(),'Revenue Calculator')]"));
			reuse.waitHandler(driver, 10);
			Revenue_Calculator.click();
			extentReports
			.createTest("Revenue_Calculator", "Revenue_Calculator button is clicked as expected")
			.pass("This test is passed")
			.addScreenCaptureFromPath(reuse.CaptureScreenShot("Revenue_Calculator.jpg"),"Screenshot after clicked on Revenue_Calculator");

		// locating the revenue calculator slider
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement slider = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-6 css-l0ykmo']")));
			js.executeScript("arguments[0].scrollIntoView(true);", slider);
			extentReports
			.createTest("slider", "slider is visible")
			.pass("This test is passed")
			.addScreenCaptureFromPath(reuse.CaptureScreenShot("slider.jpg"),"Screenshot after slider is visible");
			

		// Adjusting the slider to 820 value
			WebElement Slider = driver.findElement(By.xpath("//span[@class='MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-1sfugkh']"));
			Actions actions = new Actions(driver);
		// setting slider to 820---slider is not responding for 820
			actions.clickAndHold(Slider).moveByOffset(94, 0).release().perform();
			extentReports
			.createTest("Slider", "Slider is unable to set to 820")
			.fail("This test is Failed")
			.addScreenCaptureFromPath(reuse.CaptureScreenShot("Slider.jpg"),"Slider is unable to set to 820");
			reuse.waitHandler(driver, 10);

		//validating slider and slider_Text_Field value
			WebElement sliderValueField = driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']"));
			String slider_Text_Field_Value = sliderValueField.getAttribute("value");
			System.out.println(slider_Text_Field_Value);

			if (slider_Text_Field_Value == "820") {
				System.out.println("Slider Adjusted to 820 successfully.");
				extentReports
				.createTest("slider_Text_Field_Value", "slider_Text_Field_Value value is as expected i.e 820")
				.pass("This test is passed")
				.addScreenCaptureFromPath(reuse.CaptureScreenShot("slider_Text_Field_Value.jpg"),"slider_Text_Field_Value as expected");
			} else {
				extentReports
				.createTest("slider_Text_Field_Value", "slider_Text_Field_Value is not matching with expected value i.e 820")
				.fail("This test is failed")
				.addScreenCaptureFromPath(reuse.CaptureScreenShot("slider_Text_Field_Value.jpg"),"slider_Text_Field_Value not as expected");
			
			}


		// update the text field to 560
			String value = sliderValueField.getAttribute("value");
			for(int i = 0; i<value.length(); i++) {
				sliderValueField.sendKeys(Keys.BACK_SPACE);
			}
			reuse.waitHandler(driver, 10);
			sliderValueField.sendKeys("560");
			String updatedSliderValue = sliderValueField.getAttribute("value");
			System.out.println(updatedSliderValue);
			reuse.waitHandler(driver, 10);
			if (updatedSliderValue.equals("560")) {
				extentReports
				.createTest("updatedSliderValue", "updatedSliderValue is as expected i.e 560")
				.pass("This test is passed")
				.addScreenCaptureFromPath(reuse.CaptureScreenShot("updatedSliderValue.jpg"),"updatedSliderValue is as expected");
			} else {
				extentReports
				.createTest("updatedSliderValue", "updatedSliderValue is not as expected i.e 560")
				.fail("This test is failed")
				.addScreenCaptureFromPath(reuse.CaptureScreenShot("updatedSliderValue.jpg"),"updatedSliderValue is not as expected");			}
			
			reuse.waitHandler(driver, 10);
			
			
		// Select CPT Codes
			js.executeScript("window.scrollBy(0,300);");
			reuse.waitHandler(driver, 10);
			WebElement CPT99091checkBox = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/label/span[1]/input"));
			CPT99091checkBox.click();
			extentReports
			.createTest("CPT99091checkBox", "CPT99091checkBox is clicked as expected")
			.pass("This test is passed")
			.addScreenCaptureFromPath(reuse.CaptureScreenShot("CPT99091checkBox.jpg"),"CPT99091checkBox is clicked");
			
			reuse.waitHandler(driver, 10);
			js.executeScript("window.scrollBy(0,300);");
			WebElement CPT99453checkBox = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/label/span[1]/input"));
			CPT99453checkBox.click();
			extentReports
			.createTest("CPT99453checkBox", "CPT99453checkBox is clicked as expected")
			.pass("This test is passed")
			.addScreenCaptureFromPath(reuse.CaptureScreenShot("CPT99453checkBox.jpg"),"CPT99453checkBox is clicked");
			
			js.executeScript("window.scrollBy(0,300);");
			WebElement CPT99454checkBox = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[3]/label/span[1]/input"));
			reuse.waitHandler(driver, 10);
			CPT99454checkBox.click();
			extentReports
			.createTest("CPT99454checkBox", "CPT99454checkBox is clicked as expected")
			.pass("This test is passed")
			.addScreenCaptureFromPath(reuse.CaptureScreenShot("CPT99454checkBox.jpg"),"CPT99454checkBox is clicked");
			
			
			js.executeScript("window.scrollBy(0,300);");
			WebElement CPT99474checkBox = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[8]/label/span[1]/input"));
			reuse.waitHandler(driver, 10);
			CPT99474checkBox.click();
			extentReports
			.createTest("CPT99474checkBox", "CPT99474checkBox is clicked as expected")
			.pass("This test is passed")
			.addScreenCaptureFromPath(reuse.CaptureScreenShot("CPT99474checkBox.jpg"),"CPT99474checkBox is clicked");

		// validate Total Recurring Reimbursement
			WebElement reimbursementText = driver.findElement(By.xpath("//p[contains(text(),'Total Recurring Reimbursement for all Patients Per Month:')]/p"));
			reuse.waitHandler(driver, 10);
			String total_Recurring_Reimbursement = reimbursementText.getText();
			if (total_Recurring_Reimbursement.equals("$110700")) {
				extentReports
				.createTest("total_Recurring_Reimbursement", "total_Recurring_Reimbursement matches with $110700")
				.pass("This test is passed")
				.addScreenCaptureFromPath(reuse.CaptureScreenShot("total_Recurring_Reimbursement.jpg"),"total_Recurring_Reimbursement is matched with $110700");
			} else {
				extentReports
				.createTest("total_Recurring_Reimbursement", "total_Recurring_Reimbursement not matches with $110700")
				.fail("This test is failed")
				.addScreenCaptureFromPath(reuse.CaptureScreenShot("total_Recurring_Reimbursement.jpg"),"total_Recurring_Reimbursement is not matched with $110700");
						}
			
		} catch (Exception e) {
			System.out.println("Test failed: " + e.getMessage());
		} finally {
			extentReports.flush();
			driver.quit();
		}
		Desktop.getDesktop().browse(new File("reports.html").toURI());

	}
}






