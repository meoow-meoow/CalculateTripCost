package tripAdvisor;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class LiftAccess {
	public static void select(WebDriver driver) throws Exception {
		//create property file object and import file
		Properties prop =new Properties();
		InputStream input= new FileInputStream("C:\\Users\\ankit\\Workspace\\CalculateTripCost\\src\\tripAdvisor\\config.properties");
		prop.load(input);
		JavascriptExecutor js=(JavascriptExecutor)driver; //to execute javascript
		js.executeScript("window.scrollBy(0, 1000)"); //scroll down
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Implicit wait for synchronization
		driver.findElement(By.cssSelector(prop.getProperty("ammen"))).click(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Implicit wait for synchronization
		driver.findElement(By.xpath(prop.getProperty("lift"))).click(); //click on check-box for lift access
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Implicit wait for synchronization
		js.executeScript("window.scrollBy(0,-1000)"); //scroll up
	}

}
