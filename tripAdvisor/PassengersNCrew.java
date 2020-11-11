package tripAdvisor;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PassengersNCrew {
	public static void fromNextTab(WebDriver driver) throws Exception{
		//create property file object and import file
		Properties prop =new Properties();
		InputStream input= new FileInputStream("C:\\Users\\ankit\\Workspace\\CalculateTripCost\\src\\tripAdvisor\\config.properties");
		prop.load(input);
		JavascriptExecutor js = (JavascriptExecutor) driver; //to execute javascript
		//Actions actions = new Actions(driver);

	Set<String> allWindows = driver.getWindowHandles();//Creates a set and stores all GUID in it
	ArrayList<String> tabs= new ArrayList<>(allWindows);   
	driver.switchTo().window(tabs.get(1)); //switching control to newly opened tab
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e5) { //wait for synchronization
		
		e5.printStackTrace();
	}
	js.executeScript("window.scrollBy(0,350)", ""); //scroll down
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e5) { //wait for synchronization
		
		e5.printStackTrace();
	}
	String display= driver.findElement(By.xpath(prop.getProperty("number"))).getText();
	System.out.println(display);
	}
}