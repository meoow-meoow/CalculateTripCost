package tripAdvisor;

import java.io.FileInputStream;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SetDate {
	//method to get local date in format EEE MMM dd yy
public static String setDate(int incr) {
		
		LocalDate c = LocalDate.now(); 
		c=c.plusDays(incr);
		String finalDate = c.format(DateTimeFormatter.ofPattern("EEE MMM dd yy"));
		return finalDate;
		}
public static void Date(WebDriver driver) throws Exception{
	//create property file object and import file
	Properties prop =new Properties();
	InputStream input= new FileInputStream("C:\\Users\\ankit\\Workspace\\CalculateTripCost\\src\\tripAdvisor\\config.properties");
	prop.load(input);
	try{
		//selecting check-in and check-out dates for 5 days
	driver.findElement(By.xpath(prop.getProperty("Date"))).click();	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //adding timeout to synchronize the code
	String inDate=setDate(1);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // adding timeout to synchronize the code
	driver.findElement(By.xpath("//div[contains(@aria-label,'"+inDate+"')]")).click(); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //adding timeout to synchronize the code
	String outDate=setDate(6);
	driver.findElement(By.xpath("//div[contains(@aria-label,'"+outDate+"')]")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //adding timeout to synchronize the code
	} catch(Exception e) {
	System.out.println("Survey Popup"); //try catch block to handle survey
		}
	}
}



